package com.qnit18.profile.controller;

import com.qnit18.profile.dto.request.UserProfileCreateRequest;
import com.qnit18.profile.dto.response.UserProfileResponse;
import com.qnit18.profile.entity.UserProfile;
import com.qnit18.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("/users")
public class UserProfileController {

    UserProfileService userProfileService;

    @PostMapping()
    UserProfileResponse createUserProfile(@RequestBody UserProfileCreateRequest request){
        return userProfileService.createProfile(request);
    }

    @GetMapping("/{profileId}")
    UserProfileResponse getUserProfile(@PathVariable String profileId){
        return userProfileService.getProfile(profileId);
    }

}

package com.qnit18.profile.mapper;

import com.qnit18.profile.dto.request.UserProfileCreateRequest;
import com.qnit18.profile.dto.response.UserProfileResponse;
import org.mapstruct.Mapper;
import com.qnit18.profile.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileCreateRequest request);

    UserProfileResponse toUserProfileResponse(UserProfile entity);
}

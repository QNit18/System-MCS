package com.qnit18.identity.mapper;

import org.mapstruct.Mapper;

import com.qnit18.identity.dto.request.PermissionRequest;
import com.qnit18.identity.dto.response.PermissionResponse;
import com.qnit18.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

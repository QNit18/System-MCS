package com.qnit18.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.qnit18.identity.dto.request.RoleRequest;
import com.qnit18.identity.dto.response.RoleResponse;
import com.qnit18.identity.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}

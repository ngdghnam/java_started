package com.devteria.identity_service.Mapper;

import com.devteria.identity_service.DTO.Requests.PermissionRequest;
import com.devteria.identity_service.DTO.Responses.PermissionResponse;
import com.devteria.identity_service.Entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);

}

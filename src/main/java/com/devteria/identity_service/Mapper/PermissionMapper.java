package com.devteria.identity_service.Mapper;

import com.devteria.identity_service.DTO.Requests.UserCreationRequest;
import com.devteria.identity_service.DTO.Requests.UserUpdateRequest;
import com.devteria.identity_service.DTO.Responses.UserResponse;
import com.devteria.identity_service.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

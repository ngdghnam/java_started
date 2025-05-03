package com.devteria.identity_service.DTO.Responses;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionResponse {
    String name;
    String description;

}

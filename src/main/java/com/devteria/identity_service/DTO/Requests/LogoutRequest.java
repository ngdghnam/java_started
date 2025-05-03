package com.devteria.identity_service.DTO.Requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntrospectRequest {
    String token;
    
}

package com.khelo.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CredentialsDtoRequest {
    private String email;
}

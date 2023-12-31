package com.fse1.movieapp.payload.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
@Getter
@Setter
@Data
public class LoginRequest {
    @NotBlank
    private String loginId;
    @NotBlank
    private String password;
}

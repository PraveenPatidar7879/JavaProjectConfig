package com.apigateway.demo.config.AuthController;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Data    
public class AuthResponse {

    private String userID;
    private String  accessToken;
    private String  refershToken;

    private long ExpireAt;

    private Collection<String> authories;

}

package com.apigateway.demo.config.AuthController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     private Logger logger=(Logger) LoggerFactory.getLogger(AuthController.class);

//     @GetMapping("/login")
//     public ResponseEntity<AuthResponse>login(
//        @RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client,
//        @AuthenticationPrincipal  OidcUser user,
//        Model model
//     ){
//       logger.info("user email id :{} ",user.getEmail());

//         //creating auto Response module 
        
//         AuthResponse authResponse=new AuthResponse();

//         //Setting  email to authResponse 
//         authResponse.setUserID(user.getEmail());
//         //Seting token to authResponse 
//         authResponse.setAccessToken(client.getAccessToken().getTokenValue());


//         authResponse.setRefershToken(client.getRefreshToken().getTokenValue());

//       authResponse.setExpireAt(client.getAccessToken().getExpiresAt().getEpochSecond());
        
//     List<String> authorities= user.getAuthorities().stream().map(grantedAuthority->{
//             return grantedAuthority.getAuthority();
//         }).collect(Collectors.toList());


//        authResponse.setAuthories(authorities);;

//        //return authResponse.;

//        return new ResponseEntity<AuthResponse>(authResponse,HttpStatus.OK);
//        //return ResponseEntity.ok(authResponse);
//     } 

// }


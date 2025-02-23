package br.com.fby.inteface.rest;

import br.com.fby.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("authenticate")
    public ResponseEntity<String> authenticate(Authentication authentication) {
        return ResponseEntity.status(HttpStatus.OK).body(authenticationService.autheticate(authentication));
    }
}

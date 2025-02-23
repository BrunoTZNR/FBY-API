package br.com.fby.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final JwtService jwtService;

    public String autheticate(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }
}

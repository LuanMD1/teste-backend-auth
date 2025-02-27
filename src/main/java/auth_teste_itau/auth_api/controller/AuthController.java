package auth_teste_itau.auth_api.controller;

import auth_teste_itau.auth_api.application.AuthUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthUseCase authUseCase;

    @Autowired
    public AuthController(AuthUseCase authUseCase) {
        this.authUseCase = authUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String password) {
        List<String> errors = authUseCase.validatePassword(password);

        if (errors.isEmpty()) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.badRequest().body(errors);
        }
    }
}

package auth_teste_itau.auth_api.controller;

import auth_teste_itau.auth_api.application.usecase.AuthUseCase;
import auth_teste_itau.auth_api.application.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private final AuthUseCase authUseCase;

    public AuthController(AuthUseCase authUseCase) {
        this.authUseCase = authUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String password = request.getPassword();
        List<String> errors = authUseCase.validatePassword(password);

        if (errors.isEmpty()) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.badRequest().body(errors);
        }
    }
}

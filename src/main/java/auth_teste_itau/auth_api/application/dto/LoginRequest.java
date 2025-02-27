package auth_teste_itau.auth_api.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String password;

    public String getPassword() {
        return password;
    }
}
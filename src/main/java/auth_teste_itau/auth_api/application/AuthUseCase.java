package auth_teste_itau.auth_api.application;

import auth_teste_itau.auth_api.domain.MinLengthRule;
import auth_teste_itau.auth_api.domain.PasswordValidator;
import auth_teste_itau.auth_api.domain.UpperCaseRule;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthUseCase {
    private final PasswordValidator passwordValidator;

    public AuthUseCase() {
        this.passwordValidator = new PasswordValidator(Arrays.asList(
                new MinLengthRule(9),
                new UpperCaseRule()
        ));
    }

    public List<String> validatePassword(String password) {
        return passwordValidator.validate(password);
    }
}

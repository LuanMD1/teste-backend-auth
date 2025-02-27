package auth_teste_itau.auth_api.application.usecase;

import auth_teste_itau.auth_api.domain.rules.*;
import auth_teste_itau.auth_api.domain.service.PasswordValidator;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthUseCase {
    private final PasswordValidator passwordValidator;

    public AuthUseCase() {
        this.passwordValidator = new PasswordValidator(Arrays.asList(
                new MinLengthRule(9),
                new DigitLimitRule(1),
                new LowerCaseRule(),
                new UpperCaseRule(),
                new SpecialCharacterRule(new String[]{"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", ","}),
                new NoRepeatCharRule()
        ));
    }

    public List<String> validatePassword(String password) {
        return passwordValidator.validate(password);
    }
}

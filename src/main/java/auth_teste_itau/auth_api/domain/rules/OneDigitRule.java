package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class OneDigitRule implements PasswordRule {
    @Override
    public String validate(String password) {
        if (!password.matches(".*\\d.*")) {
            return "A senha deve conter pelo menos 1 dígito numérico.";
        }
        return null;
    }
}
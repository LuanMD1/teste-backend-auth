package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class SpecialCharacterRule implements PasswordRule {
    @Override
    public String validate(String password) {
        if (!password.matches(".*[!@#$%^&*()\\-+,].*")) {
            return "A senha deve conter pelo menos 1 caractere especial (ex: !@#$%^&*()-+).";
        }
        return null;
    }
}

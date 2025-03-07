package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class MinLengthRule implements PasswordRule {
    private final int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public String validate(String password) {
        return password.length() < minLength ? "A senha deve ter pelo menos " + minLength + " caracteres" : null;
    }
}


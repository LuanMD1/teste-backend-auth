package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class DigitLimitRule implements PasswordRule {
    private final int digitLength;

    public DigitLimitRule(int digitLength) {
        this.digitLength = digitLength;
    }

    @Override
    public String validate(String password) {
        if (!password.matches(".*\\d.*")) {
            return "A senha deve conter pelo menos 1 dígito.";
        }
        return password.length() < digitLength ? "A senha deve conter ao menos " + digitLength + " dígito." : null;
    }
}
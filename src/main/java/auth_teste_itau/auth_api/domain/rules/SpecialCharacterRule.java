package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class SpecialCharacterRule implements PasswordRule {
    private final String[] specialCharacters;

    public SpecialCharacterRule(String[] specialCharacters) {
        this.specialCharacters = specialCharacters;
    }

    @Override
    public String validate(String password) {
        // Valida se a senha contém pelo menos 1 caractere especial do conjunto
        boolean hasSpecialChar = false;
        for (String specialChar : specialCharacters) {
            if (password.contains(specialChar)) {
                hasSpecialChar = true;
                break;
            }
        }

        if (!hasSpecialChar) {
            return "A senha deve conter pelo menos 1 caractere especial (ex: !@#$%^&*()-+).";
        }
        return null;
    }
}

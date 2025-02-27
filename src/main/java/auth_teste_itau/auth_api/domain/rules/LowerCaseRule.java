package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

public class LowerCaseRule implements PasswordRule {
    @Override
    public String validate(String password) {
        return password.chars().noneMatch(Character::isLowerCase) ?
                "A senha deve conter pelo menos uma letra minúscula" : null;
    }
}
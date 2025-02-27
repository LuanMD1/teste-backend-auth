package auth_teste_itau.auth_api.domain;

public class UpperCaseRule implements PasswordRule {
    @Override
    public String validate(String password) {
        return password.chars().noneMatch(Character::isUpperCase) ?
                "A senha deve conter pelo menos uma letra maiúscula" : null;
    }
}

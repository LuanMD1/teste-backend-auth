package auth_teste_itau.auth_api.domain.rules;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatCharRule implements PasswordRule {
    @Override
    public String validate(String password) {
        Set<Character> characters = new HashSet<>();
        for (char c : password.toCharArray()) {
            if (!characters.add(c)) {
                return "A senha não pode ter caracteres repetidos.";
            }
        }
        return null;
    }
}

package auth_teste_itau.auth_api.domain.service;

import auth_teste_itau.auth_api.domain.entity.PasswordRule;

import java.util.List;
import java.util.stream.Collectors;

public class PasswordValidator {
    private final List<PasswordRule> rules;

    public PasswordValidator(List<PasswordRule> rules) {
        this.rules = rules;
    }

    public List<String> validate(String password) {
        return rules.stream()
                .map(rule -> rule.validate(password))
                .filter(msg -> msg != null)
                .collect(Collectors.toList());
    }
}

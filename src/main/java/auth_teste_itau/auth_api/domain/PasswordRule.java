package auth_teste_itau.auth_api.domain;

public interface PasswordRule {
    String validate(String password);
}
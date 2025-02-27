package auth_teste_itau.auth_api.domain.entity;

public interface PasswordRule {
    String validate(String password);
}
package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.MinLengthRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinLengthRuleTest {

    @Test
    void testValidPassword() {
        MinLengthRule rule = new MinLengthRule(9);
        String result = rule.validate("SenhaForte123");
        assertNull(result);
    }

    @Test
    void testInvalidPassword() {
        MinLengthRule rule = new MinLengthRule(9);
        String result = rule.validate("12345678");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter ao menos 9 caracteres.");
    }
}

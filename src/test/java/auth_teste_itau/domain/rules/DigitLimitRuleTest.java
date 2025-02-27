package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.DigitLimitRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitLimitRuleTest {

    @Test
    void testPasswordWithDigit() {
        DigitLimitRule rule = new DigitLimitRule(1);
        String result = rule.validate("Senha1");
        assertNull(result);
    }

    @Test
    void testPasswordWithoutDigit() {
        DigitLimitRule rule = new DigitLimitRule(1);
        String result = rule.validate("SenhaForte");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter pelo menos 1 número.");
    }
}

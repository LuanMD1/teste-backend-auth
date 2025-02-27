package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.OneDigitRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OneDigitRuleTest {

    @Test
    void testPasswordWithDigit() {
        OneDigitRule rule = new OneDigitRule();
        String result = rule.validate("Senha1");
        assertNull(result);
    }

    @Test
    void testPasswordWithoutDigit() {
        OneDigitRule rule = new OneDigitRule();
        String result = rule.validate("SenhaForte");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter pelo menos 1 número.");
    }
}

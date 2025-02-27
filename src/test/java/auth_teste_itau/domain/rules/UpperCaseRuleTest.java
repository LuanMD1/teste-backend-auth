package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.UpperCaseRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UpperCaseRuleTest {

    @Test
    void testPasswordWithUpperCase() {
        UpperCaseRule rule = new UpperCaseRule();
        String result = rule.validate("senhaForte1");
        assertNull(result);
    }

    @Test
    void testPasswordWithoutUpperCase() {
        UpperCaseRule rule = new UpperCaseRule();
        String result = rule.validate("senha123");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter pelo menos 1 letra maiúscula.");
    }
}

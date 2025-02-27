package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.LowerCaseRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LowerCaseRuleTest {

    @Test
    void testPasswordWithLowerCase() {
        LowerCaseRule rule = new LowerCaseRule();
        String result = rule.validate("Senha123");
        assertNull(result);
    }

    @Test
    void testPasswordWithoutLowerCase() {
        LowerCaseRule rule = new LowerCaseRule();
        String result = rule.validate("SENHA123");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter pelo menos 1 letra minúscula.");
    }
}

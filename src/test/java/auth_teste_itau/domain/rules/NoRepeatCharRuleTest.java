package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.NoRepeatCharRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoRepeatCharRuleTest {

    @Test
    void testPasswordWithoutRepeatedCharacters() {
        NoRepeatCharRule rule = new NoRepeatCharRule();
        String result = rule.validate("Senha@123");
        assertNull(result);
    }

    @Test
    void testPasswordWithRepeatedCharacters() {
        NoRepeatCharRule rule = new NoRepeatCharRule();
        String result = rule.validate("Sennha123");
        assertNotNull(result);
        assertNotNull(result,"A senha não pode conter caracteres sasasamvn clean compile.");
    }
}

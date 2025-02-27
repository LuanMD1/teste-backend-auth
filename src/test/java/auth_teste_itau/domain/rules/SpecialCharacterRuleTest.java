package auth_teste_itau.domain.rules;

import auth_teste_itau.auth_api.domain.rules.SpecialCharacterRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecialCharacterRuleTest {

    @Test
    void testPasswordWithSpecialCharacter() {
        SpecialCharacterRule rule = new SpecialCharacterRule();
        String result = rule.validate("Senha@Forte");
        assertNull(result);
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        SpecialCharacterRule rule = new SpecialCharacterRule();
        String result = rule.validate("SenhaForte");
        assertNotNull(result);
        assertNotNull(result,"A senha deve conter pelo menos 1 caractere especial (ex: !@#$%^&*()-+).");
    }
}

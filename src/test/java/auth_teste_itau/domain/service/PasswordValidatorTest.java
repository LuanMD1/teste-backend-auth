package auth_teste_itau.domain.service;

import auth_teste_itau.auth_api.domain.rules.*;
import auth_teste_itau.auth_api.domain.service.PasswordValidator;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        PasswordValidator validator = new PasswordValidator(Arrays.asList(
                new MinLengthRule(9),
                new OneDigitRule(),
                new LowerCaseRule(),
                new UpperCaseRule(),
                new SpecialCharacterRule(),
                new NoRepeatCharRule()
        ));

        List<String> errors = validator.validate("Senha123!");
        assertTrue(errors.isEmpty());
    }

    @Test
    void testInvalidPassword() {
        PasswordValidator validator = new PasswordValidator(Arrays.asList(
                new MinLengthRule(9),
                new OneDigitRule(),
                new LowerCaseRule(),
                new UpperCaseRule(),
                new SpecialCharacterRule(),
                new NoRepeatCharRule()
        ));

        List<String> errors = validator.validate("abc");
        assertFalse(errors.isEmpty());
        assertEquals(4, errors.size());
    }
}

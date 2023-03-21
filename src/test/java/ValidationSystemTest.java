import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationSystemTest<o> {
    ValidationSystem validationSystem = new ValidationSystem();
    private boolean expected = true;

    @Test
    public void testValidateString(){
        assertEquals(expected,validationSystem.validate("Hello"));
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateStringFails(){
        assertEquals(expected,validationSystem.validate("hello"));
    }

    @Test
    public void testValidate(){
        assertEquals(expected,validationSystem.validate(2));
    }

    @Test(expected = IllegalStateException.class)
    public void testValidateFails(){
        assertEquals(expected,validationSystem.validate(15));
    }
}
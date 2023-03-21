import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {
    StringValidator<String> stringValidator = new StringValidator<>();
    final boolean expected = true;
    final boolean expected2 = true;
    final boolean actual = stringValidator.validate("Hello");
    final boolean actual2 = stringValidator.validate("Hi, how are u ?");

    @Test
    public void testValidateString(){
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test (expected = IllegalStateException.class)
    public void testValidateStringIllegalStateException() throws IllegalStateException{
        stringValidator.validate("hello");
    }
}
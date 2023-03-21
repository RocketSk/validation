import org.junit.Assert;
import org.junit.Test;

public class IntegerValidatorTest {
    IntegerValidator integerValidator = new IntegerValidator();
    final boolean EXPECTED = true;
    final boolean EXPECTED2 = true;
    final boolean EXPECTED3 = true;

    @Test
    public void testValidateInt(){
        Assert.assertEquals(EXPECTED,integerValidator.validate(1));
        Assert.assertEquals(EXPECTED2,integerValidator.validate(5));
        Assert.assertEquals(EXPECTED3,integerValidator.validate(10));
    }

    @Test (expected = IllegalStateException.class)
    public void testValidateIllegalStateExceptionZero() throws IllegalStateException{
        integerValidator.validate(0);
    }

    @Test (expected = IllegalStateException.class)
    public void testValidateIllegalStateException() throws IllegalStateException{
        integerValidator.validate(11);
    }

}
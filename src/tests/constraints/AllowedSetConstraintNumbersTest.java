package tests.constraints;

import DPPParser.defaultConstrains.AllowedSetConstraint;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AllowedSetConstraintNumbersTest {

    private AllowedSetConstraint<Integer> allowedSetConstraint;

    @BeforeClass
    public void initialize() {
        allowedSetConstraint = new AllowedSetConstraint<Integer>();
        allowedSetConstraint.add(1);
        allowedSetConstraint.add(3);
    }

    @Test
    public void testIsFulfilled_StringCorrectCase_Pass() throws Exception {
        boolean result = allowedSetConstraint.isFulfilled(3);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsFulfilled_StringForbiddenCase_Pass() throws Exception {
        boolean result = allowedSetConstraint.isFulfilled(2);
        Assert.assertFalse(result);
    }

    @Test
    public void testGetErrorMessage_Number_Pass() throws Exception {
        Assert.assertEquals(allowedSetConstraint.getErrorMessage(2),
                "\"2\" is not allowed. Allowed arguments are:" + allowedSetConstraint);
    }
}
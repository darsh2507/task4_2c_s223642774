package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "s223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh Patel";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
   }
	
	
	/*
	 * Write more test functions below.
	 */

    @Test
    public void testEmptyUsernameWrongPassword() {
        LoginStatus status = LoginForm.login(null, "wrongPass");
        Assert.assertFalse(status.isLoginSuccess());
    }
    @Test
    public void testEmptyUsernameCorrectPassword() {
        LoginStatus status = LoginForm.login(null, "ahsan_pass");
        Assert.assertFalse(status.isLoginSuccess());
    }
    @Test
    public void testWrongUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login("wrongUname", null);
        Assert.assertFalse(status.isLoginSuccess());
    }

    @Test
    public void testWrongUsernameWrongPassword() {
        LoginStatus status = LoginForm.login("wrongUname", "wrongPass");
        Assert.assertFalse(status.isLoginSuccess());
    }
    @Test
    public void testWrongUsernameCorrectPassword() {
        LoginStatus status = LoginForm.login("wrongUname", "ahsan_pass");
        Assert.assertFalse(status.isLoginSuccess());
    }
    
    @Test
    public void testCorrectUsernameEmptyPassword() {
        LoginStatus status = LoginForm.login("ahsan", null);
        Assert.assertFalse(status.isLoginSuccess());
    }

    @Test
    public void testCorrectUsernameCorrectPasswordEmptyValCode() {
        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
        Assert.assertTrue(status.isLoginSuccess());
        Assert.assertEquals("123456", status.getErrorMsg());
    }
    
    @Test
    public void testCorrectUsernameCorrectPasswordWrongValCode() {
        boolean isValid = LoginForm.validateCode("18788");
        Assert.assertFalse(isValid);
    }

    @Test
    public void testCorrectUsernameCorrectPasswordCorrectValCode() {
        boolean isValid = LoginForm.validateCode("123456");
        Assert.assertTrue(isValid);
    }
}

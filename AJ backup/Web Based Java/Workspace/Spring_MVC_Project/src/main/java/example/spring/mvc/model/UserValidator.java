package example.spring.mvc.model;

public class UserValidator {
	public static boolean isValid(User userObject) {
		boolean result = false;
		String currentUserId = userObject.getUserName();
		String currentPassword = userObject.getPassword();
		if (currentUserId.equals("dipali") && currentPassword.equals("dipu@1411"))
			result = true;
		return result;
	}
}

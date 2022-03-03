
package in.cognitron.lms;

/**
 * static class that has all the constants used across the app
 *
 */
public class Lms {
	/**
	 * names of fields, columns etc..
	 *
	 * @author simplity.org
	 *
	 */
	public static class Names {
		/**
		 * institute is our tenant id
		 */
		public static final String TENANT_FIELD = "tenantId";
		/**
		 * institute id
		 */
		public static final String TENANT_COLUMN = "tenant_id";
		/**
		 * user name field in login service
		 */
		public static final String LOGIN_SERVICE = "login";

		/**
		 *
		 */
		public static final String CHECKEMAIL_SERVICE = "checkUser";

		/**
		 * path for login
		 */
		public static final String LOGIN_URL = "/v1/users/login";
		/**
		 * user name field in login service
		 */
		public static final String USER_NAME = "userName";

		/**
		 * password field in login service
		 */
		public static final String PASSWORD = "password";

		/**
		 * user identifier is a field in request sign-up service
		 */
		public static final String USER_IDENTIFIER = "loginId";

		/**
		 * user type is a field in request sign-up service
		 */
		public static final String USER_TYPE = "userType";

		/**
		 * confirm password field in sign-up service
		 */
		public static final String CONFIRM_PASSWORD = "confirmpassword";

		/**
		 * confirmation token password field in sign-up service
		 */
		public static final String token = "token";

		/**
		 * confirmation token password field in sign-up service
		 */
		public static final String SIGNUP_SERVICE = "Signup";

	}
}

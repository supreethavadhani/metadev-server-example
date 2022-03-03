
package in.cognitron.lms.types;

/**
 * User type values : user.getUSerType() matches with one of these values
 *
 */
public enum UserType {
	/** Admin **/
	Admin,
	/**
	 * Student
	 */
	Student,
	/**
	 * Guardian
	 */
	Guardian,
	/**
	 * staff
	 */
	Staff,
	/**
	 * another application
	 */
	App,
	/**
	 * External Users who don't belong to the institute like external
	 * evaluators, board of education etc....
	 */
	External;
}

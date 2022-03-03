/*
 * Copyright (c) 2019 cognitron.in
 * all rights reserved
 */

package in.cognitron.lms;

import org.simplity.fm.core.UserContext;
import in.cognitron.lms.gen.rec.TenentConfigurationRecord;
import in.cognitron.lms.gen.rec.UserContextRecord;

/**
 * Data structure that gets stored in a session-cache and made available to a
 * service-context. This is set when the user logs-in and is re-used on
 * subsequent requests.
 *
 * This is an immutable object. Getters for mutable fields are designed to
 * return a copy of the object.
 *
 *
 *
 *
 */
public class LmsUserContext extends UserContext {

	private final UserContextRecord user;
	private final TenentConfigurationRecord tenentConfig;

	/**
	 *
	 * @param user
	 * @param instConfig
	 */
	public LmsUserContext(final UserContextRecord user, final TenentConfigurationRecord tenentConfig) {
		super("" + user.getUserId());
		this.user = user;
		this.tenentConfig = tenentConfig;
	}

	/**
	 * @return user data associated with the logged-in user. Note that the
	 *         returned record is mutable, but the caller MUST
	 */
	public UserContextRecord getUser() {
		return (UserContextRecord) this.user.makeACopy();
	}

	/**
	 * @return the institute configuration
	 */
	public TenentConfigurationRecord getTenentConfig() {
		return (TenentConfigurationRecord) this.tenentConfig.makeACopy();
	}
	

}

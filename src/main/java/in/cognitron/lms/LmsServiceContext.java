/*
 * Copyright (c) 2019 cognitron.in
 * all rights reserved
 */

package in.cognitron.lms;

import org.simplity.fm.core.serialize.ISerializer;
import org.simplity.fm.core.service.DefaultContext;

import in.cognitron.lms.gen.rec.TenentConfigurationRecord;
import in.cognitron.lms.gen.rec.UserContextRecord;
import in.cognitron.lms.types.UserType;

/**
 * @author cognitron.in
 *
 */
public class LmsServiceContext extends DefaultContext {

	private final long uid;
	private final long tenentId;
	private final TenentConfigurationRecord config;
	private final UserContextRecord user;

	/**
	 * @param utx
	 *            null if there is no authenticated user
	 * @param writer
	 */
	public LmsServiceContext(final LmsUserContext utx, final ISerializer writer) {

		super(utx, writer);
		if (utx == null) {
			this.tenentId = 0;
			this.uid = 0;
			this.config = null;
			this.user = null;
		} else {
			this.config = utx.getTenentConfig();
			this.user = utx.getUser();
			this.uid = this.user.getUserId();
			this.tenentId = this.config.getTenentId();
		}
		super.setTenantId(this.tenentId);
	}


	/**
	 *
	 * @return current season
	 */
	@Override
	public Long getUserId() {
		return this.uid;
	}

	@Override
	public Long getTenantId() {
		// TODO Auto-generated method stub
		return this.tenentId;
	}

	/**
	 *
	 * @return user details. null if this session has no user
	 */
	public UserContextRecord getUser() {
		return this.user;
	}

	/**
	 *
	 * @return institute id associated with the logged-in user
	 */
	public long getInstituteId() {
		return this.tenentId;
	}

	/**
	 * @return the config for the current institute
	 */
	public TenentConfigurationRecord getConfig() {
		return this.config;
	}

	/**
	 *
	 * @return true if user is admin, false otherwise
	 */
	public boolean userIsAdmin() {
		return this.user.getUserType().equals(UserType.Admin.name());
	}

	/**
	 *
	 * @return userType
	 */
	public UserType getUserType() {
		return UserType.valueOf(this.user.getUserType());
	}
	
	/**
	 * set the current season context for the server
	 */
}

package com.headstrong.fusion.server.http;

import java.util.ArrayList;

/**
 * @author mali
 *
 */
public class TediUser {

	static final long serialVersionUID = -8141397214230180648L;
	public static final String ADMINS = "admins";

	private String userID;
	private String fullName;
	private String description;
	@SuppressWarnings("unchecked")
	private ArrayList groups;

	@SuppressWarnings("unchecked")
	public TediUser(String userID, String fullName, String desc, ArrayList groups) {
		this.userID = userID;
		this.fullName = fullName;
		this.description = desc;
		this.groups = groups;
	};

	public String getUserID() {
		return userID;
	}

	@SuppressWarnings("unchecked")
	public ArrayList getGroups() {
		return groups;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDescription() {
		return description;
	}

	public boolean isGroupMember(String s1) {
		if (groups.contains(s1.toLowerCase())) return true;
		return false;
	}

}

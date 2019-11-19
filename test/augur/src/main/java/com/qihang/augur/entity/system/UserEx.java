package com.qihang.augur.entity.system;

import com.qihang.augur.entity.system.RoleEx;
import com.qihang.augur.entity.system.User;

public class UserEx extends User {
	
	private RoleEx role;

	public RoleEx getRole() {
		return role;
	}

	public void setRole(RoleEx role) {
		this.role = role;
	}
	
	
	
}

package com.fengwei.rbmqTest01.po;

import java.io.Serializable;

/**
 * @author 冯蔚
 * 日期：2018年11月17日 下午9:41:14
 * 
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -805247973503307471L;
	private String userName;
	private String userPswd;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPswd
	 */
	public String getUserPswd() {
		return userPswd;
	}
	/**
	 * @param userPswd the userPswd to set
	 */
	public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}
	
	@Override
	public String toString() {
		return getUserName() + ":" + this.getUserPswd();
	}
	

}

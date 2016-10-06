package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class Userinfo {
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  用户名称
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPwd;
	/**
	 *  邮箱
	 */
	private String email;
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名称
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名称
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPwd
	 */
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPwd(){
    	return userPwd;
    }
	/**
	 * 邮箱
	 * @param email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
    /**
     * 邮箱
     * @return
     */	
    public String getEmail(){
    	return email;
    }
}
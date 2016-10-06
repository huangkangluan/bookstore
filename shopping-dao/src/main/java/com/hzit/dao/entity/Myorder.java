package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class Myorder {
	/**
	 *  订单ID
	 */
	private Integer myOrderId;
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  创建时间
	 */
	private java.util.Date createTime;
	/**
	 *  订单总价
	 */
	private Integer myOrderPrice;
	/**
	 *  订单状态
	 */
	private String myOrderStatus;
	/**
	 * 订单ID
	 * @param myOrderId
	 */
	public void setMyOrderId(Integer myOrderId){
		this.myOrderId = myOrderId;
	}
	
    /**
     * 订单ID
     * @return
     */	
    public Integer getMyOrderId(){
    	return myOrderId;
    }
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
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
	/**
	 * 订单总价
	 * @param myOrderPrice
	 */
	public void setMyOrderPrice(Integer myOrderPrice){
		this.myOrderPrice = myOrderPrice;
	}
	
    /**
     * 订单总价
     * @return
     */	
    public Integer getMyOrderPrice(){
    	return myOrderPrice;
    }
	/**
	 * 订单状态
	 * @param myOrderStatus
	 */
	public void setMyOrderStatus(String myOrderStatus){
		this.myOrderStatus = myOrderStatus;
	}
	
    /**
     * 订单状态
     * @return
     */	
    public String getMyOrderStatus(){
    	return myOrderStatus;
    }
}
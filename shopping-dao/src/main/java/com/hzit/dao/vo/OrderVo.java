package com.hzit.dao.vo;

import java.util.List;

/**
 * 
 * @author huangkangluan
 */
public class OrderVo {
	/**
	 *  订单ID
	 */
	private String myOrderId;
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
	private List<BookVo> bookVoList;

	public List<BookVo> getBookVoList() {
		return bookVoList;
	}

	public void setBookVoList(List<BookVo> bookVoList) {
		this.bookVoList = bookVoList;
	}

	/**
	 * 订单ID
	 * @param myOrderId
	 */
	public void setMyOrderId(String myOrderId){
		this.myOrderId = myOrderId;
	}
	
    /**
     * 订单ID
     * @return Integer
     */	
    public String getMyOrderId(){
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
     * @return Integer
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
     * @return java.util.Date
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
     * @return Integer
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
     * @return String
     */	
    public String getMyOrderStatus(){
    	return myOrderStatus;
    }
}
package com.hzit.dao.vo;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author huangkangluan
 */
public class DingdanxxVo {
	/**
	 *  主键ID
	 */
	private Integer orderId;
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 *  订单ID
	 */
	private String myOrderId;
	/**
	 *  图书ID
	 */
	private Integer bookId;
	/**
	 * 图书表里的图片
	 */
	private List<String> bookImage;

	public List<String> getBookImage() {
		return bookImage;
	}

	public void setBookImage(List<String> bookImage) {
		this.bookImage = bookImage;
	}

	/**
	 * 收货人姓名
	 */
	private String userName;

	/**
	 * 订单表里的创建时间
	 * @return
	 */
	private java.util.Date createTime;
	/**
	 *  订单状态
	 */
	private String myOrderStatus;


	public String getMyOrderStatus() {
		return myOrderStatus;
	}

	public void setMyOrderStatus(String myOrderStatus) {
		this.myOrderStatus = myOrderStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 *  购买数量
	 */
	private Integer orderNumber;
	/**
	 *  交易价格
	 */
	private Integer orderPrice;
	/**
	 * 主键ID
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 主键ID
     * @return Integer
     */	
    public Integer getOrderId(){
    	return orderId;
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
	 * 图书ID
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书ID
     * @return Integer
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 购买数量
	 * @param orderNumber
	 */
	public void setOrderNumber(Integer orderNumber){
		this.orderNumber = orderNumber;
	}
	
    /**
     * 购买数量
     * @return Integer
     */	
    public Integer getOrderNumber(){
    	return orderNumber;
    }
	/**
	 * 交易价格
	 * @param orderPrice
	 */
	public void setOrderPrice(Integer orderPrice){
		this.orderPrice = orderPrice;
	}
	
    /**
     * 交易价格
     * @return Integer
     */	
    public Integer getOrderPrice(){
    	return orderPrice;
    }
}
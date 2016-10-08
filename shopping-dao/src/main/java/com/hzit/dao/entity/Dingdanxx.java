package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class Dingdanxx {
	/**
	 *  主键ID
	 */
	private String orderId;
	/**
	 *  订单ID
	 */
	private String myOrderId;
	/**
	 *  图书ID
	 */
	private Integer bookId;
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
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 主键ID
     * @return
     */	
    public String getOrderId(){
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
     * @return
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
     * @return
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 购买数量
	 * @param orderNumber
	 */
	public void setOrderNumber(int orderNumber){
		this.orderNumber = orderNumber;
	}
	
    /**
     * 购买数量
     * @return
     */	
    public Integer getOrderNumber(){
    	return orderNumber;
    }
	/**
	 * 交易价格
	 * @param orderPrice
	 */
	public void setOrderPrice(int orderPrice){
		this.orderPrice = orderPrice;
	}
	
    /**
     * 交易价格
     * @return
     */	
    public Integer getOrderPrice(){
    	return orderPrice;
    }
}
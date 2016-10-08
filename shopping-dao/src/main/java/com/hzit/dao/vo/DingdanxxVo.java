package com.hzit.dao.vo;

import com.hzit.dao.entity.Dingdanxx;

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
	/**
	 *  订单ID
	 */
	private Integer myOrderId;
	/**
	 *  图书ID
	 */
	private Integer bookId;
	private String bookImage;
	private String bookName;


	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	public void setMyOrderId(Integer myOrderId){
		this.myOrderId = myOrderId;
	}
	
    /**
     * 订单ID
     * @return Integer
     */	
    public Integer getMyOrderId(){
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
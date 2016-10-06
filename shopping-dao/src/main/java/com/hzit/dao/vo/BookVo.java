package com.hzit.dao.vo;

/**
 * 
 * @author huangkangluan
 */
public class BookVo {
	/**
	 *  图书ID
	 */
	private Integer bookId;
	/**
	 *  图书名称
	 */
	private String bookName;
	/**
	 *  图书价格
	 */
	private String bookPrice;
	/**
	 *  库存数量
	 */
	private String bookNumber;
	/**
	 *  图书图片
	 */
	private String bookImage;
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
	 * 图书名称
	 * @param bookName
	 */
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
    /**
     * 图书名称
     * @return String
     */	
    public String getBookName(){
    	return bookName;
    }
	/**
	 * 图书价格
	 * @param bookPrice
	 */
	public void setBookPrice(String bookPrice){
		this.bookPrice = bookPrice;
	}
	
    /**
     * 图书价格
     * @return String
     */	
    public String getBookPrice(){
    	return bookPrice;
    }
	/**
	 * 库存数量
	 * @param bookNumber
	 */
	public void setBookNumber(String bookNumber){
		this.bookNumber = bookNumber;
	}
	
    /**
     * 库存数量
     * @return String
     */	
    public String getBookNumber(){
    	return bookNumber;
    }
	/**
	 * 图书图片
	 * @param bookImage
	 */
	public void setBookImage(String bookImage){
		this.bookImage = bookImage;
	}
	
    /**
     * 图书图片
     * @return String
     */	
    public String getBookImage(){
    	return bookImage;
    }
}
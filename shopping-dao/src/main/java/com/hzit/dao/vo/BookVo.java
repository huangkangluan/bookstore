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
	private int bookPrice;
	/**
	 *  库存数量
	 */
	private int bookNumber;
	/**
	 * 购买数量
	 */
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

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
	public void setBookPrice(int bookPrice){
		this.bookPrice = bookPrice;
	}
	
    /**
     * 图书价格
     * @return String
     */	
    public int getBookPrice(){
    	return bookPrice;
    }
	/**
	 * 库存数量
	 * @param bookNumber
	 */
	public void setBookNumber(int bookNumber){
		this.bookNumber = bookNumber;
	}
	
    /**
     * 库存数量
     * @return String
     */	
    public int getBookNumber(){
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
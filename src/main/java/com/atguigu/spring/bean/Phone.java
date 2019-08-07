package com.atguigu.spring.bean;

public class Phone {
	private String brand;
	private String phoneNum;
	private Double price;
	public Phone(String brand, String phoneNum, Double price) {
		super();
		this.brand = brand;
		this.phoneNum = phoneNum;
		this.price = price;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", phoneNum=" + phoneNum + ", price=" + price + "]";
	}
	
	

}

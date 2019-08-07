package com.atguigu.spring.bean;

public class Person {
	private String name;
	private String gender;
	private Integer age;
	
	private Phone phone;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	


	public Person(String name, String gender, Integer age, Phone phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}








	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}








	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}








	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}








	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}








	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}








	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}








	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}








	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Phone phone) {
		this.phone = phone;
	}








	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + "]";
	}

	

	
}

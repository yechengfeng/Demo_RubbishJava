package com.ye.clazz;

public class Student {
	private String name;
	private int age;
	private int id;
	public Student() {
		super();
		
	}
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]"+"\r\n";
	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)(obj);
		
		return this.name.equals(s.name) && this.age==age&&this.id==id;
	}
	
	
	
	
	

}

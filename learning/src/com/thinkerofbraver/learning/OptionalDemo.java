package com.thinkerofbraver.learning;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String normal() {
		//������ ������ name��age
		Person person=new Person();
		if (null==person){
		  return "personΪnull";
		}
		return person.getName();
	}
	
	//public String 

}



class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
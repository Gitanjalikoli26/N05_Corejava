package org.tnsif.superkeyword;
//parent class
class Nationality
{
	String nationName="Germany";

	public Nationality(String nationName) {
		
		this.nationName = nationName;
		System.out.println(nationName);
	}
	
	
}
//child class
class Person extends Nationality
{
    String language;

	public Person(String nationName, String language) {
		//calling to parent class constructor
		super(nationName);
		this.language = language;
		System.out.println(language);
	}
	
    
}
//driver class
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Germany","German");

	}

}

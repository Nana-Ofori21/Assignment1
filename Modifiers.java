abstract class Person{
	public String fname = "John";
	public int age = 24;
	public abstract void learn();
	
}	
	class Student{
		public int graduationYear = 2018;
		public void learn(){
			System.out.println("Studying all the day long");
		}
	}
	
class MyClass{
	public static void main (Strings[] args){
		Students myObj = new Students()
		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year:" + myObj.graduationYear);
		myObj.study();
	}
}
	
	

package extend;

public class Elephant extends Animal{
	
	private String name = "";
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

	public void speak(){
		System.out.println("age :"+ age);
		System.out.println("weight :"+ weight);
		System.out.println("name :" + name);
	}
}

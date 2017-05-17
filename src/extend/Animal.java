package extend;

public class Animal {
	int age =0;
	float weight = 0;
	
	
	public void speak(){
		System.out.println("age :"+ age);
		System.out.println("weight :"+ weight);
	}
	
	
	public Animal(int age,float weight){
		 this.age=age;
		 this.weight=weight;
	}
}

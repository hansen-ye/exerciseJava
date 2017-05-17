package extend;

public class AnimalTest {
	public static void main(String[] args){
		Animal animal = new Animal(3,8.0f);
		Elephant elephant = new Elephant(8,1200.0f,"大象");
		animal.speak();
		elephant.speak();
	}
}

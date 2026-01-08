package exception;

public class ClassCastExcptionRun {

	public static void main(String[] args) {

		try {
			Dog dog = new Dog();
			changeDog(dog);
			
			Cat cat = new Cat(); // cat, dog은 부모 자식 관계아님
			changeDog(cat);
			
		} catch (ClassCastException e) {
			System.out.println("부모 자식 클래스만 Casting이 됩니다. \n" + e.getMessage());
		}
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}

}

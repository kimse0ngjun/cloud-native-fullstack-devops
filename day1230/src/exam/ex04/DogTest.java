package exam.ex04;

public class DogTest {
	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("변종1", "진짜모름1");
		dog[1] = new Dog("변종2", "진짜모름2");
		dog[2] = new Dog("변종3", "진짜모름3");
		dog[3] = new Dog("변종4", "진짜모름4");
		dog[4] = new Dog("변종5", "진짜모름5");
		
		for (int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println();
		
		
		for (Dog dog2 : dog) {
			System.out.println(dog2.showDogInfo());
		}
		
	}
}

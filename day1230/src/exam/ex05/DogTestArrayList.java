package exam.ex05;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args){
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog("도리1", "푸들"));
		dog.add(new Dog("도리2", "푸들"));
		dog.add(new Dog("도리3", "푸들"));
		dog.add(new Dog("도리4", "푸들"));
		dog.add(new Dog("도리5", "푸들"));
		
		for (int i = 0; i < dog.size(); i++) {
 			System.out.println(dog.get(i).showDogInfo());
		}
		
		System.out.println("================= 향상된 for문 =================");
		for (Dog dog2 : dog) {
			System.out.println(dog2.showDogInfo());
		}
	}
}

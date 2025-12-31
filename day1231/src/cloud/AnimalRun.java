package cloud;

public class AnimalRun {

	public static void main(String[] args) {
//		Animal ani = new Animal();
		AnimalRun aniRun = new AnimalRun();
		aniRun.moveAnimal(new Human());
		aniRun.moveAnimal(new Tiger());
		aniRun.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

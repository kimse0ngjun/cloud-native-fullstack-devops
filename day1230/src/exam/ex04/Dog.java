package exam.ex04;

public class Dog {
	public String name;
	public String type;
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public Dog() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
//	public void showDogInfo() {
//		System.out.println(name + "," + type);
//	}
	
	public String showDogInfo() {
		return name + "," + type;
	}
}

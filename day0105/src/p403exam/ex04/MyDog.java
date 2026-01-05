package p403exam.ex04;

public class MyDog {

	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public String getName() {
	return name;
}
	
	public String getType() {
	return type;
}
	
	@Override
	public String toString() {
		return "MyDog.name=" + name + ", MyDog.type=" + type;
	}
	
}

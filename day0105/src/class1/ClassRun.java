package class1;

public class ClassRun {

	public static void main(String[] args) throws Exception {
		
		Person ps = new Person();
		ps.setName("홍길동");
		
		Class pClass = ps.getClass();
		String name = pClass.getName();
		System.out.println("pClass.getName() = " + name);
		
		Class pClass1 = Class.forName("java.lang.String");
		String name1 = pClass1.getName();
		System.out.println("pClass.getName() = " + name1);
	}

}

package p403exam.ex09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Ex09Run {

	public static void main(String[] args) throws Exception {

		Class pClass1 = Person.class;
		int cnt = 1;
		Constructor[] constr = pClass1.getConstructors();
		
		for (Constructor constructor : constr) {
			System.out.println(cnt + " : " + constructor);
			cnt++;
		}
		
		System.out.println("*************** 메서드 정보 *****************");
		Method[] method = pClass1.getMethods();
		cnt = 0;
		for (Method method2 : method) {
			System.out.println(cnt + " : " + method2);
			cnt++;
		}
	}

}

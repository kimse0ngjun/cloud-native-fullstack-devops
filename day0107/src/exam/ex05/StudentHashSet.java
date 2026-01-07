package exam.ex05; 

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

	private HashSet<Student> hashSet;
	
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	public void addStudent(Student student) {
		
		hashSet.add(student);
	}
	
	public boolean removeMember(String studentId) {
		
		Iterator<Student> ir = hashSet.iterator();
		
		while (ir.hasNext()) {
			Student student = (Student) ir.next();
			String tempId = student.getStudentId();
			if (tempId == studentId) {
				hashSet.remove(student);
				return true;
			}
		}
		System.out.println(studentId + "가 존재하지 않습니다.");
		return false;
	}
	
//	public void showAllStudent() {
//		for (Student student : hashSet) {
//			System.out.print(student);
//			
//		}
//		System.out.println("============= [end] =============");
//	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	int stuId;
	int stuAge;
	String stuName;

	Student(int id, int age, String name) {
		this.stuId = id;
		this.stuAge = age;
		this.stuName = name;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static List<Student> getStudents() {
		return (List.of(
		new Student(11, 28, "Lucy"),
		new Student(28, 27, "Kiku"),
		new Student(32, 30, "Dani"),
		new Student(49, 27, "Steve")
		));
		
	}
}

public class Example {
	public static void main(String[] args) {
//      Predicate<Student> p1 = a->a.stuName.startsWith("K");
//      Predicate<Student> p2 = s -> s.stuAge < 28 && s.stuName.startsWith("Z");       
//      List<Student> list = Student.getStudents();
//
//      /* anyMatch() method checks whether any Stream element matches
//       * the specified predicate
//       */
//      boolean b3 = list.stream().anyMatch(p1);
//      System.out.println(b3);
//      boolean b4 = list.stream().anyMatch(p2);
//      System.out.println(b4);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
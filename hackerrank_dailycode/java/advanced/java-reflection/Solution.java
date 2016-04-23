import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student{
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class Solution {

		public static void main(String[] args) throws ClassNotFoundException{
			Class student = Class.forName(Student.class.getName());
			Method[] methods = student.getDeclaredMethods();

			ArrayList<String> methodList = new ArrayList<>();
			for (Method meth : methods) {
				methodList.add(meth.getName());
			}
			
			Collections.sort(methodList);
			for (String name: methodList){
				System.out.println(name);
			}
		}

	}

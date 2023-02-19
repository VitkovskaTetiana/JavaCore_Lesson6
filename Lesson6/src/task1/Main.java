package task1;

public class Main {

	public static void main(String[] arg) {
		Salary salary1 = new Worker_type1();
		Salary salary2 = new Worker_type2();
		
		System.out.println(salary1.salary());
		System.out.println(salary2.salary());
	}
}
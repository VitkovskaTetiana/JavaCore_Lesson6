package task1;

public class Worker_type1 implements Salary{
	int monthRate = 10000;
	int workerSalary = monthRate;
	
	public int salary () {
		return this.workerSalary;
	}
}

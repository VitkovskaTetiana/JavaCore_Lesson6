package task1;

public class Worker_type2 implements Salary {
	int hourRate = 25;
	int hourAmount = 160;
	int workerSalary = hourRate*hourAmount;
	
	public int salary () {
		return this.workerSalary;
	}
}

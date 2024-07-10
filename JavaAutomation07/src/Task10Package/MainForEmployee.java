package Task10Package;

public class MainForEmployee {

	public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", "Ram", 50000);
        System.out.println(emp1);

        emp1.raiseSalary(10);
        System.out.println("New Salary after raise by 10%: " + emp1.getSalary());
    }

}

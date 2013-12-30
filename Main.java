import java.util.List;
import java.util.ArrayList;

public class DataType {
	public static void main(String[] args) {
		// Object
		/*String atom = "atom";
		System.out.println(atom);
		System.out.println(atom.length());
		
		int[] n = {0, 1, 2, 3};
		System.out.println(n);
		System.out.println(n.length);
		
		List<String> strs = new ArrayList<>();
		int[] test = int[10];
		System.out.println(strs.size()); */

		Employee em = new Employee(1, "Padlom", "Programmer", 50000);
		Employee atom = new Employee();
		atom.setId(2);
		atom.setName("Atom");
		atom.setPosition("Maid");
		atom.setSalary(1000);
		/*
		//System.out.println(em);
		//System.out.println(atom);
		//System.out.println(Employee.twoSalary(em, atom));
		
		List<Employee> employees = new ArrayList<>();
		employees.add(em);
		employees.add(atom);
		System.out.println(employees);
		*/
		
		// Simulates database
		EmployeeManager emManager = new EmployeeManager();
		emManager.insert(em);
		emManager.insert(atom);
		//EmployeeManager.selectStar();
		Employee result = EmployeeManager.findById(1);
		//System.out.println(result);
		List<Employee> result2 = EmployeeManager.find("a");
		System.out.println(result2);
		List<Employee> result3 = EmployeeManager.findBySalary(50000);
		System.out.println(result3);
 		
	}
}
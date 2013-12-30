import java.util.List;
import java.util.ArrayList;

public class EmployeeManager {

	private static List<Employee> employees;
	
	public EmployeeManager() {
		employees = new ArrayList<>();
	}
	
	public static void selectStar() {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
	
	public static void insert(Employee e) {
		employees.add(e);
	}
	
	public static Employee findById(int id) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public static List<Employee> find(String searchKey) {
		return null;
	}
	
	public static List<Employee> equalsTo(double salary) {
	}
	
	public static boolean delete(String name) {
		return false;
	}
	
}
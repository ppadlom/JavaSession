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
		List<Employee> tmp = new ArrayList<>();
		for (Employee e : employees){
			if (e.getName().matches(".*" + searchKey + ".*") ||
			    e.getPosition().matches(".*" + searchKey + ".*")) {
				tmp.add(e);
			}
		}
		return tmp;
	}
	
	public static List<Employee> findBySalary(double salary) {
		List<Employee> tmp = new ArrayList<>();
		for (Employee e : employees){
			if (e.getSalary() == salary) {
				tmp.add(e);
			}
		}
		return tmp;
	}
	
	public static boolean delete(String name) {
		return false;
	}
	
}
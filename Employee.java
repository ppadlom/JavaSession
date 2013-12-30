public class Employee {

	private int id; 
	private String name;
	private String position;
	private double salary;
	
	public Employee() {}
	
	public Employee(int id, String name, String position, double salary) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public String toString(){
      return "\nID : " + id + "\nName : " + name + "\nPosition : " + position + "\nSalary : " + salary;
	}
	
	public static double twoSalary(Employee a, Employee b) {
		double sum = a.getSalary() + b.getSalary();
		return sum;
	}
}
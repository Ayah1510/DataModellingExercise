import java.util.List;

public class Department {

	private String dep_name;
	private String dep_loc;
	private List<Employee> employees;
	
	public Department(String dep_name, String dep_loc, List<Employee> employees){
		this.dep_name = dep_name;
		this.dep_loc = dep_loc;
		this.employees = employees;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_loc() {
		return dep_loc;
	}

	public void setDep_loc(String dep_loc) {
		this.dep_loc = dep_loc;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [dep_name=" + dep_name + ", dep_loc=" + dep_loc + ", employees=" + employees + "]";
	}
	
	
	
}

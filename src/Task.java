import java.util.List;

public class Task {

	private String task_name;
	private List<Employee> employees;
	private List<Qualification> qualifications;
	private List<Task> tasks;
	private String status;
	
	public Task(String task_name, List<Employee> employees, List<Qualification> qualifications,
			List<Task> tasks, String status){
		this.task_name = task_name;
		this.employees = employees;
		this.qualifications = qualifications;
		this.tasks = tasks;
		this.status = status;
		
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [task_name=" + task_name + ", employees=" + employees + ", qualifications=" + qualifications
				+ ", tasks=" + tasks + ", status=" + status + "]";
	}

	
	
	
}

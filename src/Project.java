import java.util.List;

public class Project {

	private int proj_id;
	private String proj_name;
	private String details;
	private Employee manager;
	private List<Task> tasks;

	public Project (int proj_id, String proj_name, String details, Employee manager,
			List<Task> tasks){
		this.proj_id = proj_id;
		this.proj_name = proj_name;
		this.details = details;
		this.manager = manager;
		this.tasks = tasks;
	}

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Project [proj_id=" + proj_id + ", proj_name=" + proj_name + ", details=" + details + ", manager="
				+ manager + ", tasks=" + tasks + "]";
	}
	
	
}

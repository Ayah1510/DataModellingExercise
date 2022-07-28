import java.util.Date;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private Date birth_date;
	private int phone;
	private String gender;
	private List<Task> tasks;
	private List<Qualification> qualifications;
	private Department department;
	private List<Project> projects;
	
	public Employee(int id, String name, Date birth_date, int phone, String gender, 
			List<Task> tasks, List<Qualification> qualifications, Department department,
			List<Project> projects){
		this.id = id;
		this.name = name;
		this.birth_date = birth_date;
		this.phone = phone;
		this.gender = gender;
		this.tasks = tasks;
		this.qualifications = qualifications;
		this.department = department;
		this.projects = projects;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirth_date() {
		return birth_date;
	}


	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public List<Task> getTasks() {
		return tasks;
	}


	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}


	public List<Qualification> getQualifications() {
		return qualifications;
	}


	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birth_date=" + birth_date + ", phone=" + phone + ", gender="
				+ gender + ", tasks=" + tasks + ", qualifications=" + qualifications + ", department=" + department
				+ ", projects=" + projects + "]";
	}
	
	
	
}


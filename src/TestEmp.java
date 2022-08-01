import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestEmp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException  {
		List<Employee> emps =  new ArrayList<Employee>();
		List<Task> tasks =  new ArrayList<Task>();
		while(true){
			System.out.println("\tMain Menu");
			System.out.println("-----------------------------");
			System.out.println("1. Adding new object");
			System.out.println("2. Editing existing object");
			System.out.println("3. View one of the objects");
			System.out.println("4. Exit Program");

	
			System.out.println("Please enter the number of your option:");
			int choice = sc.nextInt();
			if(choice == 1){
				System.out.println("-----------------------------");
				System.out.println("1. Add new Employee");
				System.out.println("2. Add new Task");
				System.out.println("3. Add new Project");
				System.out.println("4. Add new Department");
				System.out.println("5. Add new Qualification");
				System.out.println("Please enter the number of your option:");
				choice = sc.nextInt();
				

				switch(choice){
				case 1: Employee employee1 =addingNewEmployee();
						emps.add(employee1);
						break;
				
				case 2: Task task = addingNewTask();
						tasks.add(task);
						break;
				
						
				}
			}
			else if(choice == 2)
				System.out.println();

			else if(choice == 3)
				System.out.println();

			else if(choice == 4)
				System.out.println("");
			else
				System.out.println("Please enter one of the options");
			
			
			
			System.out.println(emps.toString());
			System.out.println();
		
		
		}
	}
	
	public static Employee addingNewEmployee() throws ParseException{

		int num;
		int id;
		String name;
		String date;
		Date birth_date;
		int phone;
		String gender;
		List<Task> tasks = new ArrayList<Task>();
		List<Qualification> qualifications = new ArrayList<Qualification>();
		Department department;
		List<Project> projects = new ArrayList<Project>();
		
		System.out.println("Please fill the following data");
		System.out.println("Employee Id:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Employee Name:");
		name = sc.nextLine();
		System.out.println(name);
		System.out.println("Employee Birth Date as 'dd/mm/yyyy': ");
		date = sc.next();
		System.out.println(date);
		birth_date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println("Employee Phone:");
		phone = sc.nextInt();
		sc.nextLine();
		System.out.println("Employee Gender:");
		gender = sc.next();
		System.out.println("Number of tasks for the Employee:");
		num = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<num;++i){
			System.out.println("Please enter task #"+(i+1)+":");
			String task = sc.nextLine();
			tasks.add(new Task(task,null,null,null,null));
		}
		System.out.println("Number of Qualifications for the Employee:");
		num = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<num;++i){
			System.out.println("Please enter qualification #"+(i+1)+":");
			String qual = sc.nextLine();
			qualifications.add(new Qualification(qual));
		}
		System.out.println("Employee Departments:");
		String dep = sc.next();
		department = new Department(dep,null,null);
		System.out.println("Number of projects for the Employee:");
		num = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<num;++i){
			System.out.println("Please enter project #"+(i+1)+":");
			String pro = sc.nextLine();
			projects.add(new Project(1, pro,null,null,null));
		}
		
		return new Employee(id, name, birth_date, phone, gender, tasks, 
				qualifications, department, projects);
	}
	
	public static Task addingNewTask() {
		
		String task_name, status;
		List<Qualification> qualifications = new ArrayList<Qualification>();
		List<Employee> employees =  new ArrayList<Employee>();
		List<Task> sub_tasks =  new ArrayList<Task>();
		int num;
		
		System.out.println("Please fill the following data");
		System.out.println("Task Name:");
		task_name = sc.nextLine();
		
		System.out.println("Number of employees workinf on this task:");
		num = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<num;++i){
			System.out.println("Please enter employee's id #"+(i+1)+":");
			int id = sc.nextInt();
			sc.nextLine();
			employees.add(new Employee(id, null, null, 3, null, null, null, null, null));
			
		}
		
		return new Task(null, null, null, null, null);
	}
	
}

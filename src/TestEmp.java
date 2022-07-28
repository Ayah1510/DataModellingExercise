import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args){
		
		while(true){
			System.out.println("\tMain Menu");
			System.out.println("-----------------------------");
			System.out.println("1. Adding new object");
			System.out.println("2. Editing existing object");
			System.out.println("3. List the contents");
			System.out.println("4. Exit Program");

			Scanner sc = new Scanner(System.in);
	
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
				case 1: System.out.println("Please fill the following data");
						System.out.println("Employee Id:");
						choice = sc.nextInt();
						System.out.println("Employee Name:");
						choice = sc.nextInt();
						System.out.println("Employee Birth Date:");
						choice = sc.nextInt();
						System.out.println("Employee Phone:");
						choice = sc.nextInt();
						System.out.println("Employee Gender:");
						choice = sc.nextInt();
						System.out.println("Employee Tasks:");
						choice = sc.nextInt();
						
						
						
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
			
			
			

			System.out.println();
		
		
		
		}
	}
}

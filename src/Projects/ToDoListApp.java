package Projects;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String> tasks = new ArrayList<>();
			boolean exit = false;

			while (!exit) {
				System.out.println("\nTo-Do List Application");
				System.out.println("1. Add Task");
				System.out.println("2. View Tasks");
				System.out.println("3. Mark Task as Complete");
				System.out.println("4. Delete Task");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");

				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) {
				case 1:
					System.out.print("Enter task description: ");
					String task = scanner.nextLine();
					tasks.add(task);
					System.out.println("Task added successfully!");
					break;

				case 2:
					System.out.println("Tasks:");
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + ". " + tasks.get(i));
					}
					break;

				case 3:
					System.out.print("Enter task number to mark as complete: ");
					int taskNumber = scanner.nextInt();
					if (taskNumber >= 1 && taskNumber <= tasks.size()) {
						tasks.remove(taskNumber - 1);
						System.out.println("Task marked as complete!");
					} else {
						System.out.println("Invalid task number.");
					}
					break;

				case 4:
					System.out.print("Enter task number to delete: ");
					taskNumber = scanner.nextInt();
					if (taskNumber >= 1 && taskNumber <= tasks.size()) {
						tasks.remove(taskNumber - 1);
						System.out.println("Task deleted successfully!");
					} else {
						System.out.println("Invalid task number.");
					}
					break;

				case 5:
					exit = true;
					System.out.println("Exiting To-Do List Application.");
					break;

				default:
					System.out.println("Invalid choice.");
				}
			}
		}
	}
}
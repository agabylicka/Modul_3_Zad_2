import java.util.Scanner;
import org.trzcinska.TodoList;

public class Main {
    public static void main(String[] args) {
        TodoList todos = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String task;
        do {
            System.out.println("If You want quit, write: exit");
            System.out.println("To add task, write: add");
            System.out.println("To remove your task, write: remove");
            System.out.println("To print your tasks, write: print");
            System.out.println("What do You choose:");
            task = scanner.nextLine();
            if (task.equals("add")) {
                System.out.println("Give me content of the task.");
                String content = scanner.nextLine();
                todos.add(content);
            } else if (task.equals("remove")) {
                System.out.println("Which task's number, do You want to remove.");
                int number = Integer.parseInt(scanner.nextLine());
                todos.remove(number);
            } else if (task.equals("print")) {
                todos.print();
            }
        } while (!(task.equals("exit")));

    }
}

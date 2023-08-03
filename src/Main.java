import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        Task task1 = new OneTimeTask("Buy groceries", "Milk, eggs, bread", LocalDateTime.of(2023, 2, 23, 14, 0), Type.PERSONAL);
        Task task2 = new DailyTask("Go for a run", "Around the park", LocalDateTime.of(2023, 2, 23, 6, 0), Type.WORK);
        Task task3 = new WeeklyTask("Clean the house", "Vacuum and dust", LocalDateTime.of(2023, 2, 26, 10, 0), Type.PERSONAL, 6);

        // Create a TaskService and add the tasks
        TaskService taskService = new TaskService();
        taskService.add(task1);
        taskService.add(task2);
        taskService.add(task3);

        // Print all tasks
        System.out.println("All tasks:");
        taskService.getAll().forEach(System.out::println);
        System.out.println();

        // Update a task description
        taskService.updateDescription(1, "Milk, eggs, bread, cheese");

        System.out.println(task1);
        System.out.println();


        // Update a task title

        taskService.updateTitle(2, "Morning jog");
        System.out.println(task2);
        System.out.println();

        // Remove a task

        taskService.remove(3);
        System.out.println("All removed tasks!:");
        System.out.println(taskService.getRemovedTasks());
        System.out.println();



        // Print all tasks grouped by date
        System.out.println("All tasks grouped by date:");
        Map<LocalDate, List<Task>> tasksByDate = taskService.getAll().stream()
                .collect(Collectors.groupingBy(task -> task.getDateTime().toLocalDate()));
        tasksByDate.forEach((date, tasks) -> {
            System.out.println(date);
            tasks.forEach(task -> System.out.println("- " + task));
        });
        System.out.println();



        // Print all tasks for a specific date
        LocalDate date = LocalDate.of(2023, 2, 23);
        System.out.println("All tasks for " + date + ":");
        taskService.getAll().stream()
                .filter(task -> task.appearsIn(date))
                .forEach(task -> System.out.println("- " + task));
        System.out.println();
    }
}
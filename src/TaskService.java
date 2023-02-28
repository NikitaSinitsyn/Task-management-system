import Exceptions.IncorrectArgumentException;
import Exceptions.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;

public class TaskService {
    private Map<Integer, Task> taskMap = new HashMap<>();
    private Collection<Task> removedTasks = new ArrayList<>();


    public void add(Task task)  {
        try {
            Validator.validateTask(task);
            taskMap.put(task.getId(), task);
        } catch (IncorrectArgumentException e){
            System.err.println(e.getMessage());
        }

    }

    public void updateDescription(int taskId, String description) {
        Task task = taskMap.get(taskId);
        if (task == null) {
            try {
                throw new TaskNotFoundException("Task not found: " + taskId);
            } catch (TaskNotFoundException e) {
                System.err.println(e.getMessage());;
            }
        }
        try {
            System.out.println("Updated task description:");
            assert task != null;
            task.setDescription(description);
            Validator.validateTask(task);
        } catch (IncorrectArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    public void updateTitle(int taskId, String title) {
        Task task = taskMap.get(taskId);
        if (task == null) {
            try {
                throw new TaskNotFoundException("Task not found: " + taskId);
            } catch (TaskNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
        try {
            System.out.println("Updated task title:");
            assert task != null;
            task.setTitle(title);
            Validator.validateTask(task);
        } catch (IncorrectArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    public Collection<Task> getRemovedTasks() {
        return removedTasks;
    }

    public void remove(int taskId) {
        Task task = taskMap.remove(taskId);

        if (task == null) {
            try {
                throw new TaskNotFoundException("Task not found: " + taskId);
            } catch (TaskNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
        try {
            assert task != null;
            Validator.validateTask(task);
            taskMap.remove(taskId);
            System.out.println("Removed task:" + task);
            removedTasks.add(task);
        } catch (IncorrectArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

    public Map<LocalDate, Collection<Task>> getAllGroupedByDate() {
        Map<LocalDate, Collection<Task>> result = new HashMap<>();

        for (Task task : taskMap.values()) {
            LocalDate date = task.getDateTime().toLocalDate();
            result.computeIfAbsent(date, k -> new ArrayList<>()).add(task);
        }
        return result;
    }


    public Collection<Task> getAllByDate(LocalDate date) {
        List<Task> result = new ArrayList<>();

        for (Task task : taskMap.values()) {
            if (task.appearsIn(date)) {
                result.add(task);
            }
        }

        return result;
    }

    public Collection<Task> getAll() {
        return taskMap.values();
    }
}


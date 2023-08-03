import Exceptions.IncorrectArgumentException;

public class Validator {
    public static void validateTask(Task task) throws IncorrectArgumentException {
        if (task.getDescription() == null || task.getDescription().isEmpty()) {
            throw new IncorrectArgumentException("Description cannot be empty", "description");
        }

        if (task.getType() == null) {
            throw new IncorrectArgumentException("Type cannot be null", "type");
        }

        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IncorrectArgumentException("Title cannot be empty", "title");
        }

        if (task.getDateTime() == null) {
            throw new IncorrectArgumentException("DateTime cannot be null", "dateTime");
        }
    }
}

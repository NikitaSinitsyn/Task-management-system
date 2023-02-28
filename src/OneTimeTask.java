import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, String description, LocalDateTime dateTime, Type type) {
        super(title, description, dateTime, type);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return date.equals(getDateTime().toLocalDate());
    }


}


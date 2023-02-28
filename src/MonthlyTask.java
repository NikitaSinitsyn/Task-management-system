import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    private int dayOfMonth;
    public MonthlyTask(String title, String description, LocalDateTime dateTime, Type type, int dayOfMonth) {
        super(title, description, dateTime, type);
        this.dayOfMonth = dayOfMonth;
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return date.getDayOfMonth() == dayOfMonth;
    }
}
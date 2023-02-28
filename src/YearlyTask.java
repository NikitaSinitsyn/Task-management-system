import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {
    private int dayOfYear;

    public YearlyTask(String title, String description, LocalDateTime dateTime, Type type) {
        super(title, description, dateTime, type);
        this.dayOfYear = dayOfYear;
    }


    @Override
    public boolean appearsIn(LocalDate date) {
        return date.getDayOfYear() == dayOfYear;
    }

}

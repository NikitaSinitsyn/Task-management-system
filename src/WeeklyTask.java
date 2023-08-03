import java.time.LocalDate;
import java.time.LocalDateTime;

class WeeklyTask extends Task {
    private int dayOfWeek;

    public WeeklyTask(String title, String description, LocalDateTime dateTime, Type type, int dayOfWeek) {
        super(title, description, dateTime, type);
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return date.getDayOfWeek().getValue() == dayOfWeek;
    }

}

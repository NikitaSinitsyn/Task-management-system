import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private static int idGenerator = 0;

    private int id;
    private String title;
    private String description;
    private LocalDateTime dateTime;
    private Type type;

    public Task(String title, String description, LocalDateTime dateTime, Type type) {
        this.id = ++idGenerator;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Type getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, dateTime, type, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Task)) {
            return false;
        }

        Task other = (Task) obj;
        return id == other.id &&
                description.equals(other.description) &&
                dateTime.equals(other.dateTime) &&
                type == other.type &&
                title.equals(other.title);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", type=" + type +
                '}';
    }

    public abstract boolean appearsIn(LocalDate date);

}

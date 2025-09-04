import java.util.Objects;

public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;

    public Course(int id, String label, int credits, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getCredits() {
        return credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", credits=" + credits +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id &&
                credits == course.credits &&
                Objects.equals(label, course.label) &&
                Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, credits, teacher);
    }
}

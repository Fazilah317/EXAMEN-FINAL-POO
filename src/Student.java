import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private String group;
    private Tutor tutor;

    public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, String email, String phoneNumber, String group, Tutor tutor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public String getStudentDetails() {
        return String.format("ID: %d, Name: %s %s, DOB: %s, Email: %s, Phone: %s, Group: %s, Tutor: %s",
                id, firstName, lastName, dateOfBirth, email, phoneNumber, group, tutor != null ? tutor.getFirstName() + " " + tutor.getLastName() : "None");
    }
}
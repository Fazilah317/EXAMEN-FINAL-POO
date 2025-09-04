import java.time.LocalDate;

public class Tutor {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private String relationshipDescription;

    public Tutor(int id, String firstName, String lastName, LocalDate dateOfBirth, String email, String phoneNumber, String relationshipDescription) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.relationshipDescription = relationshipDescription;
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

    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", relationshipDescription='" + relationshipDescription + '\'' +
                '}';
    }
}
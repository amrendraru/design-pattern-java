package creational.Builder;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private String designation;
    private String dateOfJoining;

    public  Employee(EmployeeBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email= builder.getEmail();
        this.designation = builder.getDesignation();
        this.dateOfJoining = builder.getDateOfJoining();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                '}';
    }
}

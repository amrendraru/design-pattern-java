package creational.Builder;

public class EmployeeBuilder  implements  IBuilder{

    private String firstName;
    private String lastName;
    private String email;
    private String designation;
    private String dateOfJoining;

    @Override
    public EmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public EmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public EmployeeBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public EmployeeBuilder designation(String designation) {
        this.designation = designation;
        return this;
    }

    @Override
    public EmployeeBuilder dateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }
}

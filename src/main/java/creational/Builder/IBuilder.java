package creational.Builder;

public interface IBuilder {

    IBuilder firstName(String firstName);
    IBuilder lastName(String lastName);
    IBuilder email(String email);
    IBuilder designation(String designation);
    IBuilder dateOfJoining(String dateOfJoining);
}

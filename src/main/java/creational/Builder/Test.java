package creational.Builder;

public class Test {

    public static void main(String[] args) {

        Employee employee = new EmployeeBuilder().firstName("Shailendra").lastName("Singh").dateOfJoining("09/04/2022").email("abc@gmail.com").build();
        System.out.println(employee);
    }
}

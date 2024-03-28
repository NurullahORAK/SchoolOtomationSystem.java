public class Manager extends Identy{
    private String salary;

    public String getSalary() {
        return salary;
    }

    public Manager(String firstName, String lastName, String tck_No, String salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.tck_No=tck_No;
        this.salary=salary;
    }
}

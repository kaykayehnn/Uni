import java.util.Date;

public class Staff extends Employee {
    private String department;

    protected Staff(String name, int age, String personalID, Date joinedAt, String department) {
        super(name, age, personalID, joinedAt);

        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%s and works in %s", super.toString(), this.department);
    }
}

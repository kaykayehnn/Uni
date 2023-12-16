import java.util.Date;

public abstract class Employee extends Person {
    private String personalID;
    private Date joinedAt;

    protected Employee(String name, int age, String personalID, Date joinedAt) {
        super(name, age);

        this.personalID = personalID;
        this.joinedAt = joinedAt;
    }

    @Override
    public String toString() {
        return String.format("%s, PID: %s, joined at %s", super.toString(), this.personalID, this.joinedAt.toString());
    }
}

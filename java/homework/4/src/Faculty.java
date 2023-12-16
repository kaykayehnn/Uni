import java.util.Date;

public class Faculty extends Employee {
    private String degree;

    protected Faculty(String name, int age, String personalID, Date joinedAt, String degree) {
        super(name, age, personalID, joinedAt);

        this.degree = degree;
    }

    @Override
    public String toString() {
        return String.format("%s and is a %s", super.toString(), this.degree);
    }
}

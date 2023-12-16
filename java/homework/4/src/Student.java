public class Student extends Person {
    private String facultyNumber;
    private String specialty;

    public Student(String name, int age, String facultyNumber, String specialty) {
        super(name, age);

        this.facultyNumber = facultyNumber;
        this.specialty = specialty;
    }

    @Override
    public java.lang.String toString() {
        return String.format("%s, FN: %s and studies %s", super.toString(), this.facultyNumber, this.specialty);
    }
}

public class Intern extends  Employee {

    private static final int SALARY_LIMIT = 20_000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(int salary) throws IllegalArgumentException {
        if (salary <= SALARY_LIMIT) super.setSalary(salary);
        else throw new IllegalArgumentException("salary must not exceed " + SALARY_LIMIT);
    }
}

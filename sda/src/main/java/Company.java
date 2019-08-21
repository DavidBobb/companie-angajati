import java.util.List;

public class Company {

    private String name;
    private List<Candidate> employee;
    private List<Department> departments;

    public Company(String name, List<Candidate> employee, List<Department> departments) {
        this.name = name;
        this.employee = employee;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Candidate> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Candidate> employee) {
        this.employee = employee;
    }

    public void recruits() {

    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}

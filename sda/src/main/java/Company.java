import java.util.List;

public class Company {

    private String name;
    private List<Candidate> employee;
    private List<Department> departments;

    public Company(String name) {
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

    //to be implemented
    public void recruit(Candidate candidate) {
        if (candidate.getDepartmentName().equalsIgnoreCase("Marketing")) {
            Marketing m = new Marketing();
            CandidateStatus status = m.evaluate(candidate);
            candidate.setCandidateStatus(status);
        } else if (candidate.getDepartmentName().equalsIgnoreCase("Production")) {
            Production p = new Production();
            CandidateStatus status = p.evaluate(candidate);
            candidate.setCandidateStatus(status);
        } else {
            throw new IncapacityOfEvaluation("The candidate can't be evaluated.");
        }
    }
}

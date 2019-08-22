public class Candidate {

    private String firstName;
    private String secondName;
    private String departmentName;
    private int skillLevel;
    private CandidateStatus candidateStatus;

    public Candidate(String firstName, String secondName, String departmentName, int skillLevel) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.departmentName = departmentName;
        this.skillLevel = skillLevel;
        this.candidateStatus = CandidateStatus.WAITING;
    }

    public CandidateStatus getCandidateStatus() {
        return candidateStatus;
    }

    public void setCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}

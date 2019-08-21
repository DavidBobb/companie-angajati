public class Candidate {

    private String firstName;
    private String secondName;
    private String depositName;
    private int skillLevel;

    public Candidate(String firstName, String secondName, String depositName, int skillLevel) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.depositName = depositName;
        this.skillLevel = skillLevel;
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

    public String getDepositName() {
        return depositName;
    }

    public void setDepositName(String depositName) {
        this.depositName = depositName;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}

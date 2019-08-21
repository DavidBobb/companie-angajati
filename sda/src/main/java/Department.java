public class Department {

    private String name;
    private int nimLevelOfSkill;

    public Department() {
    }

    public Department(String name, int nimLevelOfSkill) {
        this.name = name;
        this.nimLevelOfSkill = nimLevelOfSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNimLevelOfSkill() {
        return nimLevelOfSkill;
    }

    public void setNimLevelOfSkill(int nimLevelOfSkill) {
        this.nimLevelOfSkill = nimLevelOfSkill;
    }
}

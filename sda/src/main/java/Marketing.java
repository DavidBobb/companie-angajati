public class Marketing extends Department implements Evaluator {

    public Marketing() {
        super("Marketing", 6);
    }

    public CandidateStatus evaluate(Candidate candidate) {
        if (candidate.getSkillLevel() > super.getMinLevelOfSkill()) {
            return CandidateStatus.ACCEPTED;
        } else if (candidate.getSkillLevel() < super.getMinLevelOfSkill()) {
            return CandidateStatus.REJECTED;
        } else {
            return CandidateStatus.WAITING;
        }
    }
}

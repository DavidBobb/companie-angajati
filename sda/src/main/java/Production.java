public class Production extends Department implements Evaluator {

    public Production() {
        super("Production", 3);
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

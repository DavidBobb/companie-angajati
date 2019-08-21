public class Production extends Department implements Evaluator {

    public CandidateStatus evaluate(Candidate candidat) {

        return CandidateStatus.ACCEPTED;
    }
}

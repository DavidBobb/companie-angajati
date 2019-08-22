import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("SDA_Company");

        Department departmentMarketing = new Marketing();
        Department departmentProduction = new Production();
        Department departmentHr = new Department("Hr", 5);

        List<Department> departments = new ArrayList<>();
        departments.add(departmentMarketing);
        departments.add(departmentProduction);
        departments.add(departmentHr);

        company.setDepartments(departments);

        Candidate firstCandidate = new Candidate("Ionut", "Ionescu", "Marketing", 10);
        Candidate secondCandidate = new Candidate("Ioana", "Vladescu", "Production", 1);
        Candidate thirdCandidate = new Candidate("Andrei", "Pascu", "Production", 7);
        Candidate fourthCandidate = new Candidate("Calin", "Mesteacan", "HR", 3);

        List<Candidate> candidates = new ArrayList<>();
        candidates.add(firstCandidate);
        candidates.add(secondCandidate);
        candidates.add(thirdCandidate);
        candidates.add(fourthCandidate);

        company.setEmployee(candidates);

        for (Candidate i : candidates) {
            try {
                company.recruit(i);
                System.out.println(i.getCandidateStatus());
            } catch (IncapacityOfEvaluation e){
                System.out.println("Recruitment exception !");
            }
            
        }
    }
}

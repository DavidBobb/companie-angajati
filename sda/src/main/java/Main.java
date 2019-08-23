import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

        try {
            company.recruit();
        } catch (IncapacityOfEvaluation e) {
        }

        writeCandidatesToTxtFile(company.getEmployee());

    }

    public static void writeCandidatesToTxtFile(List<Candidate> candidates) {

        BufferedWriter writer = null;
        try {

            String str = "Hello";
            writer = new BufferedWriter(new FileWriter("candidates.exe"));
            writer.write(candidates.toString());

            writer.close();
        } catch (IOException e) {

        } finally {
            try {
                writer.close();
            } catch (IOException e) {

            }
        }

    }
}


package mapperInStreams;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResultTest {
    public static void main(String[] args) {
        Map<String, Integer> subjectsAndMarks = new HashMap<>();
        subjectsAndMarks.put("Math", 85);
        subjectsAndMarks.put("English", 50);
        subjectsAndMarks.put("History", 30);
        subjectsAndMarks.put("Physics", 45);
        subjectsAndMarks.put("Biology", 38);


        StudentMarks student = new StudentMarks("Arun", subjectsAndMarks);
        final int passingMark = 40;


        List<String> passedSubjects = subjectsAndMarks.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= passingMark)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        List<String> failedSubjects = subjectsAndMarks.entrySet()
                .stream()
                .filter(entry -> entry.getValue() < passingMark)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Passed Subjects: " + passedSubjects);
        System.out.println("Failed Subjects: " + failedSubjects);
        //==================================================================





    }
}

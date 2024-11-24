package mapperInStreams;

import java.util.Map;

public class StudentMarks {
    private String name;
    private Map<String, Integer> subjectsAndMarks;

    public StudentMarks(String name, Map<String, Integer> subjectsAndMarks) {
        this.name = name;
        this.subjectsAndMarks = subjectsAndMarks;

    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getSubjectsAndMarks() {
        return subjectsAndMarks;
    }


}

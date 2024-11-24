package streamsndFlateMapExample;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String Name;
    private List<Employee> employeeList=new ArrayList<>();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public void add(Employee employee){
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

package streamsndFlateMapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CompanyTest {
    public static void main(String[] args) {
        Department department1=new Department();
        department1.setName("Devops Dept");

        Employee employee1=new Employee();
        employee1.setEmpname("kiran");
        employee1.setEmpId(1);
        employee1.setSalary(20000.0);

        Employee employee2=new Employee();
        employee2.setEmpname("Divya");
        employee2.setEmpId(2);
        employee2.setSalary(18000.0);

        department1.add(employee1);
        department1.add(employee2);

        Department department2=new Department();
        department2.setName("Back End");

        Employee backendemp1=new Employee();
        backendemp1.setEmpname("naresh");
        backendemp1.setEmpId(9);
        backendemp1.setSalary(40000.0);

        Employee backendEmp2=new Employee();
        backendEmp2.setEmpname("upendra");
        backendEmp2.setEmpId(8);
        backendEmp2.setSalary(15000.0);

        department2.add(backendemp1);
        department2.add(backendEmp2);


        List<Department> dept=new ArrayList<>();
        dept.add(department1);
        dept.add(department2);

        List<String> empnamelist =dept.stream().map(Department::getName).collect(Collectors.toList());
        System.out.println("list of name"+empnamelist);




        Optional<Employee> companyMaxSalaryEmployee = dept.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .max((o1, o2) -> o1.compareTo(o2));

        companyMaxSalaryEmployee.ifPresent(employee ->
                System.out.println("Company-wide Max Salary: " + employee));
       // Map<Employee> averagesalary=


        dept.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .max((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("  Max Salary Employee: " + employee);
            });
        });



        Optional<Employee> companyMaxSalaryEmployee1 = dept.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .min((o1, o2) -> o1.compareTo(o2));

        companyMaxSalaryEmployee1.ifPresent(employee ->
                System.out.println("Company minimum  Salary: " + employee));


        dept.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .min((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("  minimum Salary Employee: " + employee);
            });
            double departmentAverageSalary = department.getEmployeeList().stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0.0);

            System.out.println("  Average Salary: " + departmentAverageSalary);


        });

    }
}





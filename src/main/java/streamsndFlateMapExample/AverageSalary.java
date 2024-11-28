package streamsndFlateMapExample;

import java.util.*;

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> averagesalary = new ArrayList<>();

        Department department2=new Department();
        department2.setName("Devops Dept");

        Employee employee1 = new Employee();
        employee1.setEmpname("kiran");
        employee1.setEmpId(1);
        employee1.setSalary(20000.0);
        employee1.setDept("CSE");

        Employee employee2 = new Employee();
        employee2.setEmpname("Divya");
        employee2.setEmpId(2);
        employee2.setSalary(18000.0);
        employee2.setDept("IT");


        department2.add(employee1);
        department2.add(employee2);


        Department department3=new Department();
        department3.setName("Back End");



        Employee backendemp1 = new Employee();
        backendemp1.setEmpname("naresh");
        backendemp1.setEmpId(9);
        backendemp1.setSalary(40000.0);
        backendemp1.setDept("ECE");

        Employee tester = new Employee();
        tester.setEmpname("naresh");
        tester.setSalary(50000.0);
        tester.setEmpId(6);
        tester.setDept("EEE");

        department3.add(backendemp1);
        department3.add(tester);

        List<Department> dept =new ArrayList<>();
        dept.add(department2);
        dept.add(department3);


        averagesalary.add(employee1);
        averagesalary.add(employee2);
        averagesalary.add(backendemp1);
        averagesalary.add(tester);
        Map<String, Double> averagesalarymap = new HashMap<>();
        Map<String, Integer> deptCountMap = new HashMap<>();
        Map<String, Double> maxsalarymap = new HashMap<>();
        Map<String,Double>  deptMinSalary = new HashMap<>();
        Double companyMaxSalary =averagesalary.get(0).getSalary();
        Double comapnyMinSalary = averagesalary.get(0).getSalary();


        Iterator<Employee> itrListemp = averagesalary.iterator();
        while (itrListemp.hasNext()) {
            Employee emp = itrListemp.next();
            Double salary = emp.getSalary();
            String department = emp.getDept();
            if (averagesalarymap.containsKey(emp.getDept())) {
                Double d = averagesalarymap.get(emp.getDept());
                Double total = d + emp.getSalary();
                averagesalarymap.put(emp.getDept(), total);
                int count = deptCountMap.get(emp.getDept());
                int totalcount = count + 1;
                deptCountMap.put(emp.getDept(), totalcount);
            } else {
                averagesalarymap.put(emp.getDept(), emp.getSalary());
                deptCountMap.put(emp.getDept(), 1);
                maxsalarymap.put(department,salary);  // initiallize into deptmaxmap
                deptMinSalary.put(department,salary);
            }
            if(salary >  maxsalarymap.get(department)){
                maxsalarymap.put(department,salary);

            }
            if(salary < deptMinSalary.get(department) ){
                deptMinSalary.put(department,salary);
            }
            if(salary>companyMaxSalary){
                companyMaxSalary= salary;

            }
            if(salary<comapnyMinSalary){
                comapnyMinSalary= salary;
            }
        }
        System.out.println("total salary" + averagesalarymap);
        System.out.println("total count" + deptCountMap);


        //=================================================================

        Iterator<String> deptIterator = averagesalarymap.keySet().iterator();
        while (deptIterator.hasNext()) {


            String dept1 = deptIterator.next();
            Double totalSalary = averagesalarymap.get(dept1);
            int totalcount = deptCountMap.get(dept1);

            System.out.println("Average salary by dept" + totalSalary / totalcount);
        }
        Iterator<Employee> itrListempMax = averagesalary.iterator();
        while (itrListempMax.hasNext()) {
            Employee emp2 = itrListempMax.next();
            if (maxsalarymap.containsKey(emp2.getDept())) {
                Double currentMaxSalary = maxsalarymap.get(emp2.getDept());
                if (emp2.getSalary() > currentMaxSalary) {
                    maxsalarymap.put(emp2.getDept(), emp2.getSalary());
                }
            } else {
                maxsalarymap.put(emp2.getDept(), emp2.getSalary());
            }
            if (maxsalarymap.containsKey(emp2.getDept())) {

                maxsalarymap.put(emp2.getDept(), maxsalarymap.get(emp2.getDept()) + emp2.getSalary());
                deptCountMap.put(emp2.getDept(), deptCountMap.get(emp2.getDept()) + 1);
            } else {

                maxsalarymap.put(emp2.getDept(), emp2.getSalary());
                deptCountMap.put(emp2.getDept(), 1);
            }
        }


        for (String dept1 : maxsalarymap.keySet()) {
            double totalSalary = maxsalarymap.get(dept1);
            int employeeCount = deptCountMap.get(dept1);
            double averageSalary = totalSalary / employeeCount;
            System.out.println("Department: " + dept);
            System.out.println("Max Salary: " + maxsalarymap.get(dept1));
            System.out.println("Average Salary: " + averageSalary);

        }
        System.out.println(" company max salary" +companyMaxSalary);
        System.out.println(" company min salary " + comapnyMinSalary);


    }
}


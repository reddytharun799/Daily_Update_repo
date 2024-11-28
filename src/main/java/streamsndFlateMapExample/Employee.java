package streamsndFlateMapExample;

public class Employee implements Comparable<Employee>{
    private String empname;
    private int empId;
    private double salary;
    private String dept;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        if (this.salary > other.salary)
            return 1;
        else
            return -1;
    }
}

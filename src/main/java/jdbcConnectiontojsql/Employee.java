package jdbcConnectiontojsql;

public class Employee {

    private int empid;
    private String name;
    private String dept;
    private double salary;
    private String state;
    private int mid;

    public Employee(int empid, String name, String dept, double salary) {
        this.empid=empid;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }



    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}

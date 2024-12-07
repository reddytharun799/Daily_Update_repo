package jdbcConnectiontojsql;

import java.util.Date;
import java.util.List;

public class Project {
        private int id;
        private String pname;
        private Date startDate;
        private Date enddate;
        private List<Employee> EmpAllocation;
        private List<Employee> employeeList;


    public Project(int id, String pname, Date startDate, Date enddate,  List<Employee> employeeList) {
        this.id = id;
        this.pname = pname;
        this.startDate = startDate;
        this.enddate = enddate;
       // EmpAllocation = empAllocation;
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;

    }

    public void add(Employee employee){
        this.employeeList.add(employee);
    }

//    public List<Employee> getEmpAllocation() {
//        return EmpAllocation;
//    }
//
//    public void setEmpAllocation(List<Employee> empAllocation) {
//        EmpAllocation = empAllocation;
//    }
}



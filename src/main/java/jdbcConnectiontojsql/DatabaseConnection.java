package jdbcConnectiontojsql;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseConnection {

    public static List<Project> getEmpAllocation() {


           // List<Employee> employees = new ArrayList<>();

        // List<Project> projects = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "root", "sonar");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Empid,name,salary,dept from sonar.Employee");
           // List<Employee> employees=new ArrayList<>();


            while (resultSet.next()) {
                int empId = resultSet.getInt("Empid");
                String name = resultSet.getString("name");
                String dept = resultSet.getString("dept");
                double salary = resultSet.getDouble("salary");
                //employees.add(new Employee(name,dept,salary))
            }



                System.out.println("Employee ID: " + resultSet.getInt("Empid") + ", Employee Name: " + resultSet.getString("name")+",Project id:"+resultSet.getDouble("salary"));






        } catch (ClassNotFoundException e) {
            System.out.println("classnotfound exception" +e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }

            return null;
        }



}


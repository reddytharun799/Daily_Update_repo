package realtimeProjectOnATM;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {

        //String sql ="select Empid,name,dept,salary from sonar.Employee";
        String sql ="select * from sonar.Employee e inner join sonar.Project f where e.pid=f.id";
        //String sql ="select * from sonar.Project e Left join sonar.Employee f where e.id=f.pid";
        String jdbcURL = "jdbc:mysql://localhost:3307/sonar";
        String username = "sonar";
        String password = "sonar";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database successfully!");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()) {
                int id = resultSet.getInt("Empid");
                String name = resultSet.getString("name");
                String dept = resultSet.getString("dept");
                String salary = resultSet.getString("salary");
                System.out.println(name);
                System.out.println(id);
                System.out.println(dept);
                System.out.println(salary);
            }



            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
 }
}

}

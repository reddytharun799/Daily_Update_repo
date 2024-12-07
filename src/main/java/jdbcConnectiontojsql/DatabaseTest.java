package jdbcConnectiontojsql;

import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;

public class DatabaseTest {

    public static void main(String[] args) {
        DatabaseConnection.getEmpAllocation();
        DbService.getProjectAllocationEmployees();
    }
}

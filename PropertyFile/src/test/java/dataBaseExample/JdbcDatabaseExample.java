package dataBaseExample;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;


public class JdbcDatabaseExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +port+ "/kowshik", "root","Richu@123" );
        Statement s =con.createStatement();
        ResultSet rs = s.executeQuery("select * from EmployeeInfo where id = 4");
        while(rs.next()) {//rs.next only point to the currect index or else it will point to base index and show Before start of result set error
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("loaction"));
        System.out.println(rs.getString("age"));
        }
	}

}

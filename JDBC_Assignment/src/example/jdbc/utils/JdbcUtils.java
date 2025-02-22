package example.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

	public static Connection getConnection() throws Exception {

		// Here, 'Class.forName()' is not used because it is not needed/
		// The driver gets loaded automatically.
		String url = "jdbc:mysql://localhost:3306/articles";
		String uid = "root";
		String pwd = "password";

		Connection dbConnection = DriverManager.getConnection(url, uid, pwd);
		return dbConnection;

	}
}

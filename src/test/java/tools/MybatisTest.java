package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MybatisTest {

	@Test
	public void test_01() throws ClassNotFoundException, SQLException {

		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/sinianbla";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select * from user_info");

		while (rs.next()) {
			System.out.println(
					"业务主键：" + rs.getString("id") + "，姓名：" + rs.getString("login_name") + "，手机号：" + rs.getString("mobile"));
		}

	}

}

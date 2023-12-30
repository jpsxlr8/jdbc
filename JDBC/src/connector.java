/*
 * 1.import
 * 2.load and register
 * 3. establish the connection
 * 4. create the statement
 * 5.execute the query
 * 6.process the query
 * 7.close
 */
import java.sql.*;

public class connector {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","9897");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Student where id=7");
		
		rs.next();
		int roll=rs.getInt("Roll no");
		String name=rs.getString("Name");
		String city=rs.getString("City");
		
		System.out.println(roll+" "+name+" "+city);
		
		st.close();
		con.close();
       
	}

}

import java.sql.*;

public class DBTest
{
public static void main(String args[])
{
try
{
	// Load and register
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//Establish connection
	Connection con=DriverManager.getConnection("Jdbc:Odbc:Book");
	//create the statement
	Statement st=con.createStatement();
//insert query

        String query1 = "insert into faculty values ('1912','PGI19CS017','12/22/21','12/31/21','ITC')";
          //st.executeUpdate(query1);  
//update query 
       String query2 = "update faculty set f_id = 'PGI19CS025' where book_no = '1911'";
        //st.executeUpdate(query2);
//delete query
       String query3 = "delete from faculty where book_no='1912'";
       // st.executeUpdate(query3);      

   	String sql="select * from faculty";
	ResultSet rs=st.executeQuery(sql);
	//execute the query.
	System.out.println("\nBook No.  \tFaculty Id\t\tBook_issuedate \t \tBook_returndate\t\tBook_Name");
	//process the query
	while(rs.next())
	{

		System.out.println("\n"+rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
	}
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
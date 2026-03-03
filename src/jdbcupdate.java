import java.sql.*;
public class jdbcupdate {
public static void main(String[] args) throws SQLException {
    String user="postgres";
    String pass="Kumar@1234";
    String url="jdbc:postgresql://localhost:5433/student";
    String sql="update info set stname ='ritik' where sid=8";

    Connection con=DriverManager.getConnection(url,user,pass);
    System.out.println("connection established");
    Statement st=con.createStatement();
    st.executeUpdate(sql);
    con.close();
    System.out.println("connection closed");

}
}

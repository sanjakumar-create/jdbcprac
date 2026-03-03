import java.sql.*;
public class jdbcdelete {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:postgresql://localhost:5433/student";
        String user="postgres";
        String pass="Kumar@1234";
        String sql="delete from info where sid=8";
        Connection con=DriverManager.getConnection(url,user,pass);
        Statement stmt=con.createStatement();
        System.out.println("connections estblishesd");
        stmt.executeUpdate(sql);
        con.close();
        System.out.println("connection closed");

    }
}

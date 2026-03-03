import java.sql.*;

public class jdbcwrite {
    public  static void main(String args[]) throws ClassNotFoundException, SQLException {
       String url="jdbc:postgresql://localhost:5433/student";
       String user="postgres";
       String pass="Kumar@1234";
       String sql="insert into info values ('shubham',8,19)";
       Connection con=DriverManager.getConnection(url,user,pass);
       System.out.println("connection established");
       Statement st=con.createStatement();
         boolean res=st.execute(sql);
       System.out.println(res);
       st.close();
       System.out.println("connection closed");


    }
}

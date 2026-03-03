import java.sql.*;
public class preparedstatemnt {
    public static void main(String[] args) throws SQLException {
        String user="postgres";
        String pass="Kumar@1234";
        String url="jdbc:postgresql://localhost:5433/student";
        String name="sijay";
        int age=19;
        int sid=21;

        String sql="insert into info values (?,?,?)";
        Connection con=DriverManager.getConnection(url,user,pass);
        System.out.println("connection established");
         PreparedStatement st=con.prepareStatement(sql);
         st.setString(1,name);
        st.setInt(2,sid);
        st.setInt(3,age);
        st.execute();
          con.close();
          System.out.println("connection closed");
    }
}

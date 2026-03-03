//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class demoJdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
        * 1.need the jar file import.packaghe
        * 2.load the driver
        * 3.register the driver
        * 4.create connection
        * 5.create statement
        * 6.execute the statement
        * 7.close

        * */
        String url="jdbc:postgresql://localhost:5433/student";
        String uname="postgres";
        String psd="Kumar@1234";
        //String query="Select stname from info where sid=10";
         String sql="select * from info";
        //Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url,uname,psd);
        System.out.println("connection estblish");
         Statement stmt = conn.createStatement();
          ResultSet rs= stmt.executeQuery(sql);
        //System.out.println(rs.next());

        //String name=rs.getString("stname");
           //System.out.println("our student name is :"+name);

        //new tchniwu to print all the data from the table
        //by using the rs.next that will search for the exting the next data and responsible for moving the pointer
        System.out.println("name "+"stid "+"stage");
        while(rs.next()){
              System.out.print(rs.getString(1)+"-");
              System.out.print(rs.getInt(2)+"-");
              System.out.print(rs.getInt(3));
              System.out.println();

          }
           conn.close();
           System.out.println("connection close");
        
    }
}
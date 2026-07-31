package com.ajay;

import java.sql.*;
import java.util.Arrays;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Students","postgres","Ajay@2025");
        con.setAutoCommit(false);
        
        
        //PreparedStatement ps = con.prepareStatement("select * from training");
        //ResultSet rs = ps.executeQuery();
        //while(rs.next()){
            //System.out.println(rs.getInt("courseid")+" "+
                            //rs.getString("name")+" "+
                            //rs.getBoolean("fee")+" "+
                            //rs.getString("department")+" "+
                            //rs.getString("course_name")
            //);
        //}
        //rs.close();
        //PreparedStatement ps1 = con.prepareStatement("delete from training where courseid=?");
        //ps1.setInt(1, 4);
        //int rowsDeleted = ps1.executeUpdate();
        //System.out.println(rowsDeleted+" row(s) deleted");
        //ps.close();
        //ps1.close();
//

        
        
        //st.close();

        //PreparedStatement ps2 = con.prepareStatement("update training set name=? where courseid=?");
        //ps2.setString(1, "Spring Boot");
        //ps2.setInt(2,1);
        //ps2.executeUpdate();
        //con.commit();
        //System.out.println("Record updated successfully");
        // try {

//     PreparedStatement ps = con.prepareStatement(
//         "UPDATE training SET course_name=? WHERE courseid=?"
//     );

//     ps.setString(1, "Spring Boot");
//     ps.setInt(2, 1);
//     ps.executeUpdate();

//     System.out.println("First Update Done");

//     int x = 10 / 0;     // Force an error

//     ps.setString(1, "AI");
//     ps.setInt(2, 2);
//     ps.executeUpdate();

//     con.commit();

// }
//     catch (Exception e) {

//         con.rollback();

//         System.out.println("Transaction Rolled Back");

//     }/


// Batch processing
        PreparedStatement ps= con.prepareStatement("update training set course=?,course_name=? where name=?");

        
        
        
        ps.setString(1,"DA&ML");
        ps.setString(2,"DAwithml");
        ps.setString(3,"siva");
        ps.addBatch();

        ps.setString(1,"MLops&AI");
        ps.setString(2,"MLopswithAI");
        ps.setString(3,"sai");
        
        
        
        ps.addBatch();



        int[] results = ps.executeBatch();
con.commit();

System.out.println(Arrays.toString(results));

        PreparedStatement ps1 = con.prepareStatement("select * from training");
        ResultSet rs1 = ps1.executeQuery();
        ResultSet rs = ps1.executeQuery();

while (rs.next()) {
    System.out.println(
        rs.getInt("courseid") + " " +
        rs.getString("name") + " " +
        rs.getBoolean("fee") + " " +
        rs.getString("course") + " " +
        rs.getString("course_name")
    );
}

rs.close();

        
        ps.close();
        ps1.close();
        con.close();
    }
}

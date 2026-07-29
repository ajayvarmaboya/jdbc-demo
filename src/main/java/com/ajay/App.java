package com.ajay;

import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("URL","username","pass");
        PreparedStatement st= con.prepareStatement("update training set course_name=? where courseid=?");
        st.setString(1, "java");
        st.setInt(2,1);
        st.addBatch();
        st.setString(1, "python");
        st.setInt(2,2);
        st.addBatch();
        st.setString(1, "c++");
        st.setInt(2,3);
        st.addBatch();
        st.setString(1,"c");
        st.setInt(2,4);
        st.addBatch();

        

        st.executeBatch();
        
        PreparedStatement ps = con.prepareStatement("select * from training");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("courseid")+" "+
                            rs.getString("name")+" "+
                            rs.getBoolean("fee")+" "+
                            rs.getString("department")+" "+
                            rs.getString("course_name")
            );
        }
        rs.close();
        PreparedStatement ps1 = con.prepareStatement("delete from training where courseid=?");
        ps1.setInt(1, 4);
        int rowsDeleted = ps1.executeUpdate();
        System.out.println(rowsDeleted+" row(s) deleted");
        ps.close();
        ps1.close();


        
        
        st.close();
        con.close();
    }
}

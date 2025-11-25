package Questions.G_JDBC_Connection;

import java.sql.*;

public class DatabaseConnectivityExample {
    public static void main(String[] args) {
        // Define database connection parameters
        String url = "jdbc:mysql://localhost:3306/testdb"; // Database URL
        String username = "root"; // Database username
        String password = "password"; // Database password
        String query = "SELECT name FROM users"; // SQL query to fetch names
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish a connection to the database
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfully established.");
            // 3. Create a statement object to execute the query
            st = con.createStatement();
            // 4. Execute the query and get the result
            rs = st.executeQuery(query);
            // 5. Iterate through the ResultSet and print the name
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }
        } catch (SQLException ex) {
            // Handle SQL exceptions
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            // Handle ClassNotFoundException (if JDBC driver is not found)
            ex.printStackTrace();
        } finally {
            try {
                // 6. Close ResultSet, Statement, and Connection to release resources
                if (rs != null)
                    rs.close();
                if (st != null)
                    st.close();
                if (con != null)
                    con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

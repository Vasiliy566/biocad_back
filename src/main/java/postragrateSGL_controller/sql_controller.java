package postragrateSGL_controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class sql_controller {
    public static void add_event(String inputs[], Statement st){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, user, password);

        String input_string = "";
     for(int i = 0; i < inputs.length; i ++)
     {input_string += inputs[i];}
     ResultSet rs = con.createStatement().executeQuery("INSERT INTO events VALUES ('test_speaker_5')"));

    }
    public static void main(String[] args) {

        add_event();
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "1234";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             //ResultSet rs = st.executeQuery("SELECT VERSION()"))
             //INSERT INTO test_table (test_column1) VALUES (777)
             //ResultSet rs = st.executeQuery("INSERT INTO test_table (test_column1) VALUES (777)"))
             ResultSet rs = st.executeQuery("INSERT INTO events VALUES ('test_speaker_5')"))
             //String query = "INSERT INTO authors(id, name) VALUES(?, ?)";

        {

            if (rs.next()) {
                System.out.println(rs.getString(1) );
            }

        } catch (SQLException ex) {
            System.out.println(ex);
           // Logger lgr = Logger.getLogger(JavaPostgreSqlVersion.class.getName());
           // lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
package I3.DatabaseOperation.AdminLoginDb;

import I3.DatabaseOperation.DataBaseConnection;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AdminLoginDb extends JFrame {

    private static final String DATABASE_URL = " ";
    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;

    public AdminLoginDb() {conn = DataBaseConnection.connectTODB();}

    private static final String DATABASE_USER_NAME = "ninedev";
    private static final String DATABASE_PASSWORD = "chin2002";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER_NAME, DATABASE_PASSWORD);
    }

}

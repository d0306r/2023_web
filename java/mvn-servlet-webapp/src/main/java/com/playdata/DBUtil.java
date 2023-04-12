package com.playdata;
import javax.servlet.*;
import java.sql.*;

public class DBUtil {
    public static Connection getConnection(ServletContext context) throws SQLException, ClassNotFoundException {
        String url = context.getInitParameter("DB_URL");
        String user = context.getInitParameter("DB_USER");
        String password = context.getInitParameter("DB_PASSWORD");

        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}

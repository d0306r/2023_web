package com.playdata;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.SQLException;

public class DBServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        try {
            // DB connection 객체 생성
            Connection conn = DBUtil.getConnection(context);
            context.setAttribute("dbConnection", conn);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        Connection conn = (Connection) context.getAttribute("dbConnection");
        try {
            // DB connection 객체를 닫는다.
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

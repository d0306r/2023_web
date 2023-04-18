package com.playdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "employee", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        String sql = "select * from employees";
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
        try(Statement stat = con.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("  <meta charset=\"UTF-8\">");
            out.print("  <title>Employees</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("  <table>");
            out.print("    <tr>");
            out.print("      <th>사원번호</th>");
            out.print("      <th>이름</th>");
            out.print("      <th>성</th>");
            out.print("      <th>생일</th>");
            out.print("      <th>성별</th>");
            out.print("      <th>고용일</th>");
            out.print("    </tr>");
            while (rs.next()) {
                out.print("    <tr>");
                out.print("      <td>" + rs.getInt("emp_no") + "</td>");
                out.print("      <td>" + rs.getString("first_name") + "</td>");
                out.print("      <td>" + rs.getString("last_name") + "</td>");
                out.print("      <td>" + rs.getString("birth_date") + "</td>");
                out.print("      <td>" + rs.getString("gender") + "</td>");
                out.print("      <td>" + rs.getString("hire_date") + "</td>");
                out.print("    <tr>");
            }
            out.print("</table>");
            out.print("</body>");
            out.print("</html>");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String empNo = req.getParameter("emp_no");
        String birthDate = req.getParameter("brith_date");
        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        String hireDate = req.getParameter("hire_date");
        String gender = req.getParameter("gender");

        System.out.println("empNo = " + empNo);
        System.out.println("birthDate = " + birthDate);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("hireDate = " + hireDate);
        System.out.println("gender = " + gender);

        String sql = " INSERT INTO employees(emp_no, brith_date, first_name, last_name, hire_date, gender) values(?,?,?,?,?,?)";
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
        try (Statement stat = con.prepareStatement(sql)){
            stat.setInt(1, Pa);

            int rs = stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

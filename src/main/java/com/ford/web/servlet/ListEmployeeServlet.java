package com.ford.web.servlet;

import com.ford.web.service.Employee;
import com.ford.web.service.EmployeeUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ListEmployee")
public class ListEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<p>Listing the employees <br> </p>");
        out.println("<table><tr><th>Name</th><th>id</th><th>department</th></tr>");
        for (Employee emp:EmployeeUtils.viewAllEmployees()) {
            out.println("<tr><td>"+emp.getName()+"</td><td>"+emp.getId()+"</td><td>"+emp.getDepartment()+"</td></tr>");
        }
        out.println("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

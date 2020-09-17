package com.ford.web.servlet;

import com.ford.web.service.Employee;
import com.ford.web.service.EmployeeUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<p>Hi, this is a server</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<p>Hi, this is a server" + req.getParameter("name")+ "</p>");
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String department = req.getParameter("department");
        String salary = req.getParameter("salary");

        EmployeeUtils.addEmployee(new Employee(name,id,department,salary));
        System.out.println(EmployeeUtils.viewAllEmployees());
        //RequestDispatcher forward = req.getRequestDispatcher("/ListEmployee");
        //forward.forward(req,resp);
        resp.sendRedirect("/ListEmployee");
    }
}

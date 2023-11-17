
package com.itsc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/multiplication")
public class MultiplicationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve values from the form
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Perform multiplication
        int result = num1 * num2;

        // Set the result in the request attribute
        request.setAttribute("result", result);

        // Forward the request to the result.jsp page (you can create this page)
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}

package com.itsc;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/operation")
public class OperationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the selected operation from the form
        String operation = request.getParameter("operation");

        // Forward the request to the appropriate servlet based on the selected operation
        if ("+".equals(operation)) {
            request.getRequestDispatcher("/addition").forward(request, response);
        } else if ("*".equals(operation)) {
            request.getRequestDispatcher("/multiplication").forward(request, response);
        } else {
            // Handle other operations or show an error
            response.getWriter().println("Invalid operation");
        }
    }
}

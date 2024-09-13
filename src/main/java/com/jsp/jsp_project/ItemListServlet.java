package com.jsp.jsp_project;

import java.io.*;

import com.jsp.jsp_project.domain.Item;
import com.jsp.jsp_project.list.ItemList;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ItemListServlet", value = "/itemList")
public class ItemListServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        ItemList list = new ItemList();
        out.println("<html><body>");
        out.println("<ul>");
        for (Item item : list.listOfItem()) {
            out.println("<li>" + item.getName() + "</li>");
        }
        out.println("<ul/>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
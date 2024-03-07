package com.example.sof3011_sd18205;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author PhongTT35
 * @description N/A
 **/
@WebServlet("/ahihi")
public class AhihiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter()
                .append("<h1>")
                    .append("Pass SOF3011 10.0 FINAL")
                .append("</h1>")
                .append("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title>Page Title</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>This is a Heading</h1>\n" +
                        "<p>This is a paragraph.</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n" +
                        "\n" +
                        "\n");
    }
}

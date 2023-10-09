/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import dal.AcountDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author QUYBINH
 */
@WebServlet(name = "ForgotPassword", urlPatterns = {"/ForgotPassword"})
public class ForgotPassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("Username");
        String status = "Username doesn't exit.";
        Account acc;
        AcountDBContext db = new AcountDBContext();
        acc = db.checkAccountExist(username);
        if(acc==null){
            request.setAttribute("mess", status);
            request.getRequestDispatcher("ForgotPassword.jsp").forward(request, response);
        }else{
            request.setAttribute("acc", acc);
            request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
        }
    }
}

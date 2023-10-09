/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.AcountDBContext;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ChangePass", urlPatterns = {"/ChangePass"})
public class ChangePass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pass = request.getParameter("password");
        String Npass = request.getParameter("newPassword");
        String username = request.getParameter("username");
        String mess = "Passwords doesn't match.";
        AcountDBContext db = new AcountDBContext();
        Account acc = db.checkAccountExist(username);
        if(pass.equals(Npass)){
            db.UpDatePassWord(pass, username);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            request.setAttribute("acc", acc);
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
        }
    }
}

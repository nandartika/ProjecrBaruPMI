/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controller;

import com.application.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author kartika
 */
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse
            response)
            throws ServletException, IOException {
//initializing...
        RequestDispatcher rd = null;
        HttpSession session = request.getSession();
        if (session.getAttribute("idUser") != null){
            rd = request.getRequestDispatcher("/success");
            rd.forward(request, response);
        }
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String idUser = getIdUser(email,password);
        if (authenticate(email, password)){
//success handler
//session handler
            session.setAttribute("email",email);
            session.setAttribute("password",password);
            session.setAttribute("idUser", idUser);
            rd = request.getRequestDispatcher("/success");
            rd.forward(request, response);
        }else{
//failed handler
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("User does not exist with given username and/or password");
//return to login page
                    rd = request.getRequestDispatcher("/login.jsp");
                    rd.include(request, response);
                    out.close();
        }
    }
    /**login handler
     * @param username String
     * @param password String
     * @return boolean
     */
    public boolean authenticate(String email, String password){
//use hardcode username and password. (jeni and indonesia)
        boolean valid = false;
        UserModel km = new UserModel();
        List<UserModel> data = new ArrayList<UserModel>();
        data = km.cariData(email, password);
        if(data.size() > 0){
            if(email.equals(data.get(0).getEmailUser()) && password.equals(data.get(0).getPassUser())){
                valid = true;
            }
        }
        
        return valid;
    }
    
    public String getIdUser(String email, String password){
//use hardcode username and password. (jeni and indonesia)
        String idUser = "";
        UserModel km = new UserModel();
        List<UserModel> data = new ArrayList<UserModel>();
        data = km.cariData(email, password);
        if(data.size() > 0){
            if(email.equals(data.get(0).getEmailUser()) && password.equals(data.get(0).getPassUser())){
               idUser  = data.get(0).getIdUser();
            }
        }
        
        return idUser;
    }

}

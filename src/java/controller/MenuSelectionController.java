/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MenuItems;

/**
 *
 * @author JoeGollakner
 */
public class MenuSelectionController extends HttpServlet {

    private static final String ORDER_PAGE = "finalOrder.jsp";
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            {
         response.setContentType("text/html");
         
            String m = request.getParameter("menuItem");
            String m2 = request.getParameter("menuItem2");
            String m3 = request.getParameter("menuItem3");
            String m4 = request.getParameter("menuItem4");
            
            MenuItems mi = new MenuItems();
            
            List result = mi.getItems(m.trim());
            List result2 = mi.getItems2(m2.trim());
            List result3 = mi.getItems3(m3.trim());
            List result4 = mi.getItems4(m4.trim());
         
            request.setAttribute("FinalOrder", result);
            request.setAttribute("FinalOrder", result2);
            request.setAttribute("FinalOrder", result3);
            request.setAttribute("FinalOrder", result4);
            
            
            RequestDispatcher view =
                request.getRequestDispatcher(ORDER_PAGE);
        view.forward(request, response);
         
    }
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
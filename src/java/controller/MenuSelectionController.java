/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MenuItems;
import model.MenuPrices;

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
            
         response.setContentType("text/html");
         
            String m = request.getParameter("menuItem");
            String m2 = request.getParameter("menuItem2");
            String m3 = request.getParameter("menuItem3");
            String m4 = request.getParameter("menuItem4");
            
            MenuItems mi = new MenuItems();
            MenuPrices mp = new MenuPrices();
            
            String result = mi.getItems(m.trim());
            String result2 = mi.getItems2(m2.trim());
            String result3 = mi.getItems3(m3.trim());
            String result4 = mi.getItems4(m4.trim());
            
            

            double price = Double.parseDouble(mp.getPrice(m.trim()));
            double price2 = Double.parseDouble(mp.getPrice2(m2.trim()));
            double price3 = Double.parseDouble(mp.getPrice3(m3.trim()));
            double price4 = Double.parseDouble(mp.getPrice4(m4.trim()));
  
            
            String finalOrder = "</br>"  + result;
            String finalOrder2 = "</br>" + result2;
            String finalOrder3 = "</br>" + result3; 
            String finalOrder4 = "</br>" + result4;
            
            double finalPrice = price;
            double finalPrice2 = price2;
            double finalPrice3 = price3;
            double finalPrice4 = price4;
            
         
            request.setAttribute("FinalOrder", finalOrder);
            request.setAttribute("FinalOrder2", finalOrder2);
            request.setAttribute("FinalOrder3", finalOrder3);
            request.setAttribute("FinalOrder4", finalOrder4);
            
            request.setAttribute("FinalPrice", finalPrice);
            request.setAttribute("FinalPrice2", finalPrice2);
            request.setAttribute("FinalPrice3", finalPrice3);
            request.setAttribute("FinalPrice4", finalPrice4);
            
            
            RequestDispatcher view =
                request.getRequestDispatcher(ORDER_PAGE);
        view.forward(request, response);
         
    
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

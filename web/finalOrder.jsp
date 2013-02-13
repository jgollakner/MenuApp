<%-- 
    Document   : finalOrder
    Created on : Feb 4, 2013, 6:47:53 AM
    Author     : JoeGollakner
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final order</title>
    </head>
    <body>
        <h1>Here are the items within your selection!</h1><br />
        <p>
            <%
                Object oMeat = request.getAttribute("FinalOrder");
                Object pMeat = request.getAttribute("FinalPrice");
                String sMeat = "";
                double meatPrice;
                if (oMeat == null || pMeat == null) {

                    out.println("");
                } else {
                    sMeat = (String) oMeat;

                    if (pMeat instanceof Double) {

                        meatPrice = (Double) pMeat;
                        if (meatPrice == 0) {
                            out.println("");
                        } else {
                            out.println(sMeat + "         $" + meatPrice);
                        }
                    }
                }
                Object oPasta = request.getAttribute("FinalOrder2");
                Object pPasta = request.getAttribute("FinalPrice2");
                String sPasta = "";
                double pastaPrice;
                if (oPasta == null || pPasta == null) {

                    out.println("");
                } else {
                    sPasta = (String) oPasta;
                    if (pPasta instanceof Double) {
                        pastaPrice = (Double) pPasta;
                        if (pastaPrice == 0) {
                            out.println("");
                        } else {
                            out.println(sPasta + "         $" + pastaPrice);
                        }
                    }
                }
                Object oDrink = request.getAttribute("FinalOrder3");
                Object pDrink = request.getAttribute("FinalPrice3");
                String sDrink = "";
                double drinkPrice;
                if (oDrink == null || pDrink == null) {

                    out.println("");
                } else {
                    sDrink = (String) oDrink;
                    if (pDrink instanceof Double) {
                        drinkPrice = (Double) pDrink;
                        if (drinkPrice == 0) {
                            out.println("");
                        } else {
                            out.println(sDrink + "         $" + drinkPrice);
                        }
                    }
                }
                Object oDessert = request.getAttribute("FinalOrder4");
                Object pDessert = request.getAttribute("FinalPrice4");
                String sDessert = "";
                double dessertPrice;
                if (oDessert == null || pDessert == null) {

                    out.println("");
                } else {
                    sDessert = (String) oDessert;
                    if (pDessert instanceof Double) {
                        dessertPrice = (Double) pDessert;
                        if (dessertPrice == 0) {
                            out.println("");
                        } else {
                            out.println(sDessert + "      $" + dessertPrice);
                        }
                    }
                }
                
                double totalPrice;
                DecimalFormat df = new DecimalFormat("#.##");
                
                
                meatPrice = (Double) pMeat;
                pastaPrice = (Double) pPasta;
                drinkPrice = (Double) pDrink;
                dessertPrice = (Double) pDessert;
                
                totalPrice = (meatPrice + pastaPrice + drinkPrice + dessertPrice);
                
                out.println("</br></br></br></br>Total Bill: $" + (df.format(totalPrice)));
                
                double wiTax;
                double wiTaxrate = .051;
                
                wiTax = (totalPrice * wiTaxrate);
                
                out.println("</br>Tax: $" + (df.format(wiTax)));
                
                
                double tipSuggestion;
                double tipRate = .15;
                
                tipSuggestion = (totalPrice * tipRate);
                
                out.println("</br>Suggested Tip at 15%: $" + (df.format(tipSuggestion)));
                
                
                double completePrice;
                
                completePrice = (totalPrice + wiTax + tipSuggestion);
                out.println("</br></br>----------------------------------------");
                out.println("</br>Final Total: $" + (df.format(completePrice)));
                out.println("</br>----------------------------------------");



            %>
        </p>
        <p><a href="select.html">Back
    </body>
</html>

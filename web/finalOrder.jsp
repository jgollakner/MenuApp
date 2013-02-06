<%-- 
    Document   : finalOrder
    Created on : Feb 4, 2013, 6:47:53 AM
    Author     : JoeGollakner
--%>

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
                String sMeat = "";
                if (oMeat == null) {
                    //sMeat = (String)oMeat;
                    out.println("");
                } else {
                    sMeat = (String) oMeat;
                    out.println(sMeat);
                }
                Object oPasta = request.getAttribute("FinalOrder2");
                String sPasta = "";
                if (oPasta == null) {
                    //sMeat = (String)oMeat;
                    out.println("");
                } else {
                    sPasta = (String) oPasta;
                    out.println(sPasta);
                }
                Object oDrink = request.getAttribute("FinalOrder3");
                String sDrink = "";
                if (oDrink == null) {
                    //sMeat = (String)oMeat;
                    out.println("");
                } else {
                    sDrink = (String) oDrink;
                    out.println(sDrink);
                }
                Object oDessert = request.getAttribute("FinalOrder4");
                String sDessert = "";
                if (oDessert == null) {
                    //sMeat = (String)oMeat;
                    out.println("");
                } else {
                    sDessert = (String) oDessert;
                    out.println(sDessert);
                }



            %>
        </p>
        <p><a href="select.html">Back
    </body>
</html>

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
                Object oMeat = request.getAttribute("FinalOrder".toString());
                out.println(oMeat);
                
                Object oPasta = request.getAttribute("FinalOrder2".toString());
                out.println(oPasta);
                
                Object oAlcohol = request.getAttribute("FinalOrder3".toString());
                out.println(oAlcohol);
                
                Object oDessert = request.getAttribute("FinalOrder4".toString());
                out.println(oDessert);
            %>
        </p>
        <p><a href="select.html">Back
    </body>
</html>

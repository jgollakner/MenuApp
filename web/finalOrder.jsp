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
                List recs = (List) request.getAttribute("FinalOrder");
                Iterator it = recs.iterator();
                while (it.hasNext()) {
                    out.print(it.next());
                }
            %>
        </p>
        <p><a href="select.html">Back
    </body>
</html>

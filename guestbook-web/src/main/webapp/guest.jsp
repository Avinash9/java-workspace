<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,guest.Guest"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>

    <body>
        <form method="POST" action="Test1">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>

        <hr><ol> <%
            @SuppressWarnings("unchecked")
            List<Guest> guests = (List<Guest>)request.getAttribute("guests");
            for (Guest guest : guests) { %>
                <li> <%= guest %> </li> <%
            } %>
        </ol><hr>

        
     </body>
 </html>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="java.util.*,login.User"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    
    <script src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
    <script language="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.js" />">
    </script>
    <script language="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />">
    </script>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css" />
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"  type="text/css" />
       <title>Login page</title>
    </head>
    

    <body>
  <div class="container">
    <div class="row">
    <div class="col-md-offset-2 col-md-2 ">
    <div class="form-login">
    <h4>Sign up</h4>
    <form method="POST" action="login">
            <input type="text" class="form-control input-sm chat-input"  placeholder="username" name="name" />
            </br>
             <input type="text" class="form-control input-sm chat-input"  placeholder="surname" name="surname" />
             </br>
            <input type="password" class="form-control input-sm chat-input"  placeholder="password"  name="password" />
            </br>
             <input type="text" class="form-control input-sm chat-input"  placeholder="age" name="age" />
             </br>
             
             <div class="wrapper">
            <span class="group-btn">     
                <a href="#" class="btn btn-primary btn-md">Sign Up <i class="fa fa-sign-in"></i></a>
            </span>
            <input type="submit" value="Sign Up" />
            </div>
            
        </form>
        </div>
      </div>
    </div>
    
    
    
    <div class="row log-in">
        <div class="col-md-offset-2 col-md-2">
            <div class="form-login">
            <h4>Log In</h4>
            <input type="text" id="userName" class="form-control input-sm chat-input" placeholder="username" />
            </br>
            <input type="text" id="userPassword" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            <div class="wrapper">
            <span class="group-btn">     
                <a href="#" class="btn btn-primary btn-md">login <i class="fa fa-sign-in"></i></a>
            </span>
            </div>
            </div>
        
        </div>
    </div>
</div>
        
     </body>
 </html>
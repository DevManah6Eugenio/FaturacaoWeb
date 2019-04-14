<%-- 
    Document   : teste
    Created on : 11/04/2019, 21:28:45
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="scripts/materialize/css/materialize.css">

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type = "text/javascript" src = "jquery/jquery-3.3.0.min.js"></script>           
        <script src="scripts/materialize/js/materialize.js"></script>
          <meta name = "viewport" content = "width = device-width, initial-scale = 1">      
      <link rel = "stylesheet"
         href = "https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>

    
    
    
     <body class = "container"> 
      <h3>Drop Down Demo</h3>
      <ul id = "dropdown" class = "dropdown-content">
         <li><a href = "#">Inbox<span class = "badge">12</span></a></li>
         <li><a href = "#!">Unread<span class = "new badge">4</span></a></li>
         <li><a href = "#">Sent</a></li>
         <li class = "divider"></li>
         <li><a href = "#">Outbox<span class = "badge">14</span></a></li>
      </ul>
      
      <a class = "btn dropdown-button" href = "#" data-activates = "dropdown">Mail Box
         <i class = "mdi-navigation-arrow-drop-down right"></i></a>	 
   </body>
</html>

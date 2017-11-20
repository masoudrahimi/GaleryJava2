<%@ page import="galery.model.Picture" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="galery.data.PictureDAO" %>
<%@ page import="galery.model.Counter" %>
<%@ page import="galery.Listeners.MySessionListener" %>
<%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show galary</title>
    <link href="/css/style2.css" rel="stylesheet" />
</head>
<body>
<%

    Counter.counter++;
%>
<center>
    <h1>show galary</h1>
</center>
<!-- MAIN (Center website) -->
<div class="main">

    <h1 style="color: #ffffff">Gallery</h1>
    <label><h2 style="color: #ffffff">visitor statistics:<%=Counter.counter%></h2></label>
    <label><h2 style="color: #ffffff">visitor online statistics:<%=MySessionListener.counter_s%></h2></label>
    <!-- Portfolio Gallery Grid -->
    <div class="row">
            <%
            if(request.getSession().getAttribute("user")== null){
            response.sendRedirect("../index.jsp");
            }
            ArrayList<Picture> pList =PictureDAO.getObjectPicture();
            for(Picture picture:pList)
            {
                if(picture.getId()!= Integer.parseInt(request.getParameter("id"))){
                    continue;
                }
        %>
        <div class="column spring">
            <div class="content">
                <a href="sublist.jsp?id=<%=picture.getId()%>">
                    <img src="../upload/<%=picture.getAddressPicture()%>"   alt="<%=picture.getId()%>" style="width:100%">
                    <h4><%=picture.getId()%></h4>
                </a>

            </div>
        </div>
            <%

            }
        %>

</body>

</html>

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
</head>
<body>
<center>
    <h1>show galary</h1>
</center>
<form  method="post">
    <table border="5" bordercolor="red" align="center">

        <tr>

            <td>  <a href="item.jsp">

                <img src="/images/Autumn/Autumn13.jpg" height=200 width=400></a></th>
            <td>
                <a href="item.jsp">
                <img id="myImg" src="/images/Autumn/Autumn25.jpg" alt="" height=200 width=400>

                </a>
            </th>

            <!-- considering it is on the same folder that .html file -->
            <td><a href="item.jsp">
                <img src="/images/Autumn/Autumn24.jpg" alt="" border=3 height=200 width=400></img>
            </a>
            </th>
        </tr>
        <tr>
            <td><a href="item.jsp">
                <img src="/images/Autumn/Autumn30.jpg" height=200 width=400>
            </a></th>
            <td> <a href="item.jsp"><img src="/images/Autumn/Autumn31.jpg" height=200 width=400>
            </a>
            </th>
            <td ><a href="item.jsp">
                <img src="/images/Autumn/Autumn55.jpg" height=200 width=400>
            </a>
            </th>
        </tr>


    </table>

</form>
</body>
</html>

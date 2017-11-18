<%@ page import="javax.swing.text.html.parser.DTD" %><%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forgetpassword</title>
    <link href="../css/style.css" rel="stylesheet" />
    <%--<style>--%>
        <%--body {--%>
            <%--background-image: url("../images/Autumn.jpg");--%>
           <%----%>
        <%--}--%>
    <%--</style>--%>

</head>
<body >

    <div class="d">
<form   method="post" >

    <label for="username">User Name</label>
   <input type="text" name="username"placeholder="Your  username..">

</br>
    <label for="questions">questions</label>

    <select name="questions">
        <option value="question1">question1</option>
        <option value="question2">question2</option>
        <option value="question3">question3</option>

    </select>
    <br><br>
    <label for="answer">Answer</label>
    <input type="text" name="answer"placeholder="Your  answer..">
    <label for="password"> New password</label>
     <input type="password" name="npass"placeholder="Your  new password..">
    <label for="conform password"> conform password</label>
    <input type="text" name="conformpass" placeholder="Your  conform..">
    <input type="button" value="reset pass">
</form>

</div>


</body>
</html>

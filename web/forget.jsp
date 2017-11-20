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
    <title>Forget Password</title>
    <link href="../css/style.css" rel="stylesheet" />
    <script type="text/javascript"src="/js/main.js"></script>
</head>
<body >

    <div class="d">
        <%
            String str;
            try {
                str= request.getAttribute("alertMsg").toString();
            }
            catch (Exception e)
            {
                str="";
            }
        %>
        <center> <h1><label style="color:red"><%=str%></label></h1></center>

<form action="servletForget.do"   method="post" >

    <label for="uname">User Name</label>
   <input type="text" name="username" id="uname" placeholder="Your  username..">

</br>
    <label for="questions1">questions</label>
    <select name="questions1" id="questions1">
        <option value="1">What is your father's name?</option>
        <option value="2">What is your high school name?</option>
        <option value="3">What is the name of the university?</option>
        <option value="4">What is your city name?</option>
    </select>
    <br><br>

    <label for="ans1">Answer</label>
    <input type="text" name="answer1" id="ans1" placeholder="Your  answer..">

    <label for="questions2">questions2</label>
    <select name="questions2" id="questions2">
        <option value="1">What is your father's name?</option>
        <option value="2">What is your high school name?</option>
        <option value="3">What is the name of the university?</option>
        <option value="4">What is your city name?</option>
    </select>

    <label for="ans2">Answer2</label>
    <input type="text" name="answer2" id="ans2" placeholder="Your  answer..">

    <label for="pass"> New password</label>
     <input type="password" name="npassword" id="pass" placeholder="Your  new password..">

    <label for="cpass"> conform password</label>
    <input type="password" name="conformpassword" id="cpass" placeholder="Your  conform..">

    <input type="submit" onclick= "return confirmForget(event)" value="Reset Password">
</form>

</div>


</body>
</html>

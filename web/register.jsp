<%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registry</title>
    <link href="../css/style.css" rel="stylesheet" />
    <script type="text/javascript"src="/js/main.js"></script>

</head>
<body>
<div class="header">
    <a href="index.jsp">
        <img src="/images/home.png">
    </a>
</div>
<div class="r">
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
    <div class="row">

    <form action="servletRegister.do"  method="post" >
        <div class="column">
        <label for="name">First Name</label>
        <input type="text" name="name" id ="name" placeholder="Your  first name..">
        <label for="lname">Last Name</label>
        <input type="text" name="lastname" id="lname" placeholder="Your  last name..">
        <label for="uname">User Name</label>
        <input type="text" name="username" id="uname" placeholder="Your  username..">
        <label for="pass"> password</label>
        <input type="password" name="pass" id="pass" placeholder="Your  new password..">
        <label for="cpass">conform password</label>
        <input type="password" name="conformpass" id="cpass" placeholder="Your  conform..">
       </div>
        <div class="column">
            <label for="state">state</label>
            <select name="state" id="state">
                <option value="1">admin</option>
                <option value="2">user</option>
            </select>
            <label for="q1">question1</label>
        <select name="questions1" id="q1">
            <option value="1">What is your father's name?</option>
            <option value="2">What is your high school name?</option>
            <option value="3">What is the name of the university?</option>
            <option value="4">What is your city name?</option>
        </select>
        <label for="ans1">Answer1</label>
        <input type="text" name="answer1" id="ans1" placeholder="Your  answer..">

        <label for="q2">questions2</label>
        <select name="questions2" id="q2">
            <option value="1">What is your father's name?</option>
            <option value="2">What is your high school name?</option>
            <option value="3">What is the name of the university?</option>
            <option value="4">What is your city name?</option>
        </select>
        <label for="ans2">Answer2</label>
        <input type="text" name="answer2" id="ans2" placeholder="Your  answer..">
        </div>
        <input type="submit"  onclick="confirmRegister(event)" id="reg" value="register"/>
    </form>


    </div>
</div>

</body>
</html>

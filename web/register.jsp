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
    <div class="row">
        <div class="column">
    <form   method="post" >
        <label for="FirstName">First Name</label>
        <input type="text" name="name" id =name placeholder="Your  first name..">
        <label for="LastName">Last Name</label>
        <input type="text" name="Lastname" id=lname placeholder="Your  last name..">
        <label for="username">User Name</label>
        <input type="text" name="username" id="uname" placeholder="Your  username..">
        <label for="password"> password</label>
        <input type="password" name="pass" id=pass placeholder="Your  new password..">
        <label for="conform password">conform password</label>
        <input type="password" name="conformpass" id="cpass" placeholder="Your  conform..">
       </div>
        <div class="column">
            <label for="state">state</label>
            <select name="state" id="sat">
                <option value="user">user</option>
                <option value="adim">admin</option>
            </select>
            <label for="questions1">question1</label>
        <select name="questions1"id="q1">
            <option value="question1">question1</option>
            <option value="question2">question2</option>
        </select>
        <label for="answer">Answer1</label>
        <input type="text" name="answer1" id=ans1 placeholder="Your  answer..">
        <label for="questions2">questions2</label>

        <select name="questions2" id="q2">
            <option value="question1">question1</option>
            <option value="question2">question2</option>
        </select>
        <label for="answer2">Answer2</label>
        <input type="text" name="answer2" id="ans2" placeholder="Your  answer..">
        </div>

        <input type="button"  onclick="Myclick()" value="register">


    </form>


    </div>
</div>

</body>
</html>

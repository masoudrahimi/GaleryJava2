<%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link href="../css/style.css" rel="stylesheet" />

  </head>
  <body>
  <ul class="bxslider">
    <li><img src="../images/Spring(35).jpg" /></li>
    <li><img src="../images/Sport(36).jpg" /></li>
    <li><img src="../images/sport(10).jpg" /></li>
    <li><img src="../images/Spring(37).jpg" /></li>
    <li><img src="../images/pic1.jpg" /></li>
  </ul>



  <div class="dd">
    <form method="post">
      <label for="userName">User Name</label>
      <input type="text" id="usn" name="username" placeholder="Your  username..">

      <label for="password">password</label>
      <br/>
      <input type="password" id="pass" name="password" placeholder="Your password..">

      <input type="button" value="login">
    </form>
//link forget&register
    <p><b><a href="forget.jsp" target="_blank">forget pasword</a></b></p>
    <p><b><a href="register.jsp" target="_blank">Register</a></b></p>



  </div>

  </body>
  <script src="../js/jquery-3.1.1.min.js"></script>
  <!-- bxSlider Javascript file-->
  <script src="../js/jquery.bxslider.min.js"></script>
  <script>
      $(document).ready(function(){
          $('.bxslider').bxSlider({
              mode: 'horizontal',
              moveSlides: 1,
              slideMargin: 0,
              infiniteLoop: true,
              slideWidth: 700,
              minSlides: 1,
              maxSlides: 1,
              speed: 800,
          });
      });
  </script>
</html>

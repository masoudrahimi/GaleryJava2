<%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show picture</title>

    <link href="../css/style.css" rel="stylesheet" />
    <link href="../css/style4.css" rel="stylesheet" />



    <link href="http://www.cssscript.com/wp-includes/css/sticky.css" rel="stylesheet" type="text/css">

</head>
<body>

<center>
    <h1>show galary</h1>
</center>

<form>
    <table border="5" bordercolor="red" align="center">
        <tr>

            <td>  <a href="item.jsp">

                <img src="/images/Autumn/Autumn13.jpg" height=400 width=800></a></th>


        </tr>
        <tr>
            <td >
                <%--<div class="css-script-clear"></div>--%>
                </div>
                </div>
                <div class="cont">
                    <div class="stars">
                        <form action="">
                            <input class="star star-5" id="star-5-2" type="radio" name="star"/>
                            <label class="star star-5" for="star-5-2"></label>
                            <input class="star star-4" id="star-4-2" type="radio" name="star"/>
                            <label class="star star-4" for="star-4-2"></label>
                            <input class="star star-3" id="star-3-2" type="radio" name="star"/>
                            <label class="star star-3" for="star-3-2"></label>
                            <input class="star star-2" id="star-2-2" type="radio" name="star"/>
                            <label class="star star-2" for="star-2-2"></label>
                            <input class="star star-1" id="star-1-2" type="radio" name="star"/>
                            <label class="star star-1" for="star-1-2"></label>
                        </form>
                    </div>
                </div>


        </tr>
        <tr>
            <td border=3 height=200 width=400>
                <label name=" show Command" > show user Command</label>

            </th>

        </tr>
        <tr>
            <td border=3 height=200 width=400>
                <label name="Command"> Command</label>
                <input type="text" name="yourcommand" placeholder="Your  Command..">
                <label name="send">send</label>
                <input type="submit" name="sendcommand" value="send">

            </th>

        </tr>



    </table>
</form>
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-46156385-1', 'cssscript.com');
    ga('send', 'pageview');

</script


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: masaoud
  Date: 17/11/2017
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registery</title>
    <link href="/css/style2.css" rel="stylesheet" />
    <script type="text/javascript"src="/js/main.js"></script>


</head>

<body>
<%--<div class="header">--%>
<%--<a href="index.jsp">--%>
<%--<img src="/images/exit.png">--%>
<%--</a>--%>
</div>

<div class="tab">
    <button class="tablinks" onclick="openreg(event, 'insert category')" id="defaultOpen">insert category</button>
    <button class="tablinks" onclick="openreg(event, 'add Image')">add Image</button>
    <button class="tablinks" onclick="openreg(event, 'Delete Image')">Delete Image</button>
</div>

<div id="insert category" class="tabcontent">
    <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
    <h3>categoty</h3>
    <label for="nameCategory"> Name Category</label>
    <input type="text" name="name"placeholder="Your  categoryname..">
    <br><br/>
    <br/>
    <br/>
    <input type="file" id="myFile">
    <br/>
    <br/>
    <br/>
    <button >save category</button>


</div>

<div id="add Image" class="tabcontent">
    <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
    <h4>Add image</h4>
    <label for="choose categoty">choose categoty</label>

    <select name="add image">
        <option value="autumn">autumn</option>
        <option value="sport">sport</option>
        <option value="spring">string</option>

    </select>
    <br/>
    <br/>
    <br/>
    <input type="file" id="myFile">
    <br/>
    <br/>
    <br/>
    <button >add picture</button>


</div>

<div id="Delete Image" class="tabcontent">
    <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
    <h3>delete Image</h3>

    <form>
        <table>
            <tr>
                <th>Delete</th>
                <th>nameCategory</th>
                <th>namepicture</th>
            </tr>

            <tr>
                <td> <span class="topright">x</span></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td> <span class="topright">x</span></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td> <span class="topright">x</span></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>    <span class="topright">x</span></td>
                <td></td>
                <td></td>
            </tr>

        </table>
    </form>


</div>
<%--<div class="footer">--%>
<%--masudRahimi ,hosein..,zahrafirouzi--%>
<%--</div>--%>
</body>
</html>

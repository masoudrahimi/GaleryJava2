<%@ page import="galery.data.CategoryDAO" %>
<%@ page import="galery.data.PictureDAO" %>
<%@ page import="galery.data.Uploader" %>
<%@ page import="galery.model.Picture" %>
<%@ page import="java.util.ArrayList" %>
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
    <link href="/css/style2.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/main.js"></script>
    <script>
        function load() {
            <%
            request.setAttribute("file","file2");
            Uploader u = new Uploader();
            u.doPost(request,response);
            %>
        }
    </script>
</head>

<body>
<%--<div class="header">--%>
<%--<a href="index.jsp">--%>
<%--<img src="/images/exit.png">--%>
<%--</a>--%>
<%
    if(request.getSession().getAttribute("user")== null){
        response.sendRedirect("../index.jsp");
    }
%>
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
    <input type="text" name="name" placeholder="Your  categoryname..">
    <br><br/>
    <br/>
    <br/>
    <input type="file" id="file">
    <br/>
    <br/>
    <br/>
    <input type="submit" value="AddCat">


</div>

<div id="add Image" class="tabcontent">
    <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
    <h4>Add image</h4>
    <form action="regimage.jsp" onsubmit="load()" method="post" enctype="multipart/form-data">
        <label for="choose categoty">choose categoty</label>

        <select name="addimage">
            <%
                ArrayList<String> categories = CategoryDAO.getCategories();
                for (int i = 0; i <categories.size() ; i++) {
                    out.print("<option value=\"" + (i+1) +"\">" + categories.get(i) + "</option>");

                }
            %>
            <%--<option value="1">Spring</option>--%>
            <%--<option value="2">Summer</option>--%>
            <%--<option value="3">Autumn</option>--%>
            <%--<option value="4">Winter</option>--%>

        </select>
        <br/>
        <br/>
        <br/>
        <input type="file" name="file2"/>
        <br/>
        <br/>
        <br/>
        <input type="submit" value="AddPic">
    </form>


</div>

<div id="Delete Image" class="tabcontent">
    <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
    <h3>delete Image</h3>
    <%
        ArrayList<Picture> pList = PictureDAO.getObjectPicture();
        for(Picture picture:pList) {
    %>
    <div class="column spring">
        <div class="content">
            <a href="servletDelete.do?id=<%=picture.getId()%>">
                <img src="../upload/<%=picture.getAddressPicture()%>"   alt="<%=picture.getId()%>" style="width:100%">
                <h4><%=picture.getId()%></h4>
            </a>

        </div>
    </div>
    <%
        }
    %>
</div>
<%--<div class="footer">--%>
<%--masudRahimi ,hosein..,zahrafirouzi--%>
<%--</div>--%>
</body>
</html>

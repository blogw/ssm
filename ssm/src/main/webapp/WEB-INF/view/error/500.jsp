<%--
  Created by IntelliJ IDEA.
  User: blogw
  Date: 2017/04/13
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.StringWriter" %>
<html>
<head>
    <title>Title</title>
    <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: black;
        }

        .center {
            margin: 0 auto;
            width: 1100px;
            color: #0F0;
            line-height: 16px;
            background: black;
            border: none;
        }

        .ascii {
            margin: 0 auto;
            width: 290px;
            height: 200px;
            font-size: 15px;
            color: #F00;
            background: black;
            border: none;
        }

        #detail{
            display: block;
        }
    </style>
    <script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    exception.printStackTrace(pw);
%>
<pre class="ascii">

  oooooooo   .oooo.     .oooo.
 dP"""""""  d8P'`Y8b   d8P'`Y8b
d88888b.   888    888 888    888
    `Y88b  888    888 888    888
      ]88  888    888 888    888
o.   .88P  `88b  d88' `88b  d88'
`8bd88P'    `Y8bd8P'   `Y8bd8P'
</pre>
<pre class="center">
<button type="button" class="btn btn-danger btn-xs">Class</button>
<%=exception.getClass()%>

<button type="button" class="btn btn-danger btn-xs">Message</button>
<%=exception.getMessage()%>

<button id="stack" type="button" class="btn btn-danger btn-xs">StackTrace</button>
<span id="detail"><%=sw.toString()%></span>
</pre>
</div>
</body>
</html>
<script>
    $("#stack").click(function () {
        $("#detail").toggle();
    });
</script>
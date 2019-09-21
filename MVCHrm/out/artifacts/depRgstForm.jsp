<%--
  Created by IntelliJ IDEA.
  User: hesam
  Date: 9/19/2019
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department registeration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="panel-group">
        <div class="panel panel-default">
            <div class="panel-heading">Panel with panel-default class</div>
            <div class="panel-body">
                <form action="/department/create.do">
                    <div class="form-group">
                        <label for="department-name">Department name:</label>
                        <input type="text" name="name" class="form-control" id="department-name">
                    </div>
                    <button type="submit" class="btn btn-default" >Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
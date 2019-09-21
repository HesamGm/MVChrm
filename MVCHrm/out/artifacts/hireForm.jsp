<%--
  Created by IntelliJ IDEA.
  User: hesam
  Date: 9/17/2019
  Time: 1:15 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registeration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">

    <div class="panel-group">
        <div class="panel panel-default">
            <div class="panel-heading">Panel with panel-default class</div>
            <div class="panel-body">
                <form action="/employee/hire.do">
                    <div class="form-group">
                        <label for="user-name-label">name:</label>
                        <input type="text" name="firstName" class="form-control" id="user-name-label">
                    </div>
                    <div class="form-group">
                        <label for="Last-name">Family:</label>
                        <input type="text" name="lastName" class="form-control" id="Last-name">
                    </div>
                    <%--<div class="form-group">--%>
                        <%--<label for="job">job:</label>--%>
                        <%--<input type="text" name="job" class="form-control" id="job">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="age">Age:</label>--%>
                        <%--<input type="number" name="age" class="form-control" id="age">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="EmploymentType">EmploymentType:</label>--%>
                        <%--<input type="text" name="employmentType" class="form-control" id="EmploymentType">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="PhoneNumber">Phone number:</label>--%>
                        <%--<input type="tel" name="phoneNumber" class="form-control" id="PhoneNumber">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label for="salary">Salary:</label>--%>
                        <%--<input type="number" name="salary" class="form-control" id="salary">--%>
                    <%--</div>--%>
                    <div class="form-group">
                        <label for="department">Department list link to check:<br>
                            http://localhost:8080/department/select.do
                           <%--<%request.getRequestDispatcher("/department/select.do");%>--%>
                            <%--How to dispatch department select in jstl?--%>
                            <%--<ul>--%>
                                <%--<c:forEach items= "${sessionScope.list}" var="department">--%>
                                <%--<li><c:out value="${department.id}-${department.name}"/></li>--%>
                                <%--</c:forEach>--%>
                            <%--</ul>--%>
                        </label>
                        <input type="number" name="departmentId" class="form-control" id="department">
                    </div>

                    <button type="submit" class="btn btn-default" >Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>

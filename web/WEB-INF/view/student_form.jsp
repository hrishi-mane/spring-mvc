<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
<%--    calling setters using path attribute for that--%>
    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>
<%----------------------    ------------------------%>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>
    Languages:
    Java <form:radiobutton path="language" value="Java"/>
    Python <form:radiobutton path="language" value="Python"/>
    Ruby <form:radiobutton path="language" value="Ruby"/>
    C# <form:radiobutton path="language" value="C#"/>

    <br><br>

    <input type="submit" value="Submit">
</form:form>
</body>
</html>

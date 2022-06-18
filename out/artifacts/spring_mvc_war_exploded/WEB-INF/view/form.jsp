<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>SAMPLE FORM</h1 >
<form action="${pageContext.request.contextPath}/app/processFormTwo" method="get">
    <label>
        <input type="text" name="studentName" placeholder="Enter your name">
    </label>
    <input type="submit">
</form>
</body>
</html>

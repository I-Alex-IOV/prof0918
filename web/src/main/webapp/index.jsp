<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <TITLE>Vertex authentication page</TITLE>
</head>
<body BGCOLOR="FFFFFF">

<H1>This is Vertex!</H1>

<img src="https://i.ytimg.com/vi/-ZLF6fGBOn0/maxresdefault.jpg" , width="300">

<form:form method="POST" action="security_check" modelAttribute="user">
    <form:label path="name">Username:</form:label> <form:input type="text" path="name"/> <form:errors path="name"
                                                                                                      cssClass="color:red"/><br>
    <form:label path="name">Password:</form:label> <form:input type="password" path="password"/> <form:errors
        path="password" cssClass="color:red"/><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
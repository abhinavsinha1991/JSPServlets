<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<H1>Welcome ${name}</H2>

<div>
Your Todos are:
<c:forEach items="${todos}" var="todo">
   <li>${todo.name}</li>
</c:forEach>

</div>

</body>
</html>
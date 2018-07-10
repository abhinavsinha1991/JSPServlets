<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

Your todo-list is:

<c:forEach items="${todos}" var="todo">
   <li>${todo.name}</li>
</c:forEach>

</body>
</html>
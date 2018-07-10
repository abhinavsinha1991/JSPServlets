<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<title>Yahoo!!</title>

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}
</style>

</head>

<body>
<nav role="navigation" class="navbar navbar-default">

		<div class="">
			<a href="/" class="navbar-brand">Abhinav</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/todo.do">Todos</a></li>
				<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/logout.do">Logout</a></li>
			</ul>
		</div>

	</nav>

    <div class="container">
        <H1>Welcome ${name}</H2>

        Your Todos are:
        <ol>
            <c:forEach items="${todos}" var="todo">
                <li>${todo.name} <a href="/deletetodo.do?todo=${todo.name}">Delete</a></li>
            </c:forEach>
        </o1>

        <p>
        	<font color="red">${errorMessage}</font>
        </p>

        <form method="POST" action="/todo.do">
            Add New Todo <input name="todo" type="text"/> <input name="add" type="submit"/>
        </form>

</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
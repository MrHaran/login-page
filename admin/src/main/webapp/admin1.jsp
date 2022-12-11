<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
h3{
font-family: cursive;

}
button{
border:none;
background-color: blue;
color: white;
}
input{
border:none;
background-color: blue;
color: white;
}

</style>
</head>
<body>
<center>
<h3>student data view</h3>
<form action="admin1" method="get">

<input type="submit" value="view" placeholder="view">

</form>
</center>
<center>
<h3>Insert a new student data </h3>


<a href="insert.jsp"><button>insert</button></a>


</center>
<center>
<h3>Update student data </h3>


<a href="update.jsp"><button>update</button></a>


</center>
<center>
<h3>Delete student data </h3>


<a href="delete.jsp"><button>delete</button></a>


</center>
</body>
</html>
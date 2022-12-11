<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
h2{
text-transform: capitalize;
}

</style>
</head>
<body>
<center>
<h2>insert the new student detail</h2>
<form action="insert" method="get">
   <table>
    <tr><td><input type="text" name="regno" placeholder="Reg No"></td></tr>
    <tr><td><input type="text" name="name" placeholder="Name"></td></tr>
    <tr><td><input type="text" name="tamil" placeholder="Tamil"></td></tr>
    <tr><td><input type="text" name="english" placeholder="English"></td></tr>
    <tr><td><input type="text" name="maths" placeholder="Maths"></td></tr>
    <tr><td><input type="text" name="science" placeholder="Science"></td></tr>
    <tr><td><input type="text" name="social" placeholder="Social"></td></tr>
     <tr><td><input type="submit"  ></td></tr>
     </table>


</form>

</center>
</body>
</html>
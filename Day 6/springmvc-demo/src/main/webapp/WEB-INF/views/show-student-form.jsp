<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Student</h1>

<div align="centre">
<!--  when submit will be clicked the addstudent key has studentformdto object  -->

 <form:form  action="save-student" modelAttribute="addstudent" method = "post">
    <label> id: </label>
    <form:input path="id"/>
    <br/>
      <label> name: </label>
    <form:input path="name"/>
    <br/>
 <label> mobile: </label>
    <form:input path="mobile"/>
    <br/>
    <label> country: </label>
    <form:input path="country"/>
    
    <input type="submit" value="submit"/>
 </form:form>

</div>
</body>
</html>
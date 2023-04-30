<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <h1>Student Details - ${student}</h1>  -->
	<div align="centre">
	
	  <table border="2" color="blue">
	     <thead>
	        <tr> 
	        
	        <td> Student ID </td>
	        <td> Student Name </td>
	        <td> Student Mobile </td>
	        <td> Student Country </td>
	       </tr>
	     </thead>
         
          <tbody>
          <c:forEach var="s" items="${student}">
             <tr>
                 <td> ${s.id} </td>
                 <td> ${s.name} </td>
                 <td> ${s.mobile} </td>
                 <td> ${s.country} </td>
             </tr>
          </c:forEach>
          </tbody>


	  </table>
	
	</div>
	
</body>
</html>
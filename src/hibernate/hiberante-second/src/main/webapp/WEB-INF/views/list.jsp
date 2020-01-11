<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="pe.codechord.springhbnt.model.Event" %>

<html>
<head>
	<title>List</title>
</head>
<body>
<h1>
	List Page!  
</h1>

<div>
  <table border="1">
  <c:forEach var="elem" items="${list }">
    <tr>
      <td>${elem.id }</td>
      <td>${elem.title }</td>
      <td>${elem.date }</td>
    </tr>
  </c:forEach>
  </table>
</div>
  
  
</body>
</html>

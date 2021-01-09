<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert here</title>
</head>
<body bgcolor="lightblue">
      <div class="container">
  <h2>Article List</h2>
  <table border = "1" cellpadding = "10" cellspacing = "10"  width="100%">
   <thead>
   <tr bgcolor="red">
    <th>Name</th>
    <th>Age</th>
    <th>DOB</th>
    <th>Blood_Group</th>
    <th>Address</th>
    <th>Mobile_Number</th>
    <th>Email</th>
    <th>Date_of_appointment</th>
    <th >Update</th>
   
    </tr>
   </thead>
   <tbody >
    
   
       <c:forEach items="${patientList }" var="patient" >
     <tr style="text-align: center;">
    
      <td>${patient.name }</td>
      <td>${patient.age}</td>
      <td>${patient.dob}</td>
      <td>${patient.blood-group}</td>
      <td>${patient.address}</td>
      <td>${patient.mobile_number}</td>
      <td>${patient.email}</td>
      <td>${patient.date_of_appointment}</td>
      
      <td style="text-align: center;">
       <spring:url value="/patient/updatePatient/${patient.name }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" ><mark>Update</mark></a>
      </td>
      
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/patient/addPatient/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New patient</a>
 </div>
</body>
</html>
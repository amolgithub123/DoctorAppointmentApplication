<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Patient Form</title>
 
</head>
<body>
 <div >
  <spring:url value="/patient/savePatient" var="saveURL" />
  <h2>Article</h2>
  <form:form modelAttribute="articleForm" method="post" action="${saveURL }" cssClass="form" >
      
      <div class="form-group">
    <label>Name</label>
    <form:input path="name" cssClass="form-control"  />
   </div>
    <div class="form-group">
    <label>Age</label>
    <form:input path="age" cssClass="form-control"  />
   </div>
   <div class="form-group">
    <label>DOB</label>
    <form:input path="dob" cssClass="form-control"  />
   </div>
   <div class="form-group">
    <label>Blood_Group</label>
    <form:input path="blood_group" cssClass="form-control"  />
   </div>
  
  <div class="form-group">
    <label>Address</label>
    <form:input path="address" cssClass="form-control"  />
   </div>
  
  <div class="form-group">
    <label>Mobile_Number</label>
    <form:input path="mobile_number" cssClass="form-control"  />
   </div>
  
  <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control"  />
   </div>
  
  <div class="form-group">
    <label>Date_of_appointment</label>
    <form:input path="date_of_appointment" cssClass="form-control"  />
   </div>
  
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>
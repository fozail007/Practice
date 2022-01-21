<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1><b>View Customer</b></h1>
<table border="2" width="90%" cellpadding="4">
    <tr>
        <th>Id</th>
        <th>Customer Name</th>
        <th>Customer Mobile No</th>
        <th>Customer Email Id</th>
        <th>Customer Address</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.mobileNo}</td>
            <td>${customer.emailId}</td>
            <td>${customer.customerAddress}</td>
            <td><a href="/update-customer/${customer.id}">Update</a></td>
            <td><a href="/delete-customer/${customer.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/create-customer">Create Customer</a>

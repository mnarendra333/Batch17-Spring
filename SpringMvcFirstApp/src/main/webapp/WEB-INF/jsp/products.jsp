<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>




<c:if test="${not empty prolist}">

		<table border="2px solid black">
			<c:forEach var="product" items="${prolist}">
				<tr>
				<td>${product.proId}</td>
				<td>${product.proName}</td>
				<td>${product.price}</td>
				<td>${product.qty}</td>
				<td>${product.category}</td>
				<td><a href="editproduct?id=${product.proId}">edit</a></td>
				<td><a href="deleteproduct?id=${product.proId}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<a href="getAddForm">AddProduct</a>

	</c:if>
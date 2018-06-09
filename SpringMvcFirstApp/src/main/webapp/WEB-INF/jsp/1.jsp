<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
1.jsp
MyMessage is : ${key}




<c:if test="${not empty colors}">

		<ul>
			<c:forEach var="listValue" items="${colors}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
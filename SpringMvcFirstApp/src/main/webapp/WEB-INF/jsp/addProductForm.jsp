
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        <form:form action="saveProduct" method="post" modelAttribute="product">
        <table>
           <%--  <form:hidden path="pro"/> --%>
            <tr>
                <td>ProName</td>
                <td><form:input path="proName" /></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><form:input path="price" /></td>
            </tr>
            <tr>
                <td>Qty:</td>
                <td><form:input path="qty" /></td>
            </tr>
            <tr>
                <td>Category:</td>
                <td><form:input path="category" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<c:url value="${PageContext}/UpdateProduct"/>" method="post">
<table align="center">
	<tr bgcolor="pink">
		<td align="center" colspan="2"><h3>Product Detail</h3></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Id</td>
		<td><input type="text" name="productId" value="${product.productId}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Name</td>
		<td><input type="text" name="productName" value="${product.productName}"/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Product Desc</td>
		<td><textarea rows="5" cols="30" name="productDesc">${product.productDesc}</textarea></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Stock</td>
		<td><input type="text" name="stock" value="${product.stock}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>Price</td>
		<td><input type="text" name="price" value="${product.price}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>CategoryId</td>
		<td><input type="text" name="categoryId" value="${product.categoryId}" readonly/></td>
	</tr>
	<tr bgcolor="cyan">
		<td>SupplierId</td>
		<td><input type="text" name="supplierId" value="${product.supplierId}" readonly/></td>
	</tr>
	<tr bgcolor="pink">
		<td colspan="2" align="center">
			<input type="submit" value="Update Product"/>
		</td>
	</tr>
</table>
</form>
</body>
</html>

<%@include file="CommonHeader.jsp" %>

</br></br></br></br></br>

<form action="InsertProduct" method="post">
<div class="table-responsive">
<table style="width:50%;" align ="center" class="table table-bordered table condensed"> 
	<tr bgcolor="DarkGrey">
		<td align="center" colspan="2"><h4>Product Detail</h4></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>Product Name</td>
		<td><input type="text" name="productName"/></td>
	</tr>
	<tr bgcolor="LightGrey">
		<td>Product Desc</td>
		<td><textarea rows="5" cols="30" name="productDesc"></textarea></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>Stock</td>
		<td><input type="text" name="stock"/></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>Price</td>
		<td><input type="text" name="price"/></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>CategoryId</td>
		<td><input type="text" name="categoryId"/></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>SupplierId</td>
		<td><input type="text" name="supplierId"/></td>
	</tr>
	<tr bgcolor="DarkGrey">
		<td colspan="2" align="center">
			<input type="submit" class="btn btn-success" value="Insert Product"/>
		</td>
	</tr>
</table>
</div>
</form>

<table align="center" class="table table-bordered">
	<tr bgcolor="coral">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Desc</td>
		<td> Stock</td>
		<td> Price</td>
		<td> SupplierId</td>
		<td> SupplierId</td>
	</tr>
	<c:forEach items="${productList}" var="product">
	<tr bgcolor="cyan">
		<td>${product.productId}</td>
		<td>${product.productName}</td>
		<td>${product.productDesc}</td>
		<td>${product.stock}</td>
		<td>${product.price}</td>
		<td>${product.categoryId}</td>
		<td>${product.supplierId}</td>
		<td>
			<a href="deleteProduct/${product.productId}" class="btn btn-danger">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editProduct/${product.productId}" class="btn btn-success">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>

<%@include file="CommonHeader.jsp" %>

</br></br></br></br></br>

<form action="InsertSupplier" method="post">
<div class="table-responsive">
<table style="width:50%;" align ="center" class="table table-bordered table condensed"> 
	<tr bgcolor="DarkGrey">
		<td align="center" colspan="2"><h4>Supplier Detail</h4></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>Supplier Name</td>
		<td><input type="text" name="supplierName"/></td>
	</tr>
	<tr bgcolor="LightCyan">
		<td>Supplier Desc</td>
		<td><textarea rows="5" cols="30" name="supplierDesc"></textarea></td>
	</tr>
	<tr bgcolor="DarkGrey">
		<td colspan="2" align="center">
			<input type="submit" class="btn btn-success" value="Insert Supplier"/>
		</td>
	</tr>
</table>
</div>
</form>

<table align="center" class="table table-bordered">
	<tr bgcolor="coral">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Desc</td>
		
	</tr>
	<c:forEach items="${supplierList}" var="supplier">
	<tr bgcolor="cyan">
		<td>${supplier.supplierId}</td>
		<td>${supplier.supplierName}</td>
		<td>${supplier.supplierDesc}</td>
		<td>
			<a href="deleteSupplier/${supplier.supplierId}" class="btn btn-danger">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editSupplier/${supplier.supplierId}" class="btn btn-success">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>


</body>
</html>
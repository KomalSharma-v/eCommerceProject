
<%@include file="CommonHeader.jsp" %>

</br></br></br></br></br>

<form action="InsertCategory" method="post">
<div class="table-responsive">
<table style="width:50%;" align ="center" class="table table-bordered table condensed"> 
	<tr bgcolor="DarkGrey">
		<td align="center" colspan="2"><h4>Category Detail</h4></td>
	</tr>
	<tr bgcolor="AliceBlue">
		<td>Category Name</td>
		<td><input type="text" name="catName"/></td>
	</tr>
	<tr bgcolor="LightCyan">
		<td>Category Desc</td>
		<td><textarea rows="5" cols="30" name="catDesc"></textarea></td>
	</tr>
	<tr bgcolor="DarkGrey">
		<td colspan="2" align="center">
			<input type="submit" class="btn btn-success" value="Insert Category"/>
		</td>
	</tr>
</table>
</div>
</form>

<table align="center" class="table table-bordered">
	<tr bgcolor="Coral">
		<td>Category ID</td>
		<td>Category Name</td>
		<td>Category Desc</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${categoryList}" var="category">
	<tr bgcolor="cyan">
		<td>${category.categoryId}</td>
		<td>${category.categoryName}</td>
		<td>${category.categoryDesc}</td>
		<td>
			<a href="deleteCategory/${category.categoryId}" class="btn btn-danger">Delete</a>&nbsp;&nbsp;/&nbsp;&nbsp;
			<a href="editCategory/${category.categoryId}" class="btn btn-success">Edit</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>
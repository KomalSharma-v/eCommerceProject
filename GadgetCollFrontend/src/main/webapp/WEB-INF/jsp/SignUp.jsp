<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="CommonHeader.jsp" %>

<br/></br><br/></br><br/>

<div class="container">

<div class="row" style="margin-top:20px">
    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form">
			<fieldset>
				<h2>Please Sign Up</h2>
				<hr class="colorgraph">
				<div class="form-group">
                    <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address">
				</div>
				<div class="form-group">
                    <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password">
				</div>
				<div class="form-group">
                    <input type="text" name="userName" id="userName" class="form-control input-lg" placeholder="Enter User Name">
				</div>
				<div class="form-group">
                    <input type="text" name="customerName" id="customerName" class="form-control input-lg" placeholder="Enter Customer Name">
				</div>
				<hr class="colorgraph">
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6">
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Sign Up">
					</div>
					<div class="col-xs-6 col-sm-6 col-md-6">
						<a href="signIn" class="btn btn-lg btn-primary btn-block">Sign In</a>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</div>

</div>

</body>
</html>
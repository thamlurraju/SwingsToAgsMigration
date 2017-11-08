<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>AngularJS</title>
<meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
     <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
.username.ng-valid {
	background-color: lightgreen;
}

.username.ng-dirty.ng-invalid-required {
	background-color: red;
}

.username.ng-dirty.ng-invalid-minlength {
	background-color: yellow;
}

.password.ng-valid {
	background-color: lightgreen;
}

.password.ng-dirty.ng-invalid-required {
	background-color: red;
}

.password.ng-dirty.ng-invalid-minlength {
	background-color: yellow;
}

.email.ng-valid {
	background-color: lightgreen;
}

.email.ng-dirty.ng-invalid-required {
	background-color: red;
}

.email.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.date.ng-valid {
	background-color: lightgreen;
}

.datedate.ng-dirty.ng-invalid-required {
	background-color: red;
}

.date.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.gender.ng-valid {
	background-color: lightgreen;
}

.gender.ng-dirty.ng-invalid-required {
	background-color: red;
}

.gender.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.state.ng-valid {
	background-color: lightgreen;
}

.state.ng-dirty.ng-invalid-required {
	background-color: red;
}

.state.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.country.ng-valid {
	background-color: lightgreen;
}

.country.ng-dirty.ng-invalid-required {
	background-color: red;
}

.country.ng-dirty.ng-invalid-email {
	background-color: yellow;
}

.mobile.ng-valid {
	background-color: lightgreen;
}

.mobile.ng-dirty.ng-invalid-required {
	background-color: red;
}

.mobile.ng-dirty.ng-invalid-email {
	background-color: yellow;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
	<div class="generic-container" ng-controller="UserController as ctrl">
		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">User Registration Form </span>
			</div>
			<div class="formcontainer">
				<form ng-submit="ctrl.submit()" name="myForm"
					class="form-horizontal">
					<input type="hidden" ng-model="ctrl.user.id" />
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="file">Name</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.username" name="uname"
									class="username form-control input-sm"
									placeholder="Enter your name" required ng-minlength="3" />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.uname.$error.required">This is a
										required field</span> <span ng-show="myForm.uname.$error.minlength">Minimum
										length required is 3</span> <span ng-show="myForm.uname.$invalid">This
										field is invalid </span>
								</div>
							</div>
						</div>
					</div>


					<!-- <div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="gender">Gender</label>
							<div class="col-md-7">
								Male <input type="radio" name="gender" ng-model="color1" value="male" ng-required="!color1"/ />									 
								Female <input type="radio" name="gender" ng-model="color1" value="female" ng-required="!color1" /> <br/>
								<span style="color:red" ng-show="myForm.gender.$error.require == true">Select Gender</span>
								<span style="color:red" class="error" ng-if="myForm.$submitted && myForm.gender.$error.required">Please fill field above<br></span><br/>
								</div>
					   </div>
					</div> -->
							
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="upass">Password</label>
							<div class="col-md-7">
								<input type="Password" ng-model="ctrl.user.password" id="upass"
									class="Password form-control input-sm"
									placeholder="Enter your Password" required ng-minlength="8" />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.upass.$error.required">This is a
										required field</span> <span ng-show="myForm.upass.$error.minlength">Minimum
										length required is 8</span> <span ng-show="myForm.upass.$invalid">This
										field is invalid </span> <br />
									<br />
									<br>
								</div>
							</div>
						</div>
					</div>

					<!-- <div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="date">Date Of
								Birth</label>
							<div class="col-md-7">
								<input type="date" ng-model="ctrl.user.date" id="date"
									name="date" required />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.date.$error.required">This is a
										required field</span> <span ng-show="myForm.date.$invalid">This
										field is invalid </span> <br />
								</div>
								<br/>
								<br/>
							</div>
						</div>
					</div> -->

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="mobile">Mobile
								Number</label>
							<div class="col-md-7">
								<input type="number" ng-model="ctrl.user.mobile" id="mobile"
									ng-pattern="/^[7-9][0-9]{9,9}$/"
									class="mobile form-control input-sm"
									placeholder="Enter your Mobile Number" required />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.mobile.$error.pattern">Please
										enter a valid mobile number</span> <span
										ng-if="myForm.$submitted && myForm.mobile.$error.required">Please
										fill field above</span> <br />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="email">Email</label>
							<div class="col-md-7">
								<input type="email" ng-model="ctrl.user.email" id="email"
									class="email form-control input-sm"
									placeholder="Enter your Email" required />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.email.$error.required">This is a
										required field</span> <span ng-show="myForm.email.$invalid">This
										field is invalid </span> <br />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="area">Area</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.area" id="area"
									class="form-control input-sm"
									placeholder="Enter your Address. [This field is validation free]" />

							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="state">State</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.state" id="state"
									class="state form-control input-sm"
									placeholder="Enter your State Name" required ng-minlength="2" />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.state.$error.required">This is a
										required field</span> <span ng-show="myForm.state.$error.minlength">Minimum
										length required is 2</span> <span ng-show="myForm.state.$invalid">This
										field is invalid </span> <br />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="country">Nationality</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.user.country" id="country"
									class="country form-control input-sm"
									placeholder="Enter your Country Name" required ng-minlength="2" />
								<div class="has-error" ng-show="myForm.$dirty">
									<span ng-show="myForm.country.$error.required">This is a required field</span> <span ng-show="myForm.country.$error.minlength">Minimum length required is 2</span>
									<span ng-show="myForm.country.$invalid">This
										field is invalid </span> <br />
									<br />
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-actions floatRight">
							<input type="submit"
								value="{{!ctrl.user.id ? 'Registration' : 'Update'}}"
								class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
							<button type="button" ng-click="ctrl.reset()"
								class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset
								Form</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">
				<span class="lead">List of Users </span>
			</div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID.</th>
							<th>Name</th>
							<!-- <th>Gender</th> -->
							<th>Password</th>
							<!-- <th>DOB</th> -->
							<th>Mobile</th>
							<th>Email</th>
							<th>Area</th>
							<th>State</th>
							<th>Nationality</th>
							<th width="100"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="u in ctrl.users">
							<td><span ng-bind="u.id"></span></td>
							<td><span ng-bind="u.username"></span></td>
							<!-- <td><span ng-bind="u.gender"></span></td> -->
							<td><span ng-bind="u.password"></span></td>
							<!-- <td><span ng-bind="u.date"></span></td> -->
							<td><span ng-bind="u.mobile"></span></td>
							<td><span ng-bind="u.email"></span></td>
							<td><span ng-bind="u.area"></span></td>
							<td><span ng-bind="u.state"></span></td>
							<td><span ng-bind="u.country"></span></td>
							<td>
								<button type="button" ng-click="ctrl.edit(u.id)"
									class="btn btn-success custom-width">Edit</button>
								<button type="button" ng-click="ctrl.remove(u.id)"
									class="btn btn-danger custom-width">Remove</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<script src="<c:url value='/static/js/service/user_service.js' />"></script>
	<script	src="<c:url value='/static/js/controller/user_controller.js' />"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account Page</title>
<script src="resources/javascript/main.js"></script>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<p>
	Hello, ${currentEm.getFname()}! <br>
	Remaining Reimbursement Funds: ${currentEm.getFunds()}
	
	
</p>
<hr>
<button name="goTo" value="true" onclick="showForm()">Create New Form</button>
<button name="view" value="true" onclick="viewAll()">View All Forms</button>

<div id="formView" display="none">
	<!-- <a href="form.jsp"><button name="toForm" value="Go" onClick=transfer.forward(request,response);>Go To Form</button></a> -->
	
	<form id="formBody" action="SubmitForm" method="POST">
			<table>
				<tr>
					<td>Type:</td>
					<td><select id="eventType" name="type" required>
							<option value="certification">certification</option>
							<option value="certification prep">certification prep class</option>
							<option value="seminar">seminar</option>
							<option value="technical training">technical training</option>
							<option value="university course">university course</option>
							<option value="other">other</option>
					</select></td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><input type="text" name="location" required></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><input type="text" name="description" required></td>
				</tr>
				<tr>
					<td>Cost:</td>
					<td><input type="text" name="cost" placeholder="$" required></td>
				</tr>
				<tr>
					<td>Start Date:</td>
					<td><input type="text" name="startDate" placeholder="MM/DD/YY" required></td>
				</tr>
				<tr>
					<td>Start Time:</td>
					<td><input type="text" name="startTime" placeholder="HH:MM am/pm" required></td>
				</tr>
				<tr>
					<td>Justification:</td>
					<td><select name="justification" required>
							<option value="career advancement">career advancement</option>
							<option value="continuing education">continuing education</option>
							<option value="project pre-requisite">project pre-requisite</option>
							<option value="personal interest">personal interest</option>
							<option value="other">other</option>
					</select></td>
				</tr>
				<tr>
					<td>Grade Format:</td>
					<td><select name="gradeFormat" required>
							<option value="percentage">percentage</option>
							<option value="passfail">pass/fail</option>
							<option value="presentation">presentation</option>
							<option value="other">other</option>
					</select></td>
				</tr>
				<tr>
					<td>Grade Cutoff:</td>
					<td><input type="text" name="gradeCutOff" placeholder="minimum passing" required></td>
				</tr>
			</table>
			<input type="submit" value="SUBMIT" onclick()="submitForm">
		</form>
</div>
</body>
</html>
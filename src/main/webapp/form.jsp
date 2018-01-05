<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reimbursement Form</title>
</head>
<body>
	<p>
		Hello, ${currentEm.getFname()}! <br> forward of forward works
	</p>
	<div>
		<form action="SumbitForm">
			<table>
				<tr>
					<td>Type:</td>
					<td><select name="type" required>
							<option>certification</option>
							<option>certification prep class</option>
							<option>seminar</option>
							<option>technical training</option>
							<option>university course</option>
							<option>other</option>
					</select></td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><input type="text" name="location" placeholder="location"
						required></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><input type="text" name="description" placeholder="description"
						required></td>
				</tr>
				<tr>
					<td>Cost:</td>
					<td><input type="text" name="cost" placeholder="cost"
						required></td>
				</tr>
				<tr>
					<td>Start Date:</td>
					<td><input type="text" name="startDate" placeholder="MM/DD/YY"
						required></td>
				</tr>
				<tr>
					<td>Start Time:</td>
					<td><input type="text" name="startTime" placeholder="HH:MM"
						required></td>
				</tr>
				<tr>
					<td>End Time:</td>
					<td><input type="text" name="endTime" placeholder="HH:MM" required>
					</td>
				</tr>
				<tr>
					<td>Justification:</td>
					<td><select name="justification" required>
							<option value="career advancement">career advancement</option>
							<option>continuing education</option>
							<option>project pre-requisite</option>
							<option>personal interest</option>
							<option>other</option>
					</select></td>
				</tr>
				<tr>
					<td>Grade Format:</td>
					<td><select name="justification" required>
							<option>percentage</option>
							<option>pass/fail</option>
							<option>presentation</option>
							<option>other</option>
					</select></td>
				</tr>
				<tr>
					<td>Grade Cutoff:</td>
					<td><input type="text" name="cutoff" placeholder="minimum passing"
						required></td>
				</tr>
			</table>
			<input type="submit" value="SUBMIT">
		</form>
	</div>
	<hr>
	<a href='account.jsp'>BACK</a>
</body>
</html>
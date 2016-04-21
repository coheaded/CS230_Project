<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search For Schools</title>
</head>
<body>
<h2>Enter all desired search criteria</h2><br>(yes, i know what you're thinking, there 
is an overwhelming number of options)
<form method="post" action ="Search_Action.jsp" name = "Search">
	<table style="text-align: left; width: 400px;"
			border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td></td>
			<td>Desired Value</td>
			<td></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">School</td>
			<td><input name = "name" ></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">State</td>
			<td><input name = "state" ></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Location</td>
			<td><input name = "location" ></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Control</td>
			<td><input name = "control" ></td>
		</tr>
		<tr>
			<td></td>
			<td style="vertical-align: top;" >Lower Search Bound</td>
			<td style="vertical-align: top;" >Upper Search Bound</td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Population</td>
			<td><input name = "popL" value = "0"></td>
			<td><input name = "popH" value = "100000"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Percent Female</td>
			<td><input name = "femL" value = "0"></td>
			<td><input name = "femH" value = "100"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">SAT Verbal</td>
			<td><input name = "vsatL" value = "0"></td>
			<td><input name = "vsatH" value = "800"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">SAT Math</td>
			<td><input name = "msatL" value = "0"></td>
			<td><input name = "msatH" value = "800"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Expenses</td>
			<td><input name = "expL" value = "0"></td>
			<td><input name = "expH" value = "100000"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Financial Aid</td>
			<td><input name = "finL" value = "0"></td>
			<td><input name = "finH" value = "100000"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Number of Applications</td>
			<td><input name = "appL" value = "0"></td>
			<td><input name = "appH" value = "100000"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Percent Admitted</td>
			<td><input name = "admL" value = "0"></td>
			<td><input name = "admH" value = "100"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Percent Enrolled</td>
			<td><input name = "enrL" value = "0"></td>
			<td><input name = "enrH" value = "100"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Academics (1-5)</td>
			<td><input name = "acdL" value = "1"></td>
			<td><input name = "acdH" value = "5"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Social Life (1-5)</td>
			<td><input name = "socL" value = "1"></td>
			<td><input name = "socH" value = "5"></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">Quality of Life (1-5)</td>
			<td><input name = "quaL" value = "1"></td>
			<td><input name = "quaH" value = "5"></td>
		</tr>
		<tr>
			<td></td>
			<td style="vertical-align: top;"><input value="Reset"
		name="Reset" type="reset"></td>
			<td style="vertical-align: top;"><input value="Search"
		name="Search" type="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>
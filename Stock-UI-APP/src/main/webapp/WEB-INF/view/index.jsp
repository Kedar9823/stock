<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stock Search</title>
</head>
<body>
	<h3>Get Stock Price</h3>
	
	${msg } 
	
	<form method="get" action="getTotalCost">
		<table>
			<tr>
				<td>Company Name</td>
				<td>
					<input type='text' name='companyName'>
				</td>
			</tr>
			<tr>
				<td>Stock Quantity</td>
				<td>
					<input type='text' name='quantity'>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type='submit' name='Get cost'>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
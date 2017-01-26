<%@page import="com.edu.displaytag.data.UserData"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!-- display tag library -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Tag Simple Example</title>
</head>
<body>
	<h2>User Data</h2>
	<%
		request.setAttribute("userdata", UserData.getUserList());
	%>
	<display:table id="data" name="userdata"
		decorator="com.edu.displaytag.decorator.UserDecorator" pagesize="10">
		<display:column property="userId" title="ID" sortable="true" />
		<display:column property="userName" title="Username" sortable="true" />
		<display:column property="firstName" title="Company" sortable="true" />
		<display:column property="lastName" title="Company" sortable="true" />
		<display:column property="email" title="Email" sortable="true" />
	</display:table>
</body>
</html>

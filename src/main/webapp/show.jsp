<%@page import="java.sql.*" %>
<%@page import="java.sql.Connection" %>
<%
String username=request.getParameter("username");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/db","root","root");
Statement st=con.createStatement();
String query="select * from info order by username";
ResultSet rs=st.executeQuery(query);
%>
<table border="2" bordercolor="#2494b7">
<tr>
<th>UserName</th>
<th>Password</th>
<th>First Name</th>
<th>Last Name</th>
<th>Address</th>
<th>Pin code</th>
<th>Mobile Phone</th>
</tr>
<tr>
<% while(rs.next()){ %>
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
</tr>
<% } %>
</table>
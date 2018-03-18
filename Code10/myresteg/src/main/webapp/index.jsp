<html>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
    <form action="http://localhost:8080/myresteg/webapi/myresource/query" method="get">
    <!-- <form action="http://localhost:8080/myresteg/webapi/myresource/formparamsws" method="post"> -->
<table>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" placeholder="Type Name Here" /></td>
</tr>
<tr>
<td><label>Age</label></td>
<td><input type="text" name="age" /></td>
</tr>
<tr>
<td><label>Address</label></td>
<td><textarea rows="6" cols="10" name="address"></textarea></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</form>
    
</body>
</html>

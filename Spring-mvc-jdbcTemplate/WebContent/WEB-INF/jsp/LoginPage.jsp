<html>
 <p> ${message} </p><br>
<p >please enter your credentials</p>
<style>
body {
	background-color: DarkSeaGreen;
}
</style>

<form action="loginController" method="post">
UserName :
<br>
<input type="text" name="userName" />
<br> Password :
<br>
<input type="password" name="password" />
<br>
<P style="color: green;">please enter submit button</p><br>
<input type="submit"  value="submit" style="width: 180px; height: 25px; "/>
</form>
</html>
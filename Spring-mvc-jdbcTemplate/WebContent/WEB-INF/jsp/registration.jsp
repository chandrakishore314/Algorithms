<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>
<style>
body {
	background-color: Lavender;
}
</style>
<form action="registrationDAO" >
	<h4>please enter details to register</h4>
	UserName : <input type="text" name="userName" /><br> PassWord : <input
		type="text" name="password" pattern=".{6,}"
		title="Six or more characters" /><br> Age:<input type="text"
		name="Age" pattern="[0-9]{1,}" style="width: 40px; height: 26px;"
		title="only numbers 0-9" /><br> Gender: <input type="radio"
		name="gender" value="male"> Male <input type="radio"
		name="gender" value="female"> Female<br> email :<input
		type="email" name="email" style="width: 150px; height: 25px;" /> <br>
	ph number:<input type="text" name="phnum" pattern="[0-9]{10}"
		style="width: 150px; height: 25px;" title="only 10 digit phone number" />
	<br> <input type="submit" value="submit"
		style="width: 130px; height: 30px;" /><br>
</form>
</html>
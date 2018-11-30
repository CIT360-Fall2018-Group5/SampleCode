<?php
	if(isset($_GET['username'])){
		
		$username = $_GET['username'];
		$password = $_GET['password'];
		echo "Your username is $username and your password is $password";
	}
?>
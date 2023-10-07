<?php

ini_set('display_errors', '1');
ini_set('display_startup_errors', '1');
error_reporting(E_ALL);

$Password = $_POST["Password"];
$Email = $_POST["Email"];

$host ="localhost";
$dbname = "register";
$username = "root";
$password = "";


$conn = new mysqli($host,$username,$password,$dbname);
if (mysqli_connect_errno()){
    die("Connection Failed : ". mysqli_connect_errno());
}

$sql = "UPDATE $dbname set Password = ? WHERE Email = ? ";

$stmt = mysqli_stmt_init($conn);
if(!mysqli_stmt_prepare($stmt, $sql)){
    die(mysqli_error($conn));
}

mysqli_stmt_bind_param($stmt, "ss" ,$Password, $Email);

mysqli_stmt_execute($stmt);

if( $Email = '?'){
  echo "Wrong Email Try Again!!!"; 
}
else{
    echo "Password Changed Successfully...";
}

?>

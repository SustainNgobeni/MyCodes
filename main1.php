<?php

ini_set('display_errors', '1');
ini_set('display_startup_errors', '1');
error_reporting(E_ALL);

$Name = $_POST["Name"];
$Surname = $_POST["Surname"];
$Email = $_POST["Email"];
$Student_Number = $_POST["Student_Number"];
$Contact = $_POST["Contact"];
$Module_Code = $_POST["Module_Code"];
$Password = $_POST["Password"];

$host ="localhost";
$dbname = "register";
$username = "root";
$password = "";


$conn = new mysqli($host,$username,$password,$dbname);
if (mysqli_connect_errno()){
    die("Connection Failed : ". mysqli_connect_errno());
}

$sql = "INSERT INTO $dbname(Name, Surname, Email, Student_Number, Contact, Module_Code, Password)
    VALUES (?, ?, ?, ?, ?, ?, ?)";

$stmt = mysqli_stmt_init($conn);
if(!mysqli_stmt_prepare($stmt, $sql)){
    die(mysqli_error($conn));
}

mysqli_stmt_bind_param($stmt, "sssiiss", $Name, $Surname, $Email, $Student_Number, $Contact, $Module_Code, $Password);

mysqli_stmt_execute($stmt);
echo "Registration successfully...";

?>
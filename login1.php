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

$sql = "SELECT * FROM $dbname WHERE Password = ? AND Email = ? ";

$stmt = mysqli_stmt_init($conn);
if(!mysqli_stmt_prepare($stmt, $sql)){
    die(mysqli_error($conn));
}

mysqli_stmt_bind_param($stmt, "ss" ,$Password, $Email);

mysqli_stmt_execute($stmt);
$result = $stmt->get_result();

if($result->num_rows > 0){
   $user = $result->fetch_assoc();
   $Student_Number = $user['Student_Number'];
   $_SESSION['Student_Number'] = $Student_Number;
   header("location:profile.php");
}
else{
    echo "<div>Invalid Email or Password<br>Doesn't have Acoount!!!";
    echo "<a href= 'main.php'>Register</a></div>";
}

$stmt->close();

?>

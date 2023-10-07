<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" />
    <title>Reset Password</title>
</head>
<body>
    <form action="chan_pass1.php" method="post" >

        <h1>Reset Password</h1>

        <label for="email" >Email:</label><br>
        <input class="X"type="email" id="email" name="Email" size="50" placeholder="Name@gmail.com" autofocus required><br>

        <label for="Password">New Password:</label><br>
        <input class="X" type="password" id="Password" name="Password" value="" size="50" placeholder="Enter New Password" placeholder="Enter Password"required><br>
        
        <p><a href="login.php">Return to login</a></p>

        <button class="button" type="submit">Reset password</button>
 
      </form>
</body>
</html>
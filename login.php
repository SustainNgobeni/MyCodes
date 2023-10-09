<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" />
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<div class = "container">
    <form action="login1.php" method="post" >
        
        <label for="email" >Email:</label><br>
        <input type="email" id="Email" name="Email" size="50" placeholder="Name@gmail.com" autofocus required><br>
      
        <label for="Password" >Password:</label><br>
        <input type="password" id="Password" name="Password" value="" size="50" placeholder="Enter Password" required><br>
        
        <br><button class="button" type="submit">Login</button>
        
      </form> 
      <p>Need to register?<a href="main.php">Sign up</a></p>

    </div>
</body>
</html>

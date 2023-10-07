<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" />
    <title>Registration Form</title>
</head>
<body>
    <h1>Registration Form</h1>

    <form action="main1.php" method="post" >
        <label for="Name" >Name: </label><br>
        <input type="text" id="Name" name="Name" value="" size="50" placeholder="Enter Name" autofocus required ><br>
      
        <label for="Surname" >Surname:</label><br>
        <input type="text" id="Surname" name="Surname" value="" size="50" placeholder="Enter Surname" required><br>
      
        <label for="Student_Number" >Student Number:</label><br>
        <input type="text" id="Student_Number" name="Student_Number" value="" size="50"  placeholder="Enter Student Number" maxlength="9" required><br>
      
        <label for="Module_Code" >Module Code:</label><br>
        <input type="text" id="Module_Code" name="Module_Code" value="" size="50" placeholder="Enter Module Code" maxlength="7" required><br>
         
        <label for="email" >Email:</label><br>
        <input type="email" id="email" name="Email" size="50" placeholder="Name@gmail.com" required><br>
      
        <label for="Contact" >Contact Number:</label><br>
        <input type="tel" id="Contact" name="Contact" size="50" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" placeholder="Enter Contact Number" maxlength="10" required><br>
      
        <label for="Password" >Password:</label><br>
        <input type="password" id="Password" name="Password" value="" size="50" placeholder="Enter Password" required><br>
      
        <label for="Confirm Password" >Confirm Password:</label><br>
        <input type="password" id="Confirm Password" name="Confirm Password" value="" size="50" placeholder="Confirm Password" required><br><br>
      
        <button class="button" type="submit">Sign Up</button>

      </form> 

      <p>Already signed up? <a href="login.php">Login Here</p>
      
</body>
</html>

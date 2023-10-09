<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" />

    <title>Profile</title>
</head>

<body>
    <div class="main">
        <div class="sidebar">
            <div class="image">
                <img id="img" src="/xampp_sql/assets/default.png"
                    alt="student image">
            </div>
            <div class="upload">


                <input type="file" id="upload" accept="image/*" hidden />
                <label for="upload">Choose image</label>


            </div>
            <div class="logout">
                <a href="/xampp_sql/index.html"></a>
            </div>
        </div>
        <div class="profile">
            <div class="heading">
                <p>Profile information</p>
            </div>
            <div class="form">
                <?php
    
                if(isset($SESSION['Email'])) {
                    $Email = $SESSION['Email'];
                    
                    // Open a database connection
                    $conn = OpenConnection();
                    
                    // Check if the connection has been established
                    if($conn) {
                        $sql = "SELECT * FROM student WHERE Email = ?";
                        $stmt = $conn->prepare($sql);
                        $stmt->bind_param("s", $Email);
                        $stmt->execute();
                        $result = $stmt->get_result();
                        
                        if($result->num_rows > 0) {

                            $row = $result->fetch_assoc();
                            $Student_Number = $row['Student_Number'];
                            $Name = $row['Name'];
                            $Surname = $row['Surname'];
                            $phone = $row['Contact'];
                            $module = $row['Module_Code'];
                            $Password = $row['Password'];
                            $Email = $row['Email'];
                    
              
                            echo'
                            <div class="form">
                                <section class="container">
                                    <form action="/xampp_sql/server/update.php" method="POST" class="form">
                                        
                                            <input type="text" placeholder="Student Number" name="Student" value="' . htmlspecialchars($Student_Number) . '" required />
                                        
                                            <input type="text" placeholder="First name" name="name" value="' . htmlspecialchars($Name) . '" required />
                                       
                                            <input type="text" placeholder="Surname" name="surname" value="' . htmlspecialchars($Surname) . '" required />
                                        
                                            <input type="text" placeholder="Email address" name="email" value="' . htmlspecialchars($Email) . '" required readonly />
                                        
                                            <input type="number" placeholder="Phone number" name="phone" value="' . htmlspecialchars($phone) . '" required />
                                     
                                          
                                                <select name="module">
                                                    <option hidden>Module code</option>
                                                    <option value="SCSC012" ' . ($module == "SCSCO12" ? 'selected' : '') . '>SCSCO12</option>
                                                    <option value="SMTH012" ' . ($module == "SMTH012" ? 'selected' : '') . '>SMTH012</option>
                                                    <option value="SSTS012" ' . ($module == "SSTS012" ? 'selected' : '') . '>SSTS012</option>
                                                    <option value="SAPA012" ' . ($module == "SAPA012" ? 'selected' : '') . '>SAPA012</option>
                                                    <option value="SHEL012" ' . ($module == "SHEL012" ? 'selected' : '') . '>SHEL012</option>
                                                </select>
                                           
                                           
                                                <input type="password" placeholder="Password" name="password" value="' . htmlspecialchars($password) . '" required />
                                         
                                        <button>Update</button>
                                    </form>
                                </section>
                            </div>
                            '; 
                        }
                        
                        // Close the database connection
                        CloseConnection($conn);
                    }
                }
                ?>
            </div>
        </div>
        
    </div>
</body>

</html>

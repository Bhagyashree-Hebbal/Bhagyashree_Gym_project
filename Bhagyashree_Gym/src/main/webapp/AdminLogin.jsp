<%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon" href="data:image/jpeg;base64,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">


    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        /* Layout to ensure footer is always at the bottom */
        body {
            background-image: url(https://cmsgaraga.garaga.com/Drupal/Blog/3%20Reasons%20Why%20All-Glass%20Full-View%20Garage%20Doors%20Are%20Perfect%20for%20Commercial%20Gyms/GarageDoorG-4400_12x10_AnodizedFrame.jpg);
            background-size: cover;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            color: #333;
            font-family: 'Arial', sans-serif;
        }

        /* Main content should grow as needed */
        .content {
            flex: 1;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        /* Container styling for alignment */
        .login-container {
            background: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        /* Input fields with icons */
        .form-control {
            padding-left: 40px;
        }

        .form-control.icon-field {
            position: relative;
        }

        .form-control.icon-field i {
            position: absolute;
            left: 10px;
            top: 50%;
            transform: translateY(-50%);
            color: #555;
        }

        /* Button styling for appearance */
        .btn-success {
            padding: 10px 15px;
            white-space: nowrap;
            font-size: 0.9rem;
            border-radius: 5px;
            width: 100%;
            transition: background-color 0.3s ease-in-out;
        }

        .btn-success:hover {
            background-color: #2ecc71;
        }

        /* Footer section styling */
        .footer {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 20px 0;
            text-align: center;
            color: white;
        }

        .footer a {
            color: #ecf0f1;
            text-decoration: none;
            margin: 0 15px;
            font-size: 1rem;
            transition: color 0.3s ease-in-out;
        }

        .footer a:hover {
            color: #f39c12;
        }
    </style>
</head>

<body>
    <div class="content">
        <div class="login-container">
            <h2 class="text-center mb-4">Admin Login</h2>
            <form action="admin" method="get">
                <div class="mb-3 form-group icon-field">
                    <label for="email" class="form-label"><i class="fas fa-envelope"></i> Email</label>
                    <input type="email" id="email" name="email" class="form-control" onChange="onAdminEmailChange()" placeholder="Enter your Email" required>
                    <span id="adminEmail" style="color: red;"></span>
                </div>


                <div class="mb-3 form-group icon-field">
                    <label for="password" class="form-label"><i class="fas fa-lock"></i> Password</label>
                    <input type="password" id="password" name="password" class="form-control" onChange="onAdminPasswordChange()" placeholder="Enter your Password" required >
                     <span id="adminPassword" style="color:red;"></span>
                </div>

                <button type="submit" class="btn btn-success">Login</button>
            </form>
        </div>
    </div>

    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy <i class="fas fa-shield-alt"></i></a>
        <a href="#">Terms & Conditions <i class="fas fa-file-alt"></i></a>
    </div>

    <script>
                function onAdminEmailChange() {
                       console.log('this is on place RegiEmailChange');
                       var email = document.getElementById('email');
                       var regiEmailValue = email.value;

                       if (!regiEmailValue.includes('@gmail.com') && !regiEmailValue.includes('@yahoo.com') && !regiEmailValue.includes('@outlook.com') && !regiEmailValue.includes('@hotmail.com') &&
                       !regiEmailValue.includes('.edu') && !regiEmailValue.includes('.org') && !regiEmailValue.includes('.info') && !regiEmailValue.includes('.net'))
                             {
                           document.getElementById("adminEmail").innerHTML = "Enter a valid email address.";
                           return;
                       }else {
                           document.getElementById("adminEmail").innerHTML = "";
                       }

                       var xhttp = new XMLHttpRequest();
                       xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/admin/email/" + regiEmailValue);
                       xhttp.send();

                       xhttp.onload = function(){
                       document.getElementById("adminEmail").innerHTML = this.responseText;
                       }
                }

                function onAdminPasswordChange() {
                    console.log('this is on place password');
                    var password = document.getElementById('password');
                    var passwordValue = password.value;

                    if (passwordValue.length < 8 || passwordValue == null || !passwordValue.match(/[A-Z]/) || !passwordValue.match(/[a-z]/) || !passwordValue.match(/[@$!%*?&]/)) {
                        document.getElementById("adminPassword").innerHTML = "";
                    } else {
                        document.getElementById("adminPassword").innerHTML = "";
                    }

                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/admin/password/" + passwordValue);
                    xhttp.send();

                    xhttp.onload = function () {
                        document.getElementById("adminPassword").innerHTML = this.responseText;
                    }
                }

            </script>

    <!-- Bootstrap JS & Dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enquiry Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        /* General Body Styling */
        body {
            font-family: 'Arial', sans-serif;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            background: linear-gradient(to right, #f8f9fa, #eef2f3);
        }

        /* Navbar Styling */
        .navbar {
            background: linear-gradient(120deg, #007bff, #0056b3);
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
        }

        .navbar-nav .nav-item .nav-link {
            font-size: 1rem;
            font-weight: 500;
            padding: 10px 15px;
            color: white;
            transition: color 0.3s, background 0.3s;
        }

        .navbar-nav .nav-item .nav-link:hover,
        .navbar-nav .nav-item .nav-link.active {
            background-color: #0056b3;
            border-radius: 5px;
        }

        /* Enquiry Form Styling */
        .enquiry-form-container {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
            margin: 100px auto 20px;
        }

        .enquiry-form-container h2 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 20px;
        }

        .form-label {
            font-weight: bold;
            margin-top: 10px;
            color: #2c3e50;
        }

        .form-control {
            border: 1px solid #ced4da;
            border-radius: 5px;
            transition: all 0.3s ease-in-out;
        }

        .form-control:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        .form-group i {
            margin-right: 10px;
            color: #007bff;
        }

        .btn-submit {
            background-color: #007bff;
            color: white;
            font-size: 1rem;
            font-weight: bold;
            text-transform: uppercase;
            border: none;
            padding: 10px;
            border-radius: 5px;
            width: 100%;
            margin-top: 10px;
            transition: background 0.3s;
        }

        .btn-submit:hover {
            background-color: #0056b3;
        }

        /* Footer Styling */
        .footer {
            background-color: #4f8fc0;
            color: white;
            text-align: center;
            padding: 15px 0;
            margin-top: auto;
        }

        .footer a {
            color: #f8f9fa;
            text-decoration: none;
            margin: 0 10px;
            font-size: 1rem;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" href="Enquiry.jsp"><i class="fas fa-search"></i> Enquiry</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="search"><i class="fas fa-users"></i> FollowUp</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Registration.jsp"><i class="fas fa-user-plus"></i> Registration</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Update.jsp"><i class="fas fa-edit"></i> Update</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Enquiry Form -->
    <div class="enquiry-form-container">
        <h2><i class="fas fa-envelope-open-text"></i> Enquiry Form</h2>
        <form action="enquiry" method="post">
            <div class="mb-3 form-group">
                <label for="name" class="form-label"><i class="fas fa-user"></i> Name</label>
                <input type="text" id="name" name="name" class="form-control" onChange="onNameChange()" placeholder="Enter your name" required>
                <span id="userName" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="area" class="form-label"><i class="fas fa-map-marker-alt"></i> Area</label>
                <input type="text" id="area" name="area" class="form-control" onChange="onArea()" placeholder="Enter your area" required>
                <span id="userArea" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="phone" class="form-label"><i class="fas fa-phone"></i> Phone No</label>
                <input type="number" id="phoneNo" name="phoneNo" class="form-control" onChange="onPhoneNo()" placeholder="Enter your phone number" required>
                <span id="userPhoneNo" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="distance" class="form-label"><i class="fas fa-road"></i> Distance</label>
                <input type="text" id="distance" name="distance" class="form-control" onChange="onDistance()" placeholder="Enter distance" required>
                <span id="userDistance" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="age" class="form-label"><i class="fas fa-calendar"></i> Age</label>
                <input type="number" id="age" name="age" class="form-control" onChange="onAge()" placeholder="Enter your age" required>
                <span id="userAge" style="color: red;"></span>
            </div>
            <button type="submit" class="btn btn-submit"><i class="fas fa-paper-plane"></i> Submit Enquiry</button>
        </form>
    </div>

    <!-- Footer -->
    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy</a>
        <a href="#">Terms & Conditions</a>
    </div>

        <script>
             function onNameChange(){
             console.log('this is on place name');
             var name = document.getElementById('name');
             var nameValue = name.value;

             if (nameValue.trim().length < 3){
                 document.getElementById("userName").innerHTML = "Name must be at least 3 characters long.";
                 return;
             }else {
                 document.getElementById("userName").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/name/" + nameValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("userName").innerHTML = this.responseText;
             }
             }

             function onArea() {
             console.log('this is on place area');
             var area = document.getElementById('area');
             var areaValue = area.value;

             if (areaValue.trim().length < 4){
                 document.getElementById("userArea").innerHTML = "Area must be at least 4 characters long.";
                 return;
             }else {
                 document.getElementById("userArea").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/area/" + areaValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("userArea").innerHTML = this.responseText;
             }
             }

             function onPhoneNo() {
             console.log('this is on place phoneNo');
             var phoneNo = document.getElementById('phoneNo');
             var phoneNoValue = phoneNo.value;

             if (phoneNoValue.trim().length !== 10 || (!phoneNoValue.startsWith("6") && !phoneNoValue.startsWith("7")
               && !phoneNoValue.startsWith("8") && !phoneNoValue.startsWith("9")))
               {
                 document.getElementById("userPhoneNo").innerHTML = "Phone number must contain 10 digits and should be valid.";
                 return;
             }else {
                 document.getElementById("userPhoneNo").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/phoneNo/" + phoneNoValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("userPhoneNo").innerHTML = this.responseText;
             }
             }

             function onDistance() {
             console.log('this is on place distance');
             var distance = document.getElementById('distance');
             var distanceValue = distance.value;

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/distance/" + distanceValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("userDistance").innerHTML = this.responseText;
             }
             }

             function onAge() {
             console.log('this is on place age');
             var age = document.getElementById('age');
             var ageValue = age.value;

             if (ageValue <= 18)
                  {
                     document.getElementById("userAge").innerHTML = "Age should be valid and above 18";
                     return;
             }else {
                     document.getElementById("userAge").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/age/" + ageValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("userAge").innerHTML = this.responseText;
             }
             }
        </script>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>



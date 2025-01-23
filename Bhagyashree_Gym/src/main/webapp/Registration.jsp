<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: #f4f4f9;
        }

        .navbar {
            background: linear-gradient(120deg, #4f8fc0, #357aab);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .navbar .nav-link {
            color: #fff;
            font-size: 1rem;
            transition: background 0.3s, color 0.3s;
        }

        .navbar .nav-link:hover,
        .navbar .nav-link.active {
            background-color: #2c6694;
            color: #f9f9f9;
            border-radius: 5px;
        }

        .form-container {
            background: #fff;
            margin: 100px auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            max-width: 600px;
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #2c3e50;
        }

        .form-control {
            border-radius: 5px;
            border: 1px solid #ccc;
            transition: border-color 0.3s;
        }

        .form-control:focus {
            border-color: #4f8fc0;
            box-shadow: 0 0 5px rgba(79, 143, 192, 0.5);
        }

        .form-label i {
            color: #007bff;
        }
        button[type="submit"] {
            background: #4f8fc0;
            border: none;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background 0.3s;
        }

        button[type="submit"]:hover {
            background: #357aab;
        }

        .footer {
            background: #4f8fc0;
            color: #fff;
            text-align: center;
            padding: 15px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        .footer a {
            color: #fff;
            margin: 0 10px;
            text-decoration: none;
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
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="Enquiry.jsp"><i class="fas fa-search"></i> Enquiry</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="search"><i class="fas fa-users"></i> FollowUp</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Registration.jsp"><i class="fas fa-user-plus"></i> Registration</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Update.jsp"><i class="fas fa-edit"></i> Update</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Registration Form -->
    <div class="container">
        <div class="form-container">
            <h2><i class="fas fa-user-plus"></i> Registration</h2>
            <form action="registration" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label"><i class="fas fa-user"></i> Name</label>
                    <input type="text" id="name" name="name" class="form-control" onChange="onRegiNameChange()" placeholder="Enter your name" required>
                    <span id="regiName" style="color: red;"></span>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label"><i class="fas fa-envelope"></i> Email</label>
                    <input type="email" id="email" name="email" class="form-control" onChange="onRegiEmailChange()" placeholder="Enter your email" required>
                    <span id="regiEmail" style="color: red;"></span>
                </div>



                <div class="mb-3">
                    <label for="phoneNo" class="form-label"><i class="fas fa-phone"></i> Phone No</label>
                    <input type="number" id="phoneNo" name="phoneNo" class="form-control" onChange="onRegiPhoneNoChange()" placeholder="Enter your phone number" required>
                    <span id="regiPhoneNo" style="color: red;"></span>
                </div>

                <div class="mb-3">
                    <label for="gymName" class="form-label"><i class="fas fa-dumbbell"></i> Gym Name</label>
                    <input type="text" id="gymName" name="gymName" class="form-control" onChange="onRegiGymNameChange()" placeholder="Gym name" required>
                    <span id="regiGymName" style="color: red;"></span>
                </div>

                <div class="mb-3">
                    <label for="gymPackage" class="form-label"><i class="fas fa-box"></i> Package</label>
                    <select class="form-control" id="gymPackage" name="gymPackage" required>
                          <option value="" data-amount="0" style="color:black;">--select package--</option>
                          <option value="Silver" style="color: black;" data-amount="30000">Silver - 30000</option>
                          <option value="Premium" style="color: black;" data-amount="40000">Premium - 40000</option>
                          <option value="Gold" style="color: black;" data-amount="50000">Gold - 50,000</option>
                          <option value="Platinum" style="color: black;" data-amount="60000">Platinum - 60,000</option>
                          <option value="Diamond" style="color: black;" data-amount="80000">Diamond - 80,000</option>
                    </select>
                </div>

                <div class="mb-3 ">
                    <label for="gymTrainer" class="form-label"><i class="fas fa-user-tie"></i> Gym Trainer</label>
                    <input type="text" id="gymTrainer" name="gymTrainer" class="form-control" onChange="onRegiTrainerChange()" placeholder="Trainer name" required>
                    <span id="regiTrainer" style="color: red;"></span>
                </div>

                <div class="mb-3">
                    <label for="amount" class="form-label"><i class="fas fa-dollar-sign"></i> Amount</label>
                    <input type="number" step="0.01" id="amount" name="amount" class="form-control" placeholder="Enter amount" readonly required>
                </div>

                <div class="mb-3">
                    <label for="discount" class="form-label"><i class="fas fa-tag"></i> Discount (%)</label>
                    <input type="number" step="0.01" id="discount" name="discount" class="form-control" placeholder="Enter discount" required>
                </div>

                <div class="mb-3">
                    <label for="installment" class="form-label"><i class="fas fa-coins"></i> Installment</label>
                    <input type="number" step="0.01" id="installment" name="installment" class="form-control" placeholder="Enter installment amount" required>
                </div>

                <div class="mb-3">
                    <label for="paidAmount" class="form-label"><i class="fas fa-dollar-sign"></i> Paid Amount</label>
                    <input type="number" step="0.01" id="paidAmount" name="paidAmount" class="form-control" placeholder="Enter paid amount" required>
                </div>

                <div class="mb-3">
                    <label for="balance" class="form-label"><i class="fas fa-wallet"></i> Balance</label>
                    <input type="number" step="0.01" id="balance" name="balance" class="form-control" placeholder="Enter balance" readonly required>
                </div>
                <button type="submit" class="btn btn-primary w-100"><i class="fas fa-paper-plane"></i> Register</button>
            </form>
        </div>
    </div>

    <!-- Footer Section -->
    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy</a>
        <a href="#">Terms & Conditions</a>
    </div>
<script>
    document.addEventListener("DOMContentLoaded", function () {
        const packageSelect = document.getElementById("gymPackage");
        const amountInput = document.getElementById("amount");
        const discountInput = document.getElementById("discount");
        const paidAmountInput = document.getElementById("paidAmount");
        const balanceInput = document.getElementById("balance");

        function calculateAmount() {
            const selectedOption = packageSelect.options[packageSelect.selectedIndex];
            const baseAmount = parseFloat(selectedOption.getAttribute("data-amount")) || 0;
            const discount = parseFloat(discountInput.value) || 0;

            // Calculate discounted amount
            const discountedAmount = baseAmount - (baseAmount * (discount / 100));
            amountInput.value = discountedAmount.toFixed(2);

            calculateBalance();
        }

        function calculateBalance() {
            const totalAmount = parseFloat(amountInput.value) || 0;
            const paidAmount = parseFloat(paidAmountInput.value) || 0;

            // Calculate remaining balance
            const balance = totalAmount - paidAmount;
            balanceInput.value = balance.toFixed(2);
        }

        // Event listeners for real-time updates
        packageSelect.addEventListener("change", calculateAmount);
        discountInput.addEventListener("input", calculateAmount);
        paidAmountInput.addEventListener("input", calculateBalance);
    });
</script>

         <script>
             function onRegiNameChange(){
             console.log('this is on place Registration Name');
             var name = document.getElementById('name');
             var regiNameValue = name.value;

             if (regiNameValue.trim().length < 3){
                 document.getElementById("regiName").innerHTML = "Name must be at least 3 characters long.";
                 return;
             }else {
                 document.getElementById("regiName").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/registration/name/" + regiNameValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("regiName").innerHTML = this.responseText;
             }
             }

             function onRegiEmailChange() {
             console.log('this is on place RegiEmailChange');
             var email = document.getElementById('email');
             var regiEmailValue = email.value;

             if (!regiEmailValue.includes('@gmail.com') && !regiEmailValue.includes('@yahoo.com') && !regiEmailValue.includes('@outlook.com') && !regiEmailValue.includes('@hotmail.com') &&
             !regiEmailValue.includes('.edu') && !regiEmailValue.includes('.org') && !regiEmailValue.includes('.info') && !regiEmailValue.includes('.net'))
                   {
                 document.getElementById("regiEmail").innerHTML = "Enter a valid email address.";
                 return;
             }else {
                 document.getElementById("regiEmail").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/registration/email/" + regiEmailValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("regiEmail").innerHTML = this.responseText;
             }
             }


             function onRegiPhoneNoChange() {
             console.log('this is on place regiPhoneNo');
             var phoneNo = document.getElementById('phoneNo');
             var regiPhoneNoValue = phoneNo.value;

             if (regiPhoneNoValue.trim().length !== 10 || (!regiPhoneNoValue.startsWith("6") && !regiPhoneNoValue.startsWith("7")
               && !regiPhoneNoValue.startsWith("8") && !regiPhoneNoValue.startsWith("9")))
               {
                 document.getElementById("regiPhoneNo").innerHTML = "Phone number must contain 10 digits and should be valid.";
                 return;
             }else {
                 document.getElementById("regiPhoneNo").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET", "http://localhost:8080/Bhagyashree_Gym/phoneNo/" + regiPhoneNoValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("regiPhoneNo").innerHTML = this.responseText;
             }
             }

             function onRegiGymNameChange(){
             console.log('this is on place Registration GymName');
             var gymName = document.getElementById('gymName');
             var regiGymNameValue = gymName.value;

             if (regiGymNameValue.trim().length < 3){
                 document.getElementById("regiGymName").innerHTML = "Gym Name must be at least 3 characters long.";
                 return;
             }else {
                 document.getElementById("regiGymName").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/registration/gymName/" + regiGymNameValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("regiGymName").innerHTML = this.responseText;
             }
             }

             function onRegiTrainerChange(){
             console.log('this is on place Registration Trainer');
             var gymTrainer = document.getElementById('gymTrainer');
             var regiTrainerValue = gymTrainer.value;

             if (regiTrainerValue.trim().length < 3){
                 document.getElementById("regiTrainer").innerHTML = "regi Trainer must be at least 3 characters long.";
                 return;
             }else {
                 document.getElementById("regiTrainer").innerHTML = "";
             }

             var xhttp = new XMLHttpRequest();
             xhttp.open("GET","http://localhost:8080/Bhagyashree_Gym/registration/gymTrainer/" + regiTrainerValue);
             xhttp.send();

             xhttp.onload = function(){
             document.getElementById("regiTrainer").innerHTML = this.responseText;
             }
             }
         </script>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

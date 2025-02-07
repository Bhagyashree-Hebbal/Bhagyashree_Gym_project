<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update</title>

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
            background-image: url(https://images.pexels.com/photos/1954524/pexels-photo-1954524.jpeg);
            background-size: cover;
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

        /* Update Form Styling */
        .update-form-container {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
            margin: 100px auto 20px;
        }

        .update-form-container h2 {
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
            background-color: #0056b3;
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
            background-color: #0056b3;
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
                        <a class="nav-link" href="Enquiry.jsp"><i class="fas fa-search"></i> Enquiry</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="search"><i class="fas fa-users"></i> FollowUp</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Registration.jsp"><i class="fas fa-user-plus"></i> Registration</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="RegistrationUpdate.jsp"><i class="fas fa-edit"></i> Update</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Update Form -->
    <div class="update-form-container">
        <h2><i class="fas fa-edit"></i> Update Form</h2>
        <form action="update" method="post">
            <div class="mb-3 form-group">
                <label for="name" class="form-label"><i class="fas fa-user"></i> Name</label>
                <input type="text" id="name" name="name" class="form-control" onChange="onRegiNameChange()" placeholder="Enter your name" required>
                <span id="regiName" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="phoneNo" class="form-label"><i class="fas fa-phone"></i> Phone No</label>
                <input type="number" id="phoneNo" name="phoneNo" class="form-control" onChange="onRegiPhoneNoChange()" placeholder="Enter your phone number" required>
                <span id="regiPhoneNo" style="color: red;"></span>
            </div>
            <div class="mb-3 form-group">
                <label for="gymPackage" class="form-label"><i class="fas fa-box"></i> Package</label>
                <select class="form-control" id="gymPackage" name="gymPackage" required>
                      <option value="" data-amount="0" style="color:black;">--Select Package--</option>
                      <option value="Silver" style="color: black;" data-amount="30000">Silver - 30000</option>
                      <option value="Premium" style="color: black;" data-amount="40000">Premium - 40000</option>
                      <option value="Gold" style="color: black;" data-amount="50000">Gold - 50,000</option>
                      <option value="Platinum" style="color: black;" data-amount="60000">Platinum - 60,000</option>
                      <option value="Diamond" style="color: black;" data-amount="80000">Diamond - 80,000</option>
                </select>
            </div>

            <div class="mb-3 form-group">
                <label for="gymTrainer" class="form-label"><i class="fas fa-user-tie"></i> Trainer</label>
                <input type="text" id="gymTrainer" name="gymTrainer" class="form-control" placeholder="Enter trainer's name" required>
            </div>

            <div class="mb-3 form-group">
                <label for="amount" class="form-label"><i class="fas fa-dollar-sign"></i> Amount</label>
                <input type="number" id="amount" name="amount" class="form-control" placeholder="Enter the amount" required>
            </div>
            <div class="mb-3 form-group">
                <label for="installment" class="form-label"><i class="fas fa-coins"></i> Installment</label>
                <select class="form-control" id="installment" name="installment" required>
                       <option>--Select Installment--</option>
                       <option>1</option>
                       <option>2</option>
                       <option>3</option>
                       <option>4</option>
                       <option>5</option>
                </select>
            </div>

            <div class="mb-3 form-group">
                <label for="balance" class="form-label"><i class="fas fa-wallet"></i> Balance</label>
                <input type="number" id="balance" name="balance" class="form-control" placeholder="Enter the balance amount" required>
            </div>

            <button type="submit" class="btn btn-submit"><i class="fas fa-save"></i> Update</button>
        </form>
    </div>

    <!-- Footer -->
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

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
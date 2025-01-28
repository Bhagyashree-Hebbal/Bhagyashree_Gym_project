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
                        <a class="nav-link active" href="Update.jsp"><i class="fas fa-edit"></i> Update</a>
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
                <label for="gymPackage" class="form-label"><i class="fas fa-box"></i> Package</label>
                <input type="text" id="gymPackage" name="gymPackage" class="form-control" placeholder="Enter package name" required>
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
    // DOM Elements
    const gymPackageSelect = document.getElementById("gymPackage");
    const amountInput = document.getElementById("amount");
    const paidAmountInput = document.getElementById("paidAmount");
    const balanceInput = document.getElementById("balance");

    // Update the amount field when a package is selected
    gymPackageSelect.addEventListener("change", function () {
        const selectedOption = gymPackageSelect.options[gymPackageSelect.selectedIndex];
        const packageAmount = selectedOption.dataset.amount || 0;
        amountInput.value = packageAmount;
        updateBalance();
    });

    // Calculate the balance dynamically when the paid amount is entered
    paidAmountInput.addEventListener("input", updateBalance);

    function updateBalance() {
        const totalAmount = parseFloat(amountInput.value) || 0;
        const paidAmount = parseFloat(paidAmountInput.value) || 0;
        const balance = totalAmount - paidAmount;
        balanceInput.value = balance >= 0 ? balance : 0;
    }

    // Optional: Form validation before submission
    const form = document.querySelector("form");
    form.addEventListener("submit", function (event) {
        const totalAmount = parseFloat(amountInput.value) || 0;
        const paidAmount = parseFloat(paidAmountInput.value) || 0;

        if (paidAmount > totalAmount) {
            alert("Paid amount cannot exceed the total amount.");
            event.preventDefault(); // Prevent form submission
        }
    });
</script>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>

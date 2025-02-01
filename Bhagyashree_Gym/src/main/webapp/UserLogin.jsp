<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <!-- Custom CSS -->
    <style>
        /* Full height layout */
        body {
            background-image: url(data:image/jpeg;base64,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);
            background-size: cover;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            font-family: 'Arial', sans-serif;
        }

        .main-content {
            flex: 1; /* Ensures this section takes available space */
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .login-card {
            background: #fff;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
            padding: 30px;
            max-width: 400px;
            width: 100%;
        }

        .form-control {
            border-radius: 10px;
            border: 2px solid #6a11cb; /* Blue border */
            padding: 10px 15px;
            transition: 0.3s ease;
        }

        .form-control:focus {
            border-color: #2575fc; /* Lighter blue on focus */
            box-shadow: 0 0 5px #2575fc;
        }

        .btn-success {
            background: #6a11cb;
            border: none;
            padding: 10px 20px;
            border-radius: 20px;
            transition: 0.3s ease;
        }

        .btn-success:hover {
            background: #2575fc;
        }

        .icon-field i {
            color: #6a11cb;
            margin-right: 5px;
        }

        a {
            text-decoration: none;
            color: #6a11cb;
        }

        a:hover {
            color: #2575fc;
            text-decoration: underline;
        }

        h2 {
            font-size: 24px;
            text-align: center;
            color: #6a11cb;
            margin-bottom: 20px;
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
    <!-- Main Content Area -->
    <div class="main-content">
        <div class="login-card">
            <h2>User Login</h2>
            <form action="user" method="post">
                <div class="mb-3 form-group icon-field">
                    <label for="email" class="form-label">
                        <i class="fas fa-envelope"></i> Email
                    </label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="Enter your Email" required>
                </div>

                <div class="mb-3 form-group icon-field">
                    <label for="password" class="form-label">
                        <i class="fas fa-lock"></i> Password
                    </label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Enter your Password" required>
                </div>

                <button type="submit" class="btn btn-success w-100">User Login</button>
                <div class="text-center mt-3">
                    <a href="ForgetPassword.jsp">Forgot Password?</a>
                </div>
            </form>
        </div>
    </div>

    <!-- Footer Section -->
    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy <i class="fas fa-shield-alt"></i></a>
        <a href="#">Terms & Conditions <i class="fas fa-file-alt"></i></a>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

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
        body {
            background-image: url(https://cmsgaraga.garaga.com/Drupal/Blog/3%20Reasons%20Why%20All-Glass%20Full-View%20Garage%20Doors%20Are%20Perfect%20for%20Commercial%20Gyms/GarageDoorG-4400_12x10_AnodizedFrame.jpg);
            background-size: cover;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            font-family: 'Arial', sans-serif;
        }

        /* Custom Navbar */
        .navbar {
            background-color: rgba(0, 0, 0, 0.7);
        }

        .navbar-brand, .navbar-nav .nav-link {
            color: white !important;
        }

        .navbar-nav .nav-link:hover {
            color: #f39c12 !important;
        }

        .main-content {
            flex: 1;
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
            border: 2px solid #007bff;
            padding: 10px 15px;
            transition: 0.3s ease;
        }

        .form-control:focus {
            border-color: #0056b3;
            box-shadow: 0 0 5px #0056b3;
        }

        .btn-success {
            background: #007bff;
            border: none;
            padding: 10px 20px;
            border-radius: 20px;
            transition: 0.3s ease;
        }

        .btn-success:hover {
            background: #0056b3;
        }

        .icon-field i {
            color: #007bff;
            margin-right: 5px;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            color: #0056b3;
            text-decoration: underline;
        }

        h2 {
            font-size: 24px;
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
        }

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
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="UserProfile.jsp"><i class="fas fa-user-circle"></i> Profile</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

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
                <div class="text-center mt-3">
                    Don't have an account?
                    <a href="RegistrationUpdate.jsp">Register here</a>
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

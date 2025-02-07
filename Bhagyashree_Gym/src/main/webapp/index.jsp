<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gym</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        body {
            background-image: url(https://cmsgaraga.garaga.com/Drupal/Blog/3%20Reasons%20Why%20All-Glass%20Full-View%20Garage%20Doors%20Are%20Perfect%20for%20Commercial%20Gyms/GarageDoorG-4400_12x10_AnodizedFrame.jpg);
            background-size: cover;
            background-position: center;
            color: white;
            font-family: Arial, sans-serif;
            height: 100vh;
            margin: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .hero-section {
            text-align: center;
            position: relative;
        }

        .hero-section h1 {
            font-size: 4rem;
            font-weight: bold;
            color: white;
            text-shadow: 3px 3px 5px rgba(0, 0, 0, 0.7);
        }

        .hero-section p {
            font-size: 1.5rem;
            margin-top: 20px;
            color: white;
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.6);
        }

        .btn-container {
            position: relative;
            display: flex;
            gap: 20px;
            justify-content: center;
            margin-top: 40px;
            opacity: 0;
            animation: slideUp 1s ease-in-out forwards;
        }

        .btn-custom {
            background-color: #27ae60;
            color: white;
            font-size: 1.2rem;
            border-radius: 25px;
            padding: 10px 30px;
            text-transform: uppercase;
            transition: background-color 0.3s ease-in-out, transform 0.3s ease-in-out;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
        }

        .btn-custom:hover {
            background-color: #b3c0b8;
            transform: translateY(-5px);
        }

        .footer {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 20px 0;
            text-align: center;
            color: white;
            width: 100%;
            position: absolute;
            bottom: 0;
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

        @keyframes slideUp {
            from {
                transform: translateY(100px);
                opacity: 0;
            }
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }

        @media (max-width: 768px) {
            .hero-section h1 {
                font-size: 2.5rem;
            }

            .hero-section p {
                font-size: 1.2rem;
            }

            .btn-custom {
                font-size: 1rem;
            }
        }
    </style>
</head>

<body>
    <!-- Hero Section -->
    <div class="hero-section">
        <h1><i class="fas fa-dumbbell"></i> Welcome to Gym</h1>
        <p>Your journey to fitness starts here. Achieve your goals with us!</p>
        <div class="btn-container">
            <a href="AdminLogin.jsp" class="btn btn-custom"><i class="fas fa-sign-in-alt"></i> Admin Login</a>
            <a href="UserLogin" class="btn btn-custom"><i class="fas fa-sign-in-alt"></i> User Login</a>
        </div>
    </div>

    <!-- Footer Section -->
    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy <i class="fas fa-shield-alt"></i></a>
        <a href="#">Terms & Conditions <i class="fas fa-file-alt"></i></a>
    </div>

    <!-- Bootstrap JS & Dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

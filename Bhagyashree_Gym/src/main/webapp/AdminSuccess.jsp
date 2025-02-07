<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        /* Full-page background with gradient */
        body {
            background-image: url(https://cmsgaraga.garaga.com/Drupal/Blog/3%20Reasons%20Why%20All-Glass%20Full-View%20Garage%20Doors%20Are%20Perfect%20for%20Commercial%20Gyms/GarageDoorG-4400_12x10_AnodizedFrame.jpg);
            background-size: cover;
            color: white;
            font-family: 'Arial', sans-serif;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        /* Centered success container */
        .success-container {
            text-align: center;
            padding: 50px 30px;
            background-color: rgba(0, 0, 0, 0.7);
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            margin-bottom: 20px;
            width: 90%;
            max-width: 500px;
        }

        /* Custom success message styling */
        h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
            color: #f39c12;
        }

        /* Custom buttons */
        .btn-custom {
            background-color: #f39c12;
            color: white;
            font-size: 1rem;
            padding: 10px 20px;
            border-radius: 5px;
            text-transform: uppercase;
            border: none;
            transition: background-color 0.3s ease;
        }

        .btn-custom:hover {
            background-color: #e67e22;
        }

        /* Icon for success */
        .success-icon {
            font-size: 4rem;
            color: #27ae60;
            margin-bottom: 20px;
        }

        /* Link container for navigation buttons */
        .nav-links {
            text-align: center;
            margin-top: 10px;
        }

        /* Spacing for buttons */
        .btn-danger {
            margin: 5px;
            padding: 10px 20px;
        }
    </style>
</head>

<body>
    <div class="success-container">
        <!-- FontAwesome Success Icon -->
        <div class="success-icon">
            <i class="fas fa-check-circle"></i>
        </div>
        <h1>Admin Successfully Logged In</h1>
        <p>Welcome back! You can now manage your dashboard and settings.</p>
        <a href="Intermediate.jsp" class="btn btn-custom mt-3">
            <i class="fas fa-tachometer-alt"></i> Go to Dashboard
        </a>
    </div>

    <!-- Bootstrap JS & Dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

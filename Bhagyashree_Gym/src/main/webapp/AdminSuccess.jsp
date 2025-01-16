<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Full-page background with gradient */
        body {
            background: linear-gradient(135deg, #6dd5ed, #2980b9);
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
        <h1>Admin Successfully Logged In</h1>
        <p>Welcome back! You can now manage your dashboard and settings.</p>
        <a href="Intermediate.jsp" class="btn btn-custom mt-3">Go to Dashboard</a>
    </div>

    <!-- Bootstrap JS & Dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Intermediate Page</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        /* Page Styling */
        body {
            background-image: url(https://cmsgaraga.garaga.com/Drupal/Blog/3%20Reasons%20Why%20All-Glass%20Full-View%20Garage%20Doors%20Are%20Perfect%20for%20Commercial%20Gyms/GarageDoorG-4400_12x10_AnodizedFrame.jpg);
            background-size: cover;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            font-family: 'Arial', sans-serif;
            color: #333;
            margin: 0;
            padding-top: 70px; /* Content starts below the navbar */

        }

        .content-container {
            text-align: center;
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            max-height: 150px;
            margin: auto;
            flex-grow: 1;
        }

        h1 {
            color: #2c3e50;
            font-size: 2.5rem;
            margin-bottom: 20px;
        }

        .content-container p {
            color: black;
            font-size: 1.2rem;
            line-height: 1.6;
        }

        /* Navbar Styling */
        .navbar-nav .nav-link {
            font-size: 1.1rem;
            color: white !important;
            margin: 0 10px;
        }

        .navbar-nav .nav-link:hover {
            color: #f39c12 !important;
        }

        .navbar-nav .nav-link .fa {
            margin-right: 8px;
        }
    </style>
</head>

<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
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
                        <a class="nav-link active" href="search"><i class="fas fa-users"></i> FollowUp</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Registration.jsp"><i class="fas fa-user-plus"></i> Registration</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="RegistrationUpdate.jsp"><i class="fas fa-edit"></i> Update</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="trainersSlots"><i class="fas fa-calendar-alt"></i> SlotsTrainers</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Main Content -->
    <div class="content-container">
        <h1><i class="fa fa-dumbbell"></i> Welcome to the Gym Portal</h1>
        <p>Your journey to health and fitness starts here. Track your progress, stay motivated, and achieve your goals with us!</p>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

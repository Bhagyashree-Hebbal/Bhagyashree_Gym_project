<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trainers</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- FontAwesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            max-width: 500px;
            margin-top: 50px;
            background: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="text-center mb-4">Add Trainers</h2>
        <form action="slots" method="post">

            <!-- Trainer Name -->
            <div class="mb-3">
                <label for="trainerName" class="form-label"><i class="fas fa-user"></i> Trainer Name</label>
                <input type="text" id="trainerName" name="trainerName" class="form-control" placeholder="Enter Trainer Name" required>
            </div>

            <!-- Phone Number -->
            <div class="mb-3">
                <label for="phoneNo" class="form-label"><i class="fas fa-phone"></i> Phone Number</label>
                <input type="tel" id="phoneNo" name="phoneNo" class="form-control" placeholder="Enter Phone Number" pattern="[0-9]{10}" required>
            </div>

            <!-- Total Time -->
            <div class="mb-3">
                <label for="totalTime" class="form-label"><i class="fas fa-hourglass-half"></i> Total Time</label>
                <input type="number" id="totalTime" name="totalTime" class="form-control" placeholder="Enter Total Time" required>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary w-100"><i class="fas fa-user-plus"></i> Add Trainer</button>

        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

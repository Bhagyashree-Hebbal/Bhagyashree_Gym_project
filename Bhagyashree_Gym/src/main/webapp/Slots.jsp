<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Slots</title>

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
        <h2 class="text-center mb-4">Add Slots</h2>
        <form action="slots" method="post">

            <!-- Start Time -->
            <div class="mb-3">
                <label for="startTime" class="form-label"><i class="fas fa-clock"></i> Start Time</label>
                <input type="number" id="startTime" name="startTime" class="form-control" placeholder="Enter Start Time" required>
            </div>

            <!-- End Time -->
            <div class="mb-3">
                <label for="endTime" class="form-label"><i class="fas fa-clock"></i> End Time</label>
                <input type="number" id="endTime" name="endTime" class="form-control" placeholder="Enter End Time" required>
            </div>

            <!-- Total Time (Auto-Calculated) -->
            <div class="mb-3">
                <label for="totalTime" class="form-label"><i class="fas fa-hourglass-half"></i> Total Time</label>
                <input type="number" id="totalTime" name="totalTime" class="form-control" placeholder="Total Time" readonly>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary w-100"><i class="fas fa-plus"></i> Add Slot</button>

        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <!-- JavaScript for Total Time Calculation -->
    <script>
        document.getElementById('startTime').addEventListener('input', calculateTotalTime);
        document.getElementById('endTime').addEventListener('input', calculateTotalTime);

        function calculateTotalTime() {
            let startTime = parseInt(document.getElementById('startTime').value) || 0;
            let endTime = parseInt(document.getElementById('endTime').value) || 0;

            if (startTime >= 0 && endTime > startTime) {
                document.getElementById('totalTime').value = endTime - startTime;
            } else {
                document.getElementById('totalTime').value = "";
            }
        }
    </script>

</body>
</html>

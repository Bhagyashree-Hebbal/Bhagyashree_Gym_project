<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Page</title>
</head>
<body>
    <form action="view" method="get">
            <label for="name" class="form-label"><i class="fas fa-user"></i> Name</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Enter your name" required>

            <label for="phoneNo" class="form-label"><i class="fas fa-phone"></i> Phone No</label>
            <input type="number" id="phoneNo" name="phoneNo" class="form-control" placeholder="Enter your phone number" required>

            <button type="submit" class="btn btn-submit"><i class="fas fa-save"></i> Search</button>
    </form>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-image: url(https://images.pexels.com/photos/1954524/pexels-photo-1954524.jpeg);
            background-size: cover;
        }
        .container {
            max-width: 400px;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
<c:set var="userName" value="${userName}" />
    <div class="container">
        <h2 class="text-center mb-4">Reset Password</h2>
        <form action="resetPassword" method="post">
        <input type="text" name="name" value="${userName}">
            <div class="form-group">
                <label for="oldPassword">Old Password</label>
                <input type="password" name="oldPassword" id="oldPassword" class="form-control" placeholder="Enter your old password" required>
            </div>
            <div class="mb-3">
                <label for="newPassword" class="form-label">New Password</label>
                <input type="password" name="newPassword" id="newPassword" class="form-control" placeholder="Enter your new password" required>
            </div>
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="password" name="confirmPassword" id="confirmPassword" class="form-control" placeholder="Confirm your new password" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Update Password</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

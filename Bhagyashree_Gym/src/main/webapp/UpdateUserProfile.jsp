<%@ page isELIgnored = "false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Update Profile</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    .container {
      max-width: 500px;
      background: #ffffff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      margin-top: 50px;
    }
    .btn-center {
      display: block;
      width: 100%;
    }
  </style>
</head>

<body>
  <div class="container">
    <h2 class="text-center mb-4">User Update Profile</h2>
    <form action="updateUserProfile" method="post" enctype="multipart/form-data">
      <div class="mb-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name" value="${register.name}" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Age</label>
        <input type="number" class="form-control" name="age" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Height</label>
        <input type="number" class="form-control" name="height" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Weight</label>
        <input type="number" class="form-control" name="weight" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Upload Your Picture</label>
        <input type="file" class="form-control" name="picture" required>
      </div>
      <button type="submit" class="btn btn-primary btn-center">Update Changes</button>
    </form>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

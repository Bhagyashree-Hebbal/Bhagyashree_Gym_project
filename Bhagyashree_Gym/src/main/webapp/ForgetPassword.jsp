<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Forget Password</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(to right, #6a11cb, #2575fc);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .card {
      width: 400px;
      padding: 20px;
      border-radius: 15px;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    }
    .btn-primary {
      background-color: #2575fc;
      border: none;
    }
    .btn-primary:hover {
      background-color: #6a11cb;
    }
  </style>
</head>
<body>
  <div class="card bg-white">
    <h3 class="text-center mb-4">Forget Password</h3>
    <form action="forgetPassword" method="post">
      <div class="mb-3">
          <label for="email" class="form-label">Email Address</label>
          <input type="email" class="form-control" name="email" id="email" placeholder="Enter your email" required>
      </div>

      <div class="mb-3">
          <label for="newPassword" class="form-label">New Password</label>
          <input type="password" class="form-control" name="newPassword" id="newPassword" placeholder="Enter your new password" required>
      </div>

      <div class="mb-3">
          <label for="confirmPassword" class="form-label">Confirm Password</label>
          <input type="password" class="form-control" name="confirmPassword" id="confirmPassword" placeholder="Confirm your password" required>
      </div>

      <button type="submit" class="btn btn-primary w-100">Reset Password</button>
    </form>
  </div>
</body>
</html>

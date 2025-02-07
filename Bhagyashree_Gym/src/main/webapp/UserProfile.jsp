<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url(https://images.pexels.com/photos/1954524/pexels-photo-1954524.jpeg);
            background-size: cover;
        }
        .content {
            max-width: 600px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .profile-header {
            font-size: 24px;
            font-weight: bold;
            text-align: center;
            margin-bottom: 20px;
        }
        .profile-card {
            text-align: center;
            margin-bottom: 20px;
        }
        .profile-image {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            object-fit: cover;
            border: 3px solid black;
        }
        .profile-table th {
            width: 50%;
            background-color:whitesmoke;
            color: black;
            text-align: left;
            padding: 10px;
        }
        .profile-table td {
            padding: 10px;
        }
        .btn {
            display: block;
            width: 100%;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="content">
            <div class="profile-header">My Profile</div>
            <div class="profile-card">
                <img src="download?filePath=${filePath}" alt="profile picture" class="profile-image">
                <h2>${register.name}</h2>
            </div>
            <table class="table table-bordered profile-table">
                <tr>
                    <th>Full Name</th>
                    <td>${register.name}</td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td>${register.email}</td>
                </tr>
                <tr>
                    <th>Age</th>
                    <td>${register.age}</td>
                </tr>
                <tr>
                    <th>Contact Number</th>
                    <td>${register.phoneNo}</td>
                </tr>
                <tr>
                    <th>Gym Name</th>
                    <td>${register.gymName}</td>
                </tr>
                <tr>
                    <th>Gym Package</th>
                    <td>${register.gymPackage}</td>
                </tr>
                <tr>
                    <th>Trainer</th>
                    <td>${register.gymTrainer}</td>
                </tr>
                <tr>
                    <th>Total Amount</th>
                    <td>${register.amount}</td>
                </tr>
                <tr>
                    <th>Discount</th>
                    <td>${register.discount}</td>
                </tr>
                <tr>
                    <th>Amount Paid</th>
                    <td>${register.paidAmount}</td>
                </tr>
                <tr>
                    <th>Balance Amount</th>
                    <td>${register.balance}</td>
                </tr>
                <tr>
                    <th>Height</th>
                    <td>${register.height}</td>
                </tr>
                <tr>
                    <th>Weight</th>
                    <td>${register.weight}</td>
                </tr>
            </table>
            <a href="update?registrationId=${register.registrationId}" class="btn btn-primary">Update Profile</a>
        </div>
    </div>
</body>
</html>

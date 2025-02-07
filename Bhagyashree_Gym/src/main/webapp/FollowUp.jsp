<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Update Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-image: url(https://images.pexels.com/photos/1954524/pexels-photo-1954524.jpeg);
            background-size: cover;
        }

        /* Navbar Styling */
        .navbar {
            background: linear-gradient(120deg, #007bff, #0056b3);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .navbar .nav-link {
            color: #fff;
            font-size: 1rem;
            transition: background 0.3s, color 0.3s;
        }

        .navbar .nav-link:hover,
        .navbar .nav-link.active {
            background-color: #2c6694;
            color: #f9f9f9;
            border-radius: 5px;
        }

        /* Table Styling */
        table {
            width: 90%;
            margin: 20px auto;
            border-collapse: separate;
            border-spacing: 0;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
        }

        th {
            background: linear-gradient(120deg, #007bff, #0056b3);
            color: white;
            font-weight: bold;
            border-bottom: 2px solid #ddd;
        }

        td {
            border-bottom: 1px solid #ddd;
        }

        tr:last-child td {
            border-bottom: none;
        }

        tr:hover {
            background: rgba(135, 206, 250, 0.2);
        }

        /* Form Inputs */
        select, input[type="text"], button {
            padding: 8px;
            margin: 0;
            border-radius: 5px;
            border: 1px solid #ccc;
            outline: none;
            transition: all 0.3s ease-in-out;
        }

        select:focus, input[type="text"]:focus {
            border-color: #4f8fc0;
            box-shadow: 0 0 5px rgba(79, 143, 192, 0.5);
        }

        button {
            cursor: pointer;
            color: white;
            border: none;
            transition: all 0.3s;
        }

        button:hover {
            transform: translateY(-2px);
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }

        .btn {
        color:white;
            background-color: #0056b3;
        }

        .btn:hover {
            background-color: #357aab;
        }

        /* Search Bar */
        .search-bar {
            width: 90%;
            margin: 20px auto;
            text-align: center;
            padding: 10px 0;
        }

        .search-bar label {
            font-weight: bold;
        }

        /* Footer Styling */
        .footer {
            background: #0056b3;
            color: #fff;
            text-align: center;
            padding: 15px;

            bottom: 0;
            width: 100%;
        }

        .footer a {
            color: #fff;
            margin: 0 10px;
            text-decoration: none;
        }

        .footer a:hover {
            text-decoration: underline;
        }

        /* Scrollable Content Styling */
        .scrollable-container {
            max-height: 400px; /* Adjust this to your desired height */
            overflow-y: auto; /* Enable vertical scrolling */
            overflow-x: hidden; /* Disable horizontal scrolling */
            margin: 20px auto;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background: #fff;
        }

        .scrollable-container::-webkit-scrollbar {
            width: 10px;
        }

        .scrollable-container::-webkit-scrollbar-thumb {
            background: #4f8fc0;
            border-radius: 5px;
        }

        .scrollable-container::-webkit-scrollbar-thumb:hover {
            background: #357aab;
        }
    </style>

</head>

<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top">
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="Enquiry.jsp"><i class="fas fa-search"></i> Enquiry</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="search"><i class="fas fa-users"></i> FollowUp</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Registration.jsp"><i class="fas fa-user-plus"></i> Registration</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="RegistrationUpdate.jsp"><i class="fas fa-edit"></i> Update</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <h2 style="text-align: center; margin-top: 100px;">Follow-Up Form</h2>

    <!-- Search Bar -->
    <div class="search-bar">
        <form action="search" method="get">
            <label for="status">Filter by Status:</label>
            <select name="status" id="status">
                <option value="">--Select Status--</option>
                <c:forEach var="status" items="${statusOptions}">
                    <option value="${status}" ${param.status==status ? 'selected' : '' }>
                        ${status}
                    </option>
                </c:forEach>
            </select>
            <button type="submit" class="btn"><i class="fas fa-search"></i> Search</button>
        </form>
    </div>

    <!-- Table -->
    <div class="scrollable-container">
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Area</th>
                <th>PhoneNo</th>
                <th>Distance</th>
                <th>Age</th>
                <th>Status</th>
                <th>Reasons</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="enquiry" items="${enquiryList}">
                <tr>
                    <form action="updateFollowUp" method="post">
                        <td>${enquiry.name}</td>
                        <td>${enquiry.area}</td>
                        <td>${enquiry.phoneNo}</td>
                        <td>${enquiry.distance}</td>
                        <td>${enquiry.age}</td>
                        <td>
                            <select name="status">
                                <c:forEach var="status" items="${statusOptions}">
                                    <option value="${status}" ${status==enquiry.status ? 'selected' : '' }>
                                        ${status}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                        <td>
                            <input type="text" name="reason" value="${enquiry.reasons}" />
                        </td>
                        <td>
                            <input type="hidden" name="name" value="${enquiry.name}" />
                            <button type="submit" class="btn"><i class="fas fa-edit"></i> Update</button>
                            <a href="view?enquiryId=${enquiry.enquiryId}" class="btn"><i class="fas fa-eye"></i> View </a>
                        </td>
                    </form>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>

    <!-- Footer Section -->
    <div class="footer">
        <p>&copy; 2025 Gym | All Rights Reserved</p>
        <a href="#">Privacy Policy</a>
        <a href="#">Terms & Conditions</a>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

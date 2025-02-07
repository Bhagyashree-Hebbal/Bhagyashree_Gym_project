<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url(https://images.pexels.com/photos/1954524/pexels-photo-1954524.jpeg);
            background-size: cover;
            background-position: center;
            margin: 20px;
        }

        .table-container {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
            overflow-x: auto;
        }

        .custom-table {
            border-collapse: separate;
            border-spacing: 0 10px;
        }

        .custom-table thead {
            background: blue;
            color: white;
            text-align: center;
        }

        .custom-table tbody tr {
            background: white;
            border-radius: 10px;
            transition: transform 0.2s ease-in-out;
        }

        .custom-table tbody tr:hover {
            transform: scale(1.02);
        }

        .custom-table th, .custom-table td {
            text-align: center;
            vertical-align: middle;
            padding: 15px;
        }

    </style>
</head>
<body>
    <div class="container">
        <div class="table-container">
            <h2 class="text-center mb-4">View Read Page</h2>
            <table class="table custom-table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Area</th>
                        <th>Phone No</th>
                        <th>Reasons</th>
                        <th>Updated Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${enquiryList}" var="item">
                        <tr>
                            <td>${item.name}</td>
                            <td>${item.area}</td>
                            <td>${item.phoneNo}</td>
                            <td>${item.reasons}</td>
                            <td>${item.updatedDate}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

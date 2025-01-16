<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Update Form</title>
    <style>
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }

        th,
        td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        button {
            padding: 5px 10px;
            margin: 5px;
            border: none;
            cursor: pointer;
        }

        .update-btn {
            background-color: blue;
            color: white;
        }

        .delete-btn {
            background-color: red;
            color: white;
        }
    </style>
</head>

<body>
    <h2 style="text-align: center;">Follow-Up Form</h2>
    <!-- Search Bar -->
    <div class="search-bar">
        <form action="search" method="post">
            <label for="status">Filter by Status:</label>
            <select name="status" id="status">
                <option value="">--Select Status--</option>
                <c:forEach var="status" items="${statusOptions}">
                    <option value="${status}" ${param.status==status ? 'selected' : '' }>
                        ${status}
                    </option>
                </c:forEach>
            </select>
            <button type="submit" class="btn">Search</button>
        </form>
    </div>


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
                            <button type="submit" class="btn">Update</button>
                        </td>
                    </form>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
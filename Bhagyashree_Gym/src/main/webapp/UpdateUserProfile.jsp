<%@ page isELIgnored = "false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>UserUpdateprofile</title>
</head>

<body>
  <h2>User Update Profile</h2>

  <form action="updateUserProfile" method="post" enctype="multipart/form-data">
    <pre>
      <label>Name</label>
      <input type="text" name="name" value="${register.name}" />

      <label>Age</label>
      <input type="number" name="age">

      <label>Height</label>
      <input type="number" name="height">

      <label>Weight</label>
      <input type="number" name="weight">

      <label>Upload Your Picture</label>
      <input type="file" name="filePath" >

      <button type="submit" class="btn btn-primary btn-center">Update Changes</button>

  </pre>
  </form>
</body>

</html>
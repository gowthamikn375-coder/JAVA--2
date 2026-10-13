<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>

<body>

<h2>Student Registration Form</h2>

<form action="register" method="post">

    <label>Student Name:</label>
    <input type="text" name="name" required>

    <br><br>

    <label>Email ID:</label>
    <input type="email" name="email" required>

    <br><br>

    <label>Course:</label>

    <select name="course" required>
        <option value="">-- Select Course --</option>
        <option value="Java">Java</option>
        <option value="Python">Python</option>
        <option value="Web Development">Web Development</option>
        <option value="Data Science">Data Science</option>
    </select>

    <br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>
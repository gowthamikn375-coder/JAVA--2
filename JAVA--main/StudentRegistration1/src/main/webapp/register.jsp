<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>

    <style>
        body {
            font-family: Arial;
            background-color: #f2f2f2;
        }

        .container {
            width: 450px;
            margin: 50px auto;
            padding: 25px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            margin-top: 20px;
            background-color: #333;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Student Registration Form</h2>

    <form action="StudentServlet" method="post">

        <label>Student Name:</label>
        <input type="text" name="name" required>

        <label>Email ID:</label>
        <input type="email" name="email" required>

        <label>Course:</label>

        <select name="course" required>

            <option value="">-- Select Course --</option>

            <option value="Computer Science Engineering">
                Computer Science Engineering
            </option>

            <option value="Information Science Engineering">
                Information Science Engineering
            </option>

            <option value="Artificial Intelligence and Machine Learning">
                Artificial Intelligence and Machine Learning
            </option>

            <option value="Electronics and Communication Engineering">
                Electronics and Communication Engineering
            </option>

            <option value="Mechanical Engineering">
                Mechanical Engineering
            </option>

        </select>

        <input type="submit" value="Register">

    </form>

</div>

</body>
</html>
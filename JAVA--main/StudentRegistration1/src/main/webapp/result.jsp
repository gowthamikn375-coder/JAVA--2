<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>

<html>

<head>

    <title>Registration Result</title>

    <style>

        body {
            font-family: Arial;
            background-color: #f2f2f2;
        }

        .container {
            width: 500px;
            margin: 50px auto;
            padding: 25px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        .success {
            color: green;
        }

        .error {
            color: red;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        td {
            padding: 10px;
            border: 1px solid #ddd;
        }

    </style>

</head>

<body>

<div class="container">

<%
    String error = (String) request.getAttribute("error");

    if (error != null) {
%>

    <h2 class="error">
        Registration Failed
    </h2>

    <p class="error">
        <%= error %>
    </p>

    <a href="register.jsp">
        Go Back to Registration
    </a>

<%
    } else {
%>

    <h2 class="success">
        Registration Successful
    </h2>

    <table>

        <tr>
            <td><strong>Student Name</strong></td>
            <td><%= request.getAttribute("name") %></td>
        </tr>

        <tr>
            <td><strong>Email ID</strong></td>
            <td><%= request.getAttribute("email") %></td>
        </tr>

        <tr>
            <td><strong>Course</strong></td>
            <td><%= request.getAttribute("course") %></td>
        </tr>

    </table>

    <br>

    <a href="register.jsp">
        Register Another Student
    </a>

<%
    }
%>

</div>

</body>

</html>
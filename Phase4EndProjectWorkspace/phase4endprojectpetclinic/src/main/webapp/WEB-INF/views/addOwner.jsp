<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Owner</title>
</head>
<body>
<nav>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/owners">View Owners</a></li>
            <li><a href="/pets">View Pets</a></li>
            <li><a href="/visits">View Visits</a></li>
            <li><a href="/addOwner">Add Owner</a></li>
            <li><a href="/addPet">Add Pet</a></li>
            <li><a href="/addVisit">Add Visit</a></li>
        </ul>
    </nav>
    <h1>Add Owner</h1>
    <form action="/addOwner" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br>

        <button type="submit">Add Owner</button>
    </form>
</body>
</html>
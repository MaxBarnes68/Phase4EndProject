<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Pet</title>
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
    <h1>Add Pet</h1>
    <form action="/addPet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="type">Type:</label>
        <input type="text" id="type" name="type" required><br>

        <label for="ownerId">Owner ID:</label>
        <input type="text" id="ownerId" name="ownerId" required><br>

        <button type="submit">Add Pet</button>
    </form>
</body>
</html>
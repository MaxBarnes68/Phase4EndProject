<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Visit</title>
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
    <h1>Add Visit</h1>
    <form action="/addVisit" method="post">
        <label for="visitDate">Visit Date:</label>
        <input type="date" id="visitDate" name="visitDate" required><br>

        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required><br>

        <label for="petId">Pet ID:</label>
        <input type="text" id="petId" name="petId" required><br>

        <button type="submit">Add Visit</button>
    </form>

</body>
</html>

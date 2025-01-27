<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pets</title>
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
    <h1>Pets</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Type</th>
            <th>Owner</th>
        </tr>
        <c:forEach var="pet" items="${pets}">
            <tr>
                <td>${pet.name}</td>
                <td>${pet.type}</td>
                <td>${pet.owner.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
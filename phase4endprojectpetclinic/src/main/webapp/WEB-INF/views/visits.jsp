<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Visits</title>
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
    <h1>Visits</h1>
    <table border="1">
        <tr>
            <th>Visit Date</th>
            <th>Description</th>
            <th>Pet</th>
        </tr>
        <c:forEach var="visit" items="${visits}">
            <tr>
                <td>${visit.visitDate}</td>
                <td>${visit.description}</td>
                <td>${visit.pet.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
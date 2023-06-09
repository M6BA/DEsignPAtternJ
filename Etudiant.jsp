<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription</title>
</head>
<body>
    <h1>Inscription</h1>

    <form action="/inscription" method="post">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required><br>

        <label for="prenom">Prénom:</label>
        <input type="text" id="prenom" name="prenom" required><br>

        <label for="classe">Classe:</label>
        <input type="text" id="classe" name="classe" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="tuteur">Tuteur:</label>
        <input type="text" id="tuteur" name="tuteur" required><br>

        <label for="motDePasse">

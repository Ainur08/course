<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Профиль</title>
</head>
<body>
<h1>Профиль</h1>
<div>
    <p>${"Имя: "+ user.getName()}</p>
    <p>${"Почта: "+ user.getEmail()}</p>
</div>

<a href="http://localhost:8080/Course_war_exploded/add">Разместить технику</a>
<a href="http://localhost:8080/Course_war_exploded/edit">Редактировать профиль</a>
<a href="http://localhost:8080/Course_war_exploded/logout">Выйти</a>
</body>
</html>
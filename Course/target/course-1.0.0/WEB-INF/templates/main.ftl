<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Главная</title>
</head>
<body>
<#list techniques as technique>
    <div>
        <h1><a href="http://localhost:8080/Course_war_exploded/techniques/${technique.getId()}"><p>${technique.getName()}</p></a></h1>
        <p>${"Дата: "+ technique.getDate()}</p>
        <p> ${"Описание: "+ technique.getDescription()}</p>
<#--        <h6 style="margin-top: 0; margin-bottom: 0px">${"Автор: "+ technique.getIdUser()}</h6>-->
    </div>
</#list>
</body>
</html>

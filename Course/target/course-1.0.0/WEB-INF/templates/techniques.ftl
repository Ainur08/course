<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Техника</title>
</head>
<body>
    <div>
        <p>${"Имя: "+ technique.getName()}</p>
        <p>${"Категория: "+ technique.getCategory()}</p>
        <p>${"Дата: "+ technique.getDate()}</p>
        <p> ${"Описание: "+ technique.getDescription()}</p>
<#--        <h6 style="margin-top: 0; margin-bottom: 0px">${"Автор: "+ technique.getIdUser()}</h6>-->
    </div>

    <form method="post">
        <input type="submit" value="Откликнуться">
    </form>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Разместить</title>
</head>
<body>
<form method="post">
    <p><input style="margin-top: 75px; margin-left: 200px" type="text" name="name" placeholder="Название"></p>
    <p><select style="margin-top: 10px; margin-left: 200px" name ="category" size="1">
            <option selected="selected" value="Землеройная">Землеройная</option>
            <option value="Подъёмная">Подъёмная</option>
            <option value="Дорожная">Дорожная</option>
            <option value="Транспортная">Транспортная</option>
        </select><p>

    <p><textarea style="margin-top: 10px; margin-left: 200px" name="description" rows="30" cols="40" maxlength="5000" placeholder="Описание"></textarea></p>
<#--    <p style="margin-left: 200px; margin-top: 5px"><input type="file" name="file"></p>-->
    <p><input style="margin-top: 8px; margin-left: 200px" class="button" type="submit" value="Разместить"></p>
</form>
</body>
</html>
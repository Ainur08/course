<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Войти</title>
</head>
<body>
<form method="post">
    <input type="text" name="email" placeholder="Почта">
    <input type="password" name="password" placeholder="Пароль">
    <label>
        <input type="checkbox" name="remember-me"> Запомни меня
    </label>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <input type="submit" value="Войти">
</form>
</body>
</html>
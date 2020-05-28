<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Зарегистрироваться</title>
</head>
<body>
<div>
    <@spring.bind "signUpForm" />
    <form method="post" action="/signUp">
        <input type="hidden" value="${_csrf.token}" name="${_csrf.parameterName}">
        Email: <br>
        <@spring.formInput "signUpForm.email"/>
        <br><br>
        Password: <br>
        <@spring.formPasswordInput "signUpForm.password"/>

        <input type="submit" value='Зарегистрироваться'/>
    </form>
</div>
</body>
</html>
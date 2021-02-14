<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/partials/head.jsp" />
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<h1 class="text-center">Login</h1>
<form action="/adsite_war_exploded/login" method="post">
    <div class="form-group">
        <label for="email">email</label>
        <input type="text" id="email" name="email" class="form-control">
    </div>
    <div class="form-group">
        <label for="password">password</label>
        <input type="password" id="password" name="password" class="form-control">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="login">
</form>
</body>
</html>


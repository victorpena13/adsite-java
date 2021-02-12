<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/partials/head.jsp" />
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<h1 class="text-center">Adlister</h1>

<h6 class="text-center">Test the functionality of my mockup of craigslist</h6>
<h6 class="text-center">Step 1: Register an account </h6>
<h6 class="text-center">Step 2: Create a make believe ad</h6>
<h6 class="text-center">step 3: Browse the site</h6>



<c:forEach var="ad" items="${ads}">
    <div class="col-md-6">
        <c:out value="${ads.title}"/>

        <c:out value="${ad.description}"/>
        <h2>${ad.title}</h2>
            <%--            <p>${ad.description}</p>--%>
    </div>
</c:forEach>
<jsp:include page="/WEB-INF/partials/scripts.jsp" />
</body>
</html>


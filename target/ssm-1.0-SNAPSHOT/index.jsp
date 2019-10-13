<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/meeting.do">点击查看会议信息</a>
    <h1>${meeting.theme}</h1>
    <c:forEach items="${meeting.bossList}" var="boss">
        <li><h2>老板姓名：${boss.bossName}</h2></li>
        <li>老板管理的公司：${boss.managedCompany}</li>
        <li>老板的汽车品牌：${boss.bossCar.brand}</li>
        <li>老板的汽车颜色：${boss.bossCar.color}</li>
        <li>老板的汽车排量：${boss.bossCar.displacement}</li>
        <c:forEach items="${boss.hobbyList}" var="hobby">
            <li>老板的爱好：${hobby}</li>
        </c:forEach>
        <hr/>
    </c:forEach>
</body>
</html>

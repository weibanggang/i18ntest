<%@ taglib prefix="script" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 小邦哥
  Date: 2018/10/31
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="title"/></title>
</head>
<body>
<p><spring:message code="message" arguments="${sessionScope.asdasdsa}:${sessionScope.aa}" argumentSeparator=":"/></p>
<p><a href="/test01/zh">zh</a></p>
<p><a href="/test01/en">en</a></p>
</p><a href="/test01/session/asdasdsa/zhongdian">开始+终点</a>
<a href="/test01/session/asdasdsa/456">123+456</a>
<a href="/test01/session/aa/wwww">asdasdsa/wwww</a></p>
<table>
    <tr>
        <spring:message code="id"/>
        <spring:message code="name"/>
    </tr>
</table>
</body>
</html>

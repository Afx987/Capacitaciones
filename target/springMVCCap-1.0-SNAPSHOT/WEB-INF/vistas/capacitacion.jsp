<%--
  Created by IntelliJ IDEA.
  User: Andres
  Date: 29-01-22
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="Inicio">Inicio</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
               <%-- <li class="nav-item active">
                    <a class="nav-link disabled" href="Login">Login<span class="sr-only">(current)</span></a>
                </li>--%>
                <li class="nav-item">
                    <a class="nav-link disabled" href="Contacto">Contacto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Capacitacion">Capacitaciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled">Proximamente</a>
                </li>
            </ul>
        </div>
    </nav>
</div>
<!--  Implementación de mostrar todos elementos en DB 'cosas' -->
<table id="tabla1" class="display"
       style="text-align: center; width: 100%">

    <thead>
    <tr>
        <th>ID Cap</th>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Empresa</th>
        <th>Direccion</th>
        <th>Ciudad</th>
        <th>Mail</th>
        <th>Telefono</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="c" items="${contactos}">
        <tr>
            <td><c:out value="${c.getIdContacto()}"></c:out></td>
            <td><c:out value="${c.getNombres()}"></c:out></td>
            <td><c:out value="${c.getApellidos()}"></c:out></td>
            <td><c:out value="${c.getEmpresa()}"></c:out></td>
            <td><c:out value="${c.getDireccion()}"></c:out></td>
            <td><c:out value="${c.getCiudad()}"></c:out></td>
            <td><c:out value="${c.getMail()}"></c:out></td>
            <td><c:out value="${c.getTelefono()}"></c:out></td>
            <td><a href="Actualizar?id=${c.getIdContacto()}"><button class="btn btn-primary" type="submit">
                Actualizar</button></a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>



<body>


<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
</body>
</html>

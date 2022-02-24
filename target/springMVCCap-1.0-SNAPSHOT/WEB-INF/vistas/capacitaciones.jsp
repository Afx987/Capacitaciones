<%--
  Created by IntelliJ IDEA.
  User: Andres
  Date: 08-02-22
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Listado de Capacitaciones</title>
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
                <li class="nav-item active">
                    <a class="nav-link" href="Login">Login<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Contacto">Contacto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="crearCapacitacion">Crear capacitaciones</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="mostrarCapacitacion">Capacitaciones en curso</a>
                </li>
            </ul>
        </div>
    </nav>
    <body>
    <section>
        <h2>Listado de Capacitaciones</h2>
        <table class="table">
            <thead class="table-info">
            <tr>
                <th>ID Capacitación</th>
                <th>Rut del Cliente</th>
                <th>Fecha</th>
                <th>Horario</th>
                <th>Dirección</th>
                <th>Duración</th>
                <th>Cantidad de Asistentes</th>
                <th>Opciones</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="c" items="${capacitaciones}">
                <tr>
                    <td><c:out value="${c.getIdCapacitacion()}"></c:out></td>
                    <td><c:out value="${c.getRutCliente()}"></c:out></td>
                    <td><c:out value="${c.getDia()}"></c:out></td>
                    <td><c:out value="${c.getHora()}"></c:out></td>
                    <td><c:out value="${c.getLugar()}"></c:out></td>
                    <td><c:out value="${c.getDuracion()}"></c:out></td>
                    <td><c:out value="${c.getCantidadAsistentes()}"></c:out></td>
                    <td>
                        <div class="row g-3">
                            <form class="col-md-4" action="ModificarCapacitacion" method="post">
                                <button class="btn" value="${c.getIdCapacitacion()}">Modificar</button>
                            </form>
                            <form class="col-md-4" action="ModificarCapacitacion" method="get">
                                <button class="btn" value="${c.getIdCapacitacion()}">Borrar</button>
                            </form>
                        </div>
                    </td>
                </tr>

            </c:forEach>
            </tbody>

        </table>

    </section>



    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    </body>
</div>
</html>

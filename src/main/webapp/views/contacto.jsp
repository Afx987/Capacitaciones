<%--
  Created by IntelliJ IDEA.
  User: valeria
  Date: 29-01-22
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="refresh" content="0/url=${pageContext.request.contextPath}/Contacto">
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
                <li class="nav-item active">
                    <a class="nav-link disabled" >Login<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Contacto">Contacto</a>
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

    <body>
        <form action="Contacto" method="post">
            <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputEmail4">Nombres</label>
            <input type="text" name="nombres" class="form-control" id="inputEmail4">
        </div>
        <div class="form-group col-md-6">
            <label for="inputPassword4">Apellidos</label>
            <input type="text" name="apellidos" class="form-control" id="inputPassword4">
        </div>
            </div>
    <div class="form-group">
        <label for="inputAddress">Empresa u Organización</label>
        <input type="text" name="empresa" class="form-control" id="inputAddress" placeholder="Ingrese Razón Social">
    </div>
    <div class="form-group">
        <label for="inputAddress2">Dirección</label>
        <input type="text" name="direccion" class="form-control" id="inputAddress2" placeholder="Ingrese Dirección">
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="inputCity">Ciudad</label>
            <input type="text" name="ciudad" class="form-control" id="inputCity">
        </div>
        <div class="form-group col-md-4">
            <label for="inputZip">Email</label>
            <input type="email" name="mail" class="form-control" id="inputZip">
        </div>
        <div class="form-group col-md-2">
            <label for="inputZip">Telefono</label>
            <input type="text" name="telefono" class="form-control" id="fono">
        </div>
    </div>
    <div class="form-group">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck">
            <label class="form-check-label" for="gridCheck">
                Acepto términos y condiciones
            </label>
        </div>
    </div>
    <button type="submit" class="btn btn-primary" href="Contacto">Quiero que me contacten!</button>
        </form>


<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
</body>
</div>
</html>

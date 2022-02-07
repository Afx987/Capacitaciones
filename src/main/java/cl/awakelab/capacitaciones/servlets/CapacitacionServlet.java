package cl.awakelab.capacitaciones.servlets;

import cl.awakelab.capacitaciones.models.Contacto;
import cl.awakelab.capacitaciones.models.DAO.ContactoDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CapacitacionServlet", value = "/Capacitacion")
public class CapacitacionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contacto> contacto = new ContactoDAOImpl().readAll();
        System.out.println("contacto = " + contacto);
        request.setAttribute("contacto", contacto);
        request.getRequestDispatcher("views/contacto.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package cl.awakelab.capacitaciones.servlets;

import cl.awakelab.capacitaciones.models.Contacto;
import cl.awakelab.capacitaciones.models.DAO.ContactoDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContactoServlet", value = "/Contacto")
public class ContactoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String empresa = request.getParameter("empresa");
        String direccion = request.getParameter("direccion");
        String ciudad = request.getParameter("ciudad");
        String mail = request.getParameter("mail");
        String telefono = request.getParameter("telefono");

        Contacto contacto = new Contacto();
        contacto.setNombres(nombres);
        contacto.setApellidos(apellidos);
        contacto.setEmpresa(empresa);
        contacto.setDireccion(direccion);
        contacto.setCiudad(ciudad);
        contacto.setMail(mail);
        contacto.setTelefono(telefono);

        ContactoDAOImpl contactoDAO = new ContactoDAOImpl();
        contactoDAO.create(contacto);

        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }
}

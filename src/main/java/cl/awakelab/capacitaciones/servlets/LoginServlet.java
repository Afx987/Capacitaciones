package cl.awakelab.capacitaciones.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");



        if(usuario.equalsIgnoreCase("admin") && clave.equals("1234")){
            HttpSession session = request.getSession(true);
            session.setAttribute("usuario", usuario);
            session.setAttribute("clave", clave);
            request.getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
        }else{
            request.getServletContext().getRequestDispatcher("/views/inicio.jsp").forward(request, response);


        }
    }
}

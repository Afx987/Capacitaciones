package cl.awakelab.controller;

import cl.awakelab.model.entity.Contacto;
import cl.awakelab.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContactoController {

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */

    @Autowired
    private ContactoService cs;

    @RequestMapping(path = "/Contacto", method = RequestMethod.GET)
    public ModelAndView mostrarContactos() {
        List<Contacto> contactos = cs.getAll();
        return new ModelAndView("capacitacion", "contactos", contactos);

    }

}

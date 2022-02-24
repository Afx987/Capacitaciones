package cl.awakelab.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class InicioController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView mostrarInicio() {
        return new ModelAndView("inicio");
    }

    @RequestMapping(path = "/accesoDenegado")
    public ModelAndView errorAcceso(){
        return new ModelAndView("accesoDenegado", "error", "true");
    }

    @RequestMapping(path = "/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @RequestMapping(path = "/error")
    public ModelAndView errorLogin(){
        return new ModelAndView("login", "error", "true");
    }

    @RequestMapping(path = "/logout")
    public ModelAndView logout(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            SecurityContextHolder.getContext().setAuthentication(null);
        }
        return new ModelAndView("login");
    }

}

package cl.awakelab.controller;

import cl.awakelab.model.entity.Capacitacion;
import cl.awakelab.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
public class CapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    //Crear
    @PostMapping(value="/crearCapacitacion")
    public Capacitacion crearCapacitacion(Capacitacion capacitacion){
        capacitacionService.createCapacitacion(capacitacion);
        return capacitacion;
    }

    //Listar todos
    @RequestMapping(value = "/capacitaciones", method = RequestMethod.GET)
    public ModelAndView listarTodas(){
        List<Capacitacion> capacitaciones = capacitacionService.getAll();
        return new ModelAndView("capacitaciones", "capacitaciones", capacitaciones);
    }

    //Listar por lugar
    @RequestMapping(value = "/lugar", method = RequestMethod.GET)
    public ModelAndView listarLugar(String lugar){
        List<Capacitacion> capacitacionesLugar = capacitacionService.getByLugar(lugar);
        return new ModelAndView("capacitacionesLugar", "capacitacionesLugar", capacitacionesLugar);
    }

    @GetMapping("/capacitacion")
    public Capacitacion leerCapacitacion(Map<Long, Object> map){
        Capacitacion capacitacion = new Capacitacion();
        map.put(capacitacion.getIdCapacitacion(), capacitacion);
        return capacitacion;
    }

    //actualizar
    @RequestMapping("/editar")
    public ModelAndView editarCapacitacion(@RequestParam Long idCapacitacion){
        ModelAndView vista = new ModelAndView("capacitacionEdit");
        Capacitacion capacitacion = capacitacionService.getOne(idCapacitacion);
        vista.addObject("capacitacion", capacitacion);
        return vista;
    }

    //borrar
    @RequestMapping(value = "/borrar/{idCapacitacion}", method = RequestMethod.DELETE)
    public String borrarCapacitacion(@PathVariable Long idCapacitacion){
        capacitacionService.delete(idCapacitacion);
        return "Eliminado correctamente";
    }
}

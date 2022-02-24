package cl.awakelab.service;

import cl.awakelab.model.entity.Capacitacion;
import cl.awakelab.model.repository.ICapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CapacitacionService  {


    @Autowired
    private ICapacitacionRepository capacitacionRepository;

    public CapacitacionService(){
    }

    public Capacitacion createCapacitacion(Capacitacion capacitacion){
        return capacitacionRepository.save(capacitacion);
    }

    public List<Capacitacion> getAll(){
        return capacitacionRepository.findAll();
    }

    public Capacitacion getOne(Long idCapacitacion){
        return capacitacionRepository.getOne(idCapacitacion);
    }

    public List<Capacitacion> getByLugar(String lugar){
        return capacitacionRepository.getByLugar(lugar);
    }

    public void update(Capacitacion capacitacionModificada){
        capacitacionRepository.save(capacitacionModificada);
    }

    public void delete(Long idCapacitacion){
        capacitacionRepository.deleteById(idCapacitacion);
    }



}

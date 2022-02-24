package cl.awakelab.model.DAO;

import cl.awakelab.model.entity.Capacitacion;

import java.util.List;

public interface ICapacitacionDAO {
    void createCapacitacion(Capacitacion capacitacion);
    List<Capacitacion> readCapacitaciones();
    Capacitacion readOne(Long idCapacitacion);
    void update(Capacitacion capacitacion);
    void delete(Long idCapacitacion);
}

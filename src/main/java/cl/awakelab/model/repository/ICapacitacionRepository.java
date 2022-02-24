package cl.awakelab.model.repository;

import cl.awakelab.model.entity.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICapacitacionRepository extends JpaRepository<Capacitacion, Long> {

    List<Capacitacion> getByLugar(String lugar);
}

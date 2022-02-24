package cl.awakelab.model.repository;

import cl.awakelab.model.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepository extends JpaRepository<Contacto, Long> {
}

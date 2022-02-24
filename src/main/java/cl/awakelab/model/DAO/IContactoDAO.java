package cl.awakelab.model.DAO;

import cl.awakelab.model.entity.Contacto;

import java.util.List;

public interface IContactoDAO {

    public void create(Contacto contacto);

    List<Contacto> readAll();

    Contacto readOne(Long idContacto);

    public void update(Contacto contacto);

    public void delete(Long idContacto);
}

package cl.awakelab.capacitaciones.models.DAO;

import cl.awakelab.capacitaciones.models.Contacto;

import java.util.ArrayList;

public interface IContactoDAO {

    void create(Contacto contacto);

    ArrayList<Contacto> readAll();

    Contacto readOne(Long idContacto);

    void update(Contacto contacto);

    void delete(Long idContacto);
}

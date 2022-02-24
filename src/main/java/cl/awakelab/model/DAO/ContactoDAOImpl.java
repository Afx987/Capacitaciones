package cl.awakelab.model.DAO;


import cl.awakelab.model.entity.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContactoDAOImpl implements IContactoDAO{

    @Autowired
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }

    @Override
    public void create(Contacto contacto) {
            String sql = "insert into contacto (nombres, apellidos, empresa, direccion, ciudad, mail, telefono) values (?, ? ,? ,? ,? ,?)";
            template.update(sql, new Object[] {contacto.getNombres(), contacto.getApellidos(), contacto.getEmpresa(), contacto.getDireccion(), contacto.getCiudad(),
                                    contacto.getCiudad(), contacto.getMail(), contacto.getTelefono()});
    }

    @Override
    public List<Contacto> readAll() {
        String sql = "select idContacto , nombres, apellidos , empresa , direccion , ciudad , mail, telefono from contacto";
        return template.query(sql, new ContactoRowMapper());
    }

    @Override
    public Contacto readOne(Long idContacto) {
        String sql = "select idContacto , nombres, apellidos , empresa , direccion , ciudad , mail, telefono from contacto where idContacto = ?";
        return template.queryForObject(sql ,new Object[] {idContacto}, new ContactoRowMapper() );
    }

    @Override
    public void update(Contacto contacto) {
        String sql = "update contacto set nombres = ? , apellidos = ? , empresa = ? , direccion = ? , ciudad = ? , mail = ? , telefono = ? where idContacto = ?";
        template.update(sql, new Object[] {contacto.getNombres() , contacto.getApellidos(), contacto.getEmpresa(), contacto.getDireccion(), contacto.getCiudad(), contacto.getMail(),
                        contacto.getTelefono(), contacto.getIdContacto()});
    }

    @Override
    public void delete(Long idContacto) {
        String sql = "delete from contacto where idContacto = ?";
        template.update(sql , new Object[]{idContacto});
    }

    class ContactoRowMapper implements RowMapper<Contacto>{
        public Contacto mapRow(ResultSet rs, int rowNum) throws SQLException{
            return new Contacto(rs.getLong("idContacto"),rs.getString("nombres"), rs.getString("apellidos"),
                    rs.getString("empresa"), rs.getString("direccion"), rs.getString("ciudad"), rs.getString("mail"),
                    rs.getString("telefono"));
        }
    }
}

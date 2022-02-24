package cl.awakelab.model.DAO;

import cl.awakelab.model.entity.Capacitacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CapacitacionDAOImpl implements ICapacitacionDAO {

    @Autowired
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }

    @Override
    public void createCapacitacion(Capacitacion capacitacion) {
        String sql = "insert into capacitacion (rutCliente, dia, hora, lugar, duracion, cantidadAsistentes) values (?, ?, ?, ?, ?, ?)";
        template.update(sql, new Object[] {capacitacion.getRutCliente(), capacitacion.getDia(), capacitacion.getHora(), capacitacion.getLugar(),
                capacitacion.getDuracion(), capacitacion.getCantidadAsistentes()});
    }

    @Override
    public List<Capacitacion> readCapacitaciones() {

        String sql = "select idCapacitacion, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes from capacitacion";

        return template.query(sql, new CapacitacionRowMapper());
    }

    @Override
    public Capacitacion readOne(Long idCapacitacion) {
        String sql = "select idCapacitacion, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes from capacitacion where idCapacitacion = ? ";
        return template.queryForObject(sql, new Object[] {idCapacitacion}, new CapacitacionRowMapper());
    }

    @Override
    public void update(Capacitacion capacitacion) {

        String sql = "update capacitacion set rutCliente = ?, dia = ?, hora = ?, lugar = ?, duracion = ?, cantidadAsistentes = ? where idCapacitacion = ?";
        template.update(sql, new Object[] {capacitacion.getRutCliente(), capacitacion.getDia(), capacitacion.getHora(), capacitacion.getLugar(),
                capacitacion.getDuracion(), capacitacion.getCantidadAsistentes(), capacitacion.getIdCapacitacion()});
    }

    @Override
    public void delete(Long idCapacitacion) {
        String sql = "delete capacitacion where idCapacitacion = ?";
        template.update(sql, new Object[] {idCapacitacion});

    }

    class CapacitacionRowMapper implements RowMapper<Capacitacion> {
        public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Capacitacion(rs.getLong("idCapacitacion"), rs.getString("rutCliente"), rs.getString("dia"),
                    rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"), rs.getInt("cantidadAsistentes"));
        }
    }
}

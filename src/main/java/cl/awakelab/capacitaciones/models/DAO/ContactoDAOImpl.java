package cl.awakelab.capacitaciones.models.DAO;

import cl.awakelab.capacitaciones.models.Conexion;
import cl.awakelab.capacitaciones.models.Contacto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContactoDAOImpl implements IContactoDAO{

    private Connection conn = null;

    @Override
    public void create(Contacto contacto) {
        String sql = "insert into contacto (nombres, apellidos, empresa, direccion, ciudad, mail, telefono) values ('"
                + contacto.getNombres() + "', '" + contacto.getApellidos() + "', '" + contacto.getEmpresa()
                + "', '" + contacto.getDireccion() + "', '" + contacto.getCiudad() + "', '" + contacto.getMail() + "', '" + contacto.getTelefono() + "')";

        try{
            conn = Conexion.getConn();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Contacto> readAll() {
        String sql = "SELECT idContacto ,nombres, apellidos, empresa, direccion, ciudad, mail, telefono FROM contacto";
        ArrayList<Contacto> contacto = new ArrayList<Contacto>();

        try {
            conn = Conexion.getConn();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                contacto.add(new Contacto(rs.getLong("idContacto"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("empresa"),
                        rs.getString("direccion"), rs.getString("ciudad"),
                        rs.getString("mail"), rs.getString("telefono")));
            }
            rs.close();
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return contacto;
    }

    @Override
    public Contacto readOne(Long idContacto) {
        String sql = "SELECT idContacto, nombres, apellidos, empresa, direccion, ciudad, mail, telefono FROM contacto "
                + "WHERE idContacto = " + idContacto;

        Contacto contacto = null;

        try {
            conn = Conexion.getConn();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
                contacto = new Contacto(rs.getLong("idContacto"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("empresa"),
                        rs.getString("direccion"), rs.getString("ciudad"),
                        rs.getString("mail"), rs.getString("telefono"));
            }
            rs.close();
            stm.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return contacto;
    }

    @Override
    public void update(Contacto contacto) {

        String sql = "UPDATE contacto SET nombres = '"  +
                contacto.getNombres() + "', apellidos = '" + contacto.getApellidos() + "', empresa = '" +
                contacto.getEmpresa() + "', direccion = '" + contacto.getDireccion() + "', ciudad = '" +
                contacto.getCiudad() + "',  mail = '" + contacto.getMail() + "', telefono '" +
                contacto.getTelefono() + "',WHERE idContacto = " + contacto.getIdContacto();
        try {
            conn = Conexion.getConn();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void delete(Long idContacto) {

        String sql = "DELETE from contacto WHERE idContacto = " + idContacto;

        try {
            conn = Conexion.getConn();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

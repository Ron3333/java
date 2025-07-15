package crud_login;



import crud_login.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static crud_login.Conexion.getConexion;

public class UsuarioDAO implements IUsuarioDAO {
    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        var sql = "SELECT id, nombre, apellido, usuario, password, rol FROM usuario ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return usuarios;
    }

    @Override
    public boolean buscarUsuarioPorId(Usuario usuario) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql = "SELECT * FROM usuario WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setRol(rs.getString("rol"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar usuario por ID: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean buscarUsuarioPorCredenciales(String usuario, String password) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error al buscar usuario por credenciales: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarUsuario(Usuario usuario) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO usuario(nombre, apellido, usuario, password, rol) VALUES(?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getPassword());
            ps.setString(5, usuario.getRol());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarUsuario(Usuario usuario) {
        PreparedStatement ps;
        Connection con = getConexion();
        var sql = "UPDATE usuario SET nombre=?, apellido=?, usuario=?, password=?, rol=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getPassword());
            ps.setString(5, usuario.getRol());
            ps.setInt(6, usuario.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar usuario: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarUsuario(Usuario usuario) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM usuario WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return false;
    }
}
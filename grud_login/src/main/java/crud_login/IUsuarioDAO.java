package crud_login;

import crud_login.Usuario;
import java.util.List;

public interface IUsuarioDAO {
    List<Usuario> listarUsuarios();
    boolean buscarUsuarioPorId(Usuario usuario);
    boolean buscarUsuarioPorCredenciales(String usuario, String password);
    boolean agregarUsuario(Usuario usuario);
    boolean modificarUsuario(Usuario usuario);
    boolean eliminarUsuario(Usuario usuario);
}
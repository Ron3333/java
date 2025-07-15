package crud_login;


import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String rol;

    public Usuario() {}

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nombre, String apellido, String usuario, String password, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(int id, String nombre, String apellido, String usuario, String password, String rol) {
        this(nombre, apellido, usuario, password, rol);
        this.id = id;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", usuario='" + usuario + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return id == usuario1.id &&
                Objects.equals(nombre, usuario1.nombre) &&
                Objects.equals(apellido, usuario1.apellido) &&
                Objects.equals(usuario, usuario1.usuario) &&
                Objects.equals(password, usuario1.password) &&
                Objects.equals(rol, usuario1.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, usuario, password, rol);
    }
}

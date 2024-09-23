package Modelo;

public class usuarios {
    
    int idUser;
    String nombre;
    String apellido;
    String usuario;
    int password;
    int tipo_usu;

    public usuarios(int idUser, String nombre, String apellido, String usuario, int password, int tipo_usu) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.tipo_usu = tipo_usu;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getTipo_usu() {
        return tipo_usu;
    }

    public void setTipo_usu(int tipo_usu) {
        this.tipo_usu = tipo_usu;
    }
}



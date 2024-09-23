package Modelo;

public class administrador {
    
    int id_admin;
    String nombres;
    String apellidos;
    String correo;
    int password;
    int tipo_admin;

    public administrador(int id_admin, String nombres, String apellidos, String correo, int password, int tipo_admin) {
        this.id_admin = id_admin;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
        this.tipo_admin = tipo_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getTipo_admin() {
        return tipo_admin;
    }

    public void setTipo_admin(int tipo_admin) {
        this.tipo_admin = tipo_admin;
    }
}

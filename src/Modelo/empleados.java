package Modelo;

public class empleados {
    
    int id_empleados;
    String nombres;
    String apellidos;
    int rut;
    int id_area;
    int id_cargo;
    int telefono;
    String correo;
    String password;
    int tipo_empleados;

    public empleados(int id_empleados, String nombres, String apellidos, int rut, int id_area, int id_cargo, int telefono, String correo, String password, int tipo_empleados) {
        this.id_empleados = id_empleados;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.id_area = id_area;
        this.id_cargo = id_cargo;
        this.telefono = telefono;
        this.correo = correo;
        this.password = password;
        this.tipo_empleados = tipo_empleados;
    }

    public int getId_empleados() {
        return id_empleados;
    }

    public void setId_empleados(int id_empleados) {
        this.id_empleados = id_empleados;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo_empleados() {
        return tipo_empleados;
    }

    public void setTipo_empleados(int tipo_empleados) {
        this.tipo_empleados = tipo_empleados;
    }
}

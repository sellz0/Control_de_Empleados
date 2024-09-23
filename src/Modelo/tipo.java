package Modelo;

public class tipo {
    
    int id_tipo;
    int tipo_admin;
    int tipo_empleados;
    int tipo_usu;

    public tipo(int id_tipo, int tipo_admin, int tipo_empleados, int tipo_usu) {
        this.id_tipo = id_tipo;
        this.tipo_admin = tipo_admin;
        this.tipo_empleados = tipo_empleados;
        this.tipo_usu = tipo_usu;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getTipo_admin() {
        return tipo_admin;
    }

    public void setTipo_admin(int tipo_admin) {
        this.tipo_admin = tipo_admin;
    }

    public int getTipo_empleados() {
        return tipo_empleados;
    }

    public void setTipo_empleados(int tipo_empleados) {
        this.tipo_empleados = tipo_empleados;
    }

    public int getTipo_usu() {
        return tipo_usu;
    }

    public void setTipo_usu(int tipo_usu) {
        this.tipo_usu = tipo_usu;
    }
}

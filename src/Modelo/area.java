package Modelo;

public class area {
    
    int id_area;
    String nombre_area;

    public area(int id_area, String nombre_area) {
        this.id_area = id_area;
        this.nombre_area = nombre_area;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }
}

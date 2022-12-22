package Logica;

public class Alumno {
    //Atributos
    int id;
    String nombre;
    String apellido;

    //Constructor
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter and Setter


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

    //Metodos
    public void mostrarNombre(){
        System.out.println("Nombre");
    }

    public void saberAprobado(Double calificacion){
        if(calificacion >=6){
            System.out.println("Aprobo la materia");
        }
        else{
            System.out.println("No aprobo");
        }

    }
}

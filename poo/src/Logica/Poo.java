package Logica;

public class Poo {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Jonatan", "Tarriba");

        System.out.println("---------------Datos alumno 1-------------");
        alu1.setId(4);
        alu1.setNombre("Bryan");
        alu1.setApellido("Tarriba");

        System.out.println("Id alumno 2 : " + alu1.getId());
        System.out.println("Nombre alumno: " + alu1.getNombre());
        System.out.println("Apellido alumno: " + alu1.getApellido());

        System.out.println("---------------Datos alumno 2-------------");
        System.out.println("Id alumno 2 : " + alu2.getId());
        System.out.println("Nombre alumno: " + alu2.getNombre());
        System.out.println("Apellido alumno: " + alu2.getApellido());
    }
}

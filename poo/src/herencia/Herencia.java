package herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado emple = new Empleado();

        emple.getNum_legajo();
        emple.getNombre();

        Consultor consult = new Consultor();
        consult.getNum_consultor();
        consult.getNombre_consultor();
    }
}

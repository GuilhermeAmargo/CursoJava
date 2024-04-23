public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(0,1.40);
        Paciente p2 = new Paciente(60, 1.50);
        p1.calcularIMC();
        p1.diagnostico();
        System.out.println("IMC: "+p1.calcularIMC());
        System.out.println("Diagnóstico: " + p1.diagnostico());

    }
}
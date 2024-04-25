public class Main {
    public static void main(String[] args) {

        Paciente p1 = new Paciente(80,1.40);
        Paciente p2 = new Paciente(60, 1.50);
        Paciente p3 = new Paciente(75, 1.80);

        System.out.println("IMC (Paciente 1) : "+p1.calcularIMC());
        System.out.println("Diagnóstico (Paciente 1) : " + p1.diagnostico());
        System.out.println("IMC (Paciente 2) : "+p2.calcularIMC());
        System.out.println("Diagnóstico (Paciente 2) : " + p2.diagnostico());
        System.out.println("IMC (Paciente 3) : "+p3.calcularIMC());
        System.out.println("Diagnóstico (Paciente 3) : " + p3.diagnostico());

    }
}
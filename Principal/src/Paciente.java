public class Paciente {
    private double peso;
    private double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    double calcularIMC(){
        double imc;
        imc = peso / (altura * altura);
        return imc;
    }

    String  diagnostico(){
        double imc = calcularIMC();
        String diag = "";

        if(imc < 16){
            diag = "Baixo peso muito grave";
        }

        if (imc >= 16 && imc <= 16.99){
            diag = "Baixo peso grave";
        }

        if (imc >= 17 && imc <= 18.49){
            diag = "Baixo peso";
        }

        if (imc >= 18.50 && imc <= 24.99){
            diag = "Peso normal";
        }

        if (imc >= 25 && imc <= 29.99){
            diag = "Sobrepeso";
        }

        if (imc >= 30 && imc <= 34.99){
            diag = "Obesidade grau I";
        }

        if (imc >= 35 && imc <= 39.99){
            diag = "Obesidade grau II";
        }

        if (imc >= 40){
            diag = "Obesidade grau III (obesidade mórbida)";
        }
        return diag;
    }
}
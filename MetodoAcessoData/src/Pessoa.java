import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private LocalDate dataDeNascimento;

    public Pessoa(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataDeNascimento, hoje).getYears();
    }

    public String getSigno() {
        int dia = dataDeNascimento.getDayOfMonth();
        int mes = dataDeNascimento.getMonthValue();
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        }
        return "Signo desconhecido";
    }
}

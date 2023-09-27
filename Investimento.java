import java.time.LocalDate;

public class Investimento{
    private double valor;
    private LocalDate data;

    public Investimento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }
}

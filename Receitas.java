import java.time.LocalDate;

public class Receitas {
    private double valor;
    private LocalDate data;
    private String descricao;
    private String categoria;

    public Receitas(double valor, LocalDate data, String descricao, String categoria) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }
}

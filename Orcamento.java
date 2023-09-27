import java.time.LocalDate;

public class Orcamento {
    private double valor;
    private LocalDate data;
    private String descricao;

    public Orcamento(double valor, LocalDate data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

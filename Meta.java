import java.time.LocalDate;

public class Meta {
    private String valor;
    private LocalDate data;
    private String descricao;

    public Meta(String valor, LocalDate data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }
}

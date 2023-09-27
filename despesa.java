import java.time.LocalDate;

public class despesa{
    private String valor;
    private String descricao;
    private String categoria;
    private LocalDate data;

    public despesa(String valor, String descricao, String categoria,LocalDate data){
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
    public String getvalor(){
        return valor;
    }
    public String getdescricao(){
        return descricao;
    }
    public String getCategoria(){
        return categoria;
    }
    public LocalDate getDate(){
        return data;
    }
}
public class conta{
    private String banco;
    private String descricao;

    public conta(String banco, String descricao) {
        this.banco = banco;
        this.descricao = descricao;
    }

    public String getBanco(){
        return banco;
    }

    public String getDescricao(){
        return descricao;
    }
    
}
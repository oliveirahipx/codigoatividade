public class Caso {
    private String descricao;
    private Advogados advogado;
    private Cliente cliente;
    private String status; // Ex: "Em andamento", "Concluído", "Cancelado"
    private String dataInicio;
    private String dataFim;

    public Caso(String descricao, Advogados advogado, Cliente cliente, String status, String dataInicio) {
        this.descricao = descricao;
        this.advogado = advogado;
        this.cliente = cliente;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = null; // Inicialmente, não temos data de fim
    }

    // Getters
    public String getDescricao() { return descricao; }
    public Advogados getAdvogado() { return advogado; }
    public Cliente getCliente() { return cliente; }
    public String getStatus() { return status; }
    public String getDataInicio() { return dataInicio; }
    public String getDataFim() { return dataFim; }

    public void setDataFim(String dataFim) { this.dataFim = dataFim; }
    public void setStatus(String status) { this.status = status; }
}

import java.time.LocalDate;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Construtor garantindo que o valor atribuído seja nome, preço de custo, preço de venda, data de fabricação e data de validade.
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    /*
        Sobrecarga do construtor Produto, garantindo os atributos de valores nome, preço de custo, preço de venda e
        data de fabricação. A data de validade é gerada automaticamente como 1 mês após a data de fabricação.
    */
    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1);
    }

    /*
     Sobrecarga do construtor Produto, garantindo os atributos de valores nome, preço de custo.
      A data de validade é gerada automaticamente como 1 mês após a data de fabricação e o preço de venda é 10% a mais que o preço de custo
 */
    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto + (precoCusto * 10)/100;
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plusMonths(1);
    }

    // Método para exibir informações do produto
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", dataFabricacao=" + dataFabricacao +
                ", dataValidade=" + dataValidade +
                '}';
    }
}

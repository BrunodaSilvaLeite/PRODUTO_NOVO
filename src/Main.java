import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando produto com atributos fornecidos
        Produto produtoCompleto = new Produto(
                "Leite",
                6,
                8,
                LocalDate.of(2024, 9, 1),
                LocalDate.of(2024, 10, 1)
        );
        System.out.println("Produto Completo: " + produtoCompleto);

        //Criando um produto com data de validade automática 1 mês após a data de fabricação
        Produto produtoComValidadeAutomatica = new Produto(
                "Italac leite condensado",
                4,
                6,
                LocalDate.of(2024, 9, 10)
        );
        System.out.println("Produto com Validade Automática: " + produtoComValidadeAutomatica);

        // Criando um produto com preço de venda 10% maior que o preço de custo e validade automática
        Produto produtoComPrecoCalculado = new Produto(
                "M&ms",
                34
        );
        System.out.println("Produto com Preço Calculado: " + produtoComPrecoCalculado);
    }
}

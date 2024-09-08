public class Servico {

    private int codigo;
    private String descricao;
    private double precoHora;
    private int qtdeHora;

    public Servico(
        int codigo,
        String descricao,
        double precoHora,
        int qtdeHora
    ) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.qtdeHora = qtdeHora;
    }

    public double calcularValor() {
        return precoHora * qtdeHora;
    }

    @Override
    public String toString() {
        return (
            codigo +
            " " +
            descricao +
            " " +
            String.format("%.2f", precoHora) +
            " " +
            qtdeHora +
            " " +
            String.format("%.2f", calcularValor())
        );
    }
}

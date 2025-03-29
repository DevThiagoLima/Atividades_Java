package Notas_de_Aula_02;

public class Produto {

    String nome, cor;
    int codigo, quantidadeEstoque, quantidadeCompra;
    double tamanho, peso, valor;

    double valorPagar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }


    public void realizarVendaAVista() {
        valorPagar = (valor * quantidadeCompra) * 0.95;

        System.out.println("Você Recebeu Um Desconto de 5%, Portanto, Irá Pagar: R$ " + valorPagar);
    }

    public void realizarVendaNoCredito() {
        valorPagar = (valor * quantidadeCompra);

        System.out.println("Você Irá Pagar: R$ " + valorPagar);
    }
}

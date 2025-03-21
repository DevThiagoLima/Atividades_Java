package Q3;

public class Produto {

    String nome;

    double preco;

    int quantidade;

    int quantCompra;
    double precoVenda;

    public int adicionarEstoque() {

        return quantidade ++;
    }

    public double venderProduto() {
        quantidade -= quantCompra;
        return precoVenda = quantCompra * preco;
    }

    public void mostrarPreco() {
        System.out.println("Cada unidade está custando: R$ " + preco);
    }

    public void mostrarEstoque() {
        System.out.println(quantidade + " Unidades");
    }
}

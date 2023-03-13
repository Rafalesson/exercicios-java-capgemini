public class Carro {
    // atributos
    private String modelo;
    private int ano;
    private float preco;

    // contrutor
    public Carro(String modelo, int ano, float preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

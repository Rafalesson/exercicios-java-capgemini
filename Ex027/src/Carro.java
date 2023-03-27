import java.security.PublicKey;

public class Carro {
    private String modelo;
    private float preco;
    private String combustivel;

    public Carro(String modelo, float preco, String combustivel) {
        this.modelo = modelo;
        this.preco = preco;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setCosbustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

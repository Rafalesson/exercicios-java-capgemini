public class Pessoa {
    // atributos
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    // contrutor
    public Pessoa(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }
    
    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        if (sexo != 'm' || sexo != 'M' || sexo != 'f' || sexo != 'F') {
            this.sexo = 'O';
        }
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Você digitou: " + idade + " anos de idade. \n Não é uma idade válida.");
        }
        this.idade = idade;
    }

    public boolean getSaude() {
        return this.saude;
    }

    public void setSaude(boolean saude) {
        if (saude != true) {
            this.saude = false;
        }
        this.saude = saude;
    }
}

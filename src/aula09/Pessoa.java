package aula09;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Methods
    public void fazerAniver(){
        this.idade++; //this.idade = this.idade + 1
    }
    //Constructor Methods
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Getter and Setter Methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}

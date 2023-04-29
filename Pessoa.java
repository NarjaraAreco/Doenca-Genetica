
public class Pessoa{

    private String nome;
    private String dna;
    private int id;

    void setNome(String nome){
        this.nome = nome;
    }

    void setDna(String dna){
        this.dna = dna;
    }

    void setId(int id){
        this.id = id;
    }

    String getNome(){
        return this.nome;
    }

    String getDna(){
        return this.dna;
    }

    int getId(){
        return this.id;
    }

}
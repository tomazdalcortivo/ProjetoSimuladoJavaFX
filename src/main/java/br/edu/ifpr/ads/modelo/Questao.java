package br.edu.ifpr.ads.modelo;

import br.edu.ifpr.ads.modelo.Alternativa;
import br.edu.ifpr.ads.modelo.Disciplina;

public class Questao {
    
    private int id;
    private int numero;
    private Disciplina disciplina;
    private String textoIntrodutorio;
    private String enunciado;
    private String figura;
    private Alternativa alternativas[];
    private int somaGabarito;

    public Questao() {
        id = 0;
        numero = 0;
        disciplina = new Disciplina();
        textoIntrodutorio = "";
        enunciado = "";
        figura = "";
        alternativas = new Alternativa[4];
        somaGabarito = 0;
    }

    public Questao(int id, int numero, Disciplina disciplina, String textoIntrodutorio, String enunciado, String figura, Alternativa[] alternativas, int somaGabarito) {
        this.id = id;
        this.numero = numero;
        this.disciplina = disciplina;
        this.textoIntrodutorio = textoIntrodutorio;
        this.enunciado = enunciado;
        this.figura = figura;
        this.alternativas = alternativas;
        this.somaGabarito = somaGabarito;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTextoIntrodutorio() {
        return textoIntrodutorio;
    }

    public void setTextoIntrodutorio(String textoIntrodutorio) {
        this.textoIntrodutorio = textoIntrodutorio;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public Alternativa[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Alternativa[] alternativas) {
        this.alternativas = alternativas;
    }

    public int getSomaGabarito() {
        return somaGabarito;
    }

    public void setSomaGabarito(int somaGabarito) {
        this.somaGabarito = somaGabarito;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        String r = "QUESTÃO "+this.getNumero()+
                " ["+this.getDisciplina().getNome()+"]\n";
        //for (br.edu.ifpr.ads.modelo.Alternativa a: alternativas){
        //    r += a.toString()+"\n";
        //}
        return r;
    }
    
    
    
    
}

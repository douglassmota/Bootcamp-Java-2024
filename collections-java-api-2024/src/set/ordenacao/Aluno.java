package set.ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable <Aluno>{
    //atributos
    private String nome;
    private int matricula;
    private double nota;

    //constructor
    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //comparable
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + matricula;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "{ Nome: " + nome + ", matricula: " + matricula + ", nota: " + nota + "}";
    }
    

}
class ComparatorPorNota implements Comparator <Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        
        return Double.compare(a1.getNota(), a2.getNota());
    }
    
}

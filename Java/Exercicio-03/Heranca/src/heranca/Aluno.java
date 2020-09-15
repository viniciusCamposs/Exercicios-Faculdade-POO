/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Aluno extends Pessoa{
    
    private String ra, curso;
    
    public Aluno(String nome, String sobrenome, String ra, String curso){
        super(nome, sobrenome);
        
        this.ra = ra;
        this.curso = curso;
    }
    
    public Aluno(Aluno a){
        super(a);
        this.ra = a.ra;
        this.curso = a.curso;
    }

    //SETTERS
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    //GETTERS
    public String getRa() {
        return ra;
    }
    
    public String getCurso() {
        return curso;
    }

    // Métodos 
    void printDados(){
        System.out.println(
            "RA: " + ra + "\n" + 
            "Curso: " + curso );
    }
}


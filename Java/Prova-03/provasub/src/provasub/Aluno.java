/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasub;

/**
 *
 * @author Matheus Augusto Satler RA: 0040481912052
 */

public class Aluno {
    private int codigoAluno;
    private String nomeAluno;
    private double mediaFinalAluno;
    private int qtdFaltasAluno = 0;

    public Aluno(int codigoAluno, String nomeAluno) {
        this.codigoAluno = codigoAluno;
        this.nomeAluno = nomeAluno;
    }
    
    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getMediaFinalAluno() {
        return mediaFinalAluno;
    }

    public void setMediaFinalAluno(double mediaFinalAluno) {
        this.mediaFinalAluno = mediaFinalAluno;
    }

    public int getQtdFaltasAluno() {
        return qtdFaltasAluno;
    }

    public void setQtdFaltasAluno(int qtdFaltasAluno) {
        this.qtdFaltasAluno = qtdFaltasAluno;
    }
}

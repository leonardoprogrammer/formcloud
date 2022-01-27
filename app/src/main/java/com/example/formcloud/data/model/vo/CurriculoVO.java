package com.example.formcloud.data.model.vo;

import java.util.GregorianCalendar;
import java.util.List;

public class CurriculoVO {
    private String nome;
    private GregorianCalendar anoNascimento;
    private String naturalidade;
    private EnderecoVO endereco;
    private String primeiroTelefone;
    private String segundoTelefone;
    private String textoHistoricoCarreira;
    private String textoObjetivo;
    private List<ExperienciaProfissionalVO> experiencias;
    private Boolean openToWork;
    private String disponibilidade; // se opção anterior estiver ativada (integral, manhã, tarde, noite)
    private List<CursoVO> cursos;
    private List<String> softSkills;
    private List<String> hardSkills;

    public CurriculoVO() {

    }

    public CurriculoVO(String nome, GregorianCalendar anoNascimento, String naturalidade, EnderecoVO endereco,
                       String primeiroTelefone, String segundoTelefone, String textoHistoricoCarreira,
                       String textoObjetivo, List<ExperienciaProfissionalVO> experiencias, Boolean openToWork,
                       String disponibilidade, List<CursoVO> cursos, List<String> softSkills, List<String> hardSkills) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.primeiroTelefone = primeiroTelefone;
        this.segundoTelefone = segundoTelefone;
        this.textoHistoricoCarreira = textoHistoricoCarreira;
        this.textoObjetivo = textoObjetivo;
        this.experiencias = experiencias;
        this.openToWork = openToWork;
        this.disponibilidade = disponibilidade;
        this.cursos = cursos;
        this.softSkills = softSkills;
        this.hardSkills = hardSkills;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GregorianCalendar getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(GregorianCalendar anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public EnderecoVO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoVO endereco) {
        this.endereco = endereco;
    }

    public String getPrimeiroTelefone() {
        return primeiroTelefone;
    }

    public void setPrimeiroTelefone(String primeiroTelefone) {
        this.primeiroTelefone = primeiroTelefone;
    }

    public String getSegundoTelefone() {
        return segundoTelefone;
    }

    public void setSegundoTelefone(String segundoTelefone) {
        this.segundoTelefone = segundoTelefone;
    }

    public String getTextoHistoricoCarreira() {
        return textoHistoricoCarreira;
    }

    public void setTextoHistoricoCarreira(String textoHistoricoCarreira) {
        this.textoHistoricoCarreira = textoHistoricoCarreira;
    }

    public String getTextoObjetivo() {
        return textoObjetivo;
    }

    public void setTextoObjetivo(String textoObjetivo) {
        this.textoObjetivo = textoObjetivo;
    }

    public List<ExperienciaProfissionalVO> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<ExperienciaProfissionalVO> experiencias) {
        this.experiencias = experiencias;
    }

    public Boolean isOpenToWork() {
        return openToWork;
    }

    public void setOpenToWork(Boolean openToWork) {
        this.openToWork = openToWork;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<CursoVO> getCursos() {
        return cursos;
    }

    public void setCursos(List<CursoVO> cursos) {
        this.cursos = cursos;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }

    public List<String> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(List<String> hardSkills) {
        this.hardSkills = hardSkills;
    }
    // </editor-fold>
}

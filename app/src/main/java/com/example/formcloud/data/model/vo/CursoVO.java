package com.example.formcloud.data.model.vo;

public class CursoVO {
    private String titulo;
    private String instituicao;
    private String detalhamento;
    private String dataInicio;
    private String dataFim;
    private Boolean possuiCertificado;

    public CursoVO() {

    }

    public CursoVO(String titulo, String instituicao, String detalhamento, String dataInicio, String dataFim, Boolean possuiCertificado) {
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.detalhamento = detalhamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.possuiCertificado = possuiCertificado;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getDetalhamento() {
        return detalhamento;
    }

    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean isPossuiCertificado() {
        return possuiCertificado;
    }

    public void setPossuiCertificado(Boolean possuiCertificado) {
        this.possuiCertificado = possuiCertificado;
    }

    // </editor-fold>
}

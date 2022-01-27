package com.example.formcloud.data.model.vo;

import java.io.InputStream;
import java.util.GregorianCalendar;

public class CursoVO {
    private String titulo;
    private String instituicao;
    private String detalhamento;
    private GregorianCalendar dataInicio;
    private GregorianCalendar dataFim;
    private Boolean possuiCertificado;
    private byte[] certificado;

    public CursoVO() {

    }

    public CursoVO(String titulo, String instituicao, String detalhamento, GregorianCalendar dataInicio, GregorianCalendar dataFim, Boolean possuiCertificado, byte[] certificado) {
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.detalhamento = detalhamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.possuiCertificado = possuiCertificado;
        this.certificado = certificado;
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

    public GregorianCalendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(GregorianCalendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public GregorianCalendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(GregorianCalendar dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean isPossuiCertificado() {
        return possuiCertificado;
    }

    public void setPossuiCertificado(Boolean possuiCertificado) {
        this.possuiCertificado = possuiCertificado;
    }

    public byte[] getCertificado() {
        return certificado;
    }

    public void setCertificado(byte[] certificado) {
        this.certificado = certificado;
    }

    // </editor-fold>
}

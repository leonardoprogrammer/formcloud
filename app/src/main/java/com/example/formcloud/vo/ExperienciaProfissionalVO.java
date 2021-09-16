package com.example.formcloud.vo;

public class ExperienciaProfissionalVO {
    private String posicao;
    private String empresa;
    private String dataEntrada;
    private String dataSaida;
    private String detalhamentoAtividades;

    public ExperienciaProfissionalVO() {

    }

    public ExperienciaProfissionalVO(String posicao, String empresa, String dataEntrada, String dataSaida, String detalhamentoAtividades) {
        this.posicao = posicao;
        this.empresa = empresa;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.detalhamentoAtividades = detalhamentoAtividades;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDetalhamentoAtividades() {
        return detalhamentoAtividades;
    }

    public void setDetalhamentoAtividades(String detalhamentoAtividades) {
        this.detalhamentoAtividades = detalhamentoAtividades;
    }

    // </editor-fold>
}

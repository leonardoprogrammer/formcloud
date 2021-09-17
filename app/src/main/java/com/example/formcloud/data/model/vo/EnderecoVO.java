package com.example.formcloud.data.model.vo;

public class EnderecoVO {
    private String tipoLogradouro;
    private String nomeLogradouro;
    private int numeroLogradouro;
    private String bairroLogradouro;
    private String cepLogradouro;
    private String complementoLogradouro;
    private String municipio;
    private String uf;

    public EnderecoVO() {

    }

    public EnderecoVO(String tipoLogradouro, String nomeLogradouro, int numeroLogradouro,
                      String bairroLogradouro, String cepLogradouro, String complementoLogradouro,
                      String municipio, String uf) {
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numeroLogradouro = numeroLogradouro;
        this.bairroLogradouro = bairroLogradouro;
        this.cepLogradouro = cepLogradouro;
        this.complementoLogradouro = complementoLogradouro;
        this.municipio = municipio;
        this.uf = uf;
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public int getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(int numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getBairroLogradouro() {
        return bairroLogradouro;
    }

    public void setBairroLogradouro(String bairroLogradouro) {
        this.bairroLogradouro = bairroLogradouro;
    }

    public String getCepLogradouro() {
        return cepLogradouro;
    }

    public void setCepLogradouro(String cepLogradouro) {
        this.cepLogradouro = cepLogradouro;
    }

    public String getComplementoLogradouro() {
        return complementoLogradouro;
    }

    public void setComplementoLogradouro(String complementoLogradouro) {
        this.complementoLogradouro = complementoLogradouro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    // </editor-fold>
}

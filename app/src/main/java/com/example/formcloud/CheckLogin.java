package com.example.formcloud;

public class CheckLogin {
    private String messageResult;
    private Boolean sucess;

    public CheckLogin() {

    }

    public void execute(String checkUsername, String checkPassword) {
        try {
            //DADOS FAKEADOS PARA TESTE
            String loginUser = "admin";
            String loginPassword = "2019";

            if (loginUser.equals(checkUsername) && loginPassword.equals(checkPassword)) {
                setSucess(Boolean.TRUE);
                setMessageResult("Login correto");
            } else {
                setSucess(Boolean.FALSE);
                setMessageResult("Login incorreto");
            }
        } catch (Exception ex) {
            setSucess(Boolean.FALSE);
            ex.printStackTrace();
        }
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getMessageResult() {
        return messageResult;
    }

    public void setMessageResult(String messageResult) {
        this.messageResult = messageResult;
    }

    public Boolean isSucess() {
        return sucess;
    }

    public void setSucess(Boolean sucess) {
        this.sucess = sucess;
    }

    // </editor-fold>
}

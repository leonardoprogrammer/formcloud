package com.example.formcloud.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.formcloud.CheckLogin;
import com.example.formcloud.R;

public class LoginActivity extends AppCompatActivity {

    private String loginUsername;
    private String loginPassword;
    private CheckLogin checkLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        EditText txtCampoUsuario = (EditText) findViewById(R.id.txtLogin);
        EditText txtCampoSenha = (EditText) findViewById(R.id.txtPassword);

        setLoginUsername(txtCampoUsuario.getText().toString());
        setLoginPassword(txtCampoSenha.getText().toString());

        checkLogin = new CheckLogin();
        checkLogin.execute(loginUsername, loginPassword);

        if (checkLogin.isSucess()) {
            txtCampoUsuario.setText("");
            txtCampoSenha.setText("");
            openScreenPainelPrincipal(view);
        } else {
            // exibe mensagem de login incorreto
        }
    }

    public void openScreenPainelPrincipal(View view) {
        Intent intent = new Intent(this, PainelPrincipalActivity.class);
        startActivity(intent);
    }

    // <editor-fold desc="Getters e Setters" defaultstate="collapsed">

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public CheckLogin getCheckLogin() {
        return checkLogin;
    }

    public void setCheckLogin(CheckLogin checkLogin) {
        this.checkLogin = checkLogin;
    }

    // </editor-fold>
}
package com.example.formcloud.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.formcloud.R;
import com.example.formcloud.data.model.vo.CadastroVO;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cadastrar(View view) {
        EditText txtNomeCompleto = (EditText) findViewById(R.id.txtUsuario);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        EditText txtCpf = (EditText) findViewById(R.id.txtCpf);
        EditText txtSenha = (EditText) findViewById(R.id.txtSenha);

        CadastroVO cadastro = new CadastroVO(txtNomeCompleto.getText().toString(),
                                            txtEmail.getText().toString(),
                                            txtCpf.getText().toString(),
                                            txtSenha.getText().toString());

    }
}
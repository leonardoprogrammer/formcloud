package com.example.formcloud.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.formcloud.R;
import com.example.formcloud.data.model.vo.CadastroVO;
import com.example.formcloud.util.Utils;

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

        if (isTodosCamposPreenchidos()) {
            CadastroVO cadastro = new CadastroVO(txtNomeCompleto.getText().toString(),
                    txtEmail.getText().toString(),
                    txtCpf.getText().toString(),
                    txtSenha.getText().toString());
        } else {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        }

    }

    public boolean isTodosCamposPreenchidos() {
        EditText txtNomeCompleto = (EditText) findViewById(R.id.txtUsuario);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        EditText txtCpf = (EditText) findViewById(R.id.txtCpf);
        EditText txtSenha = (EditText) findViewById(R.id.txtSenha);

        if (txtNomeCompleto.getText().toString().isEmpty() || txtEmail.getText().toString().isEmpty() ||
                txtCpf.getText().toString().isEmpty() || txtSenha.getText().toString().isEmpty()) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }
}
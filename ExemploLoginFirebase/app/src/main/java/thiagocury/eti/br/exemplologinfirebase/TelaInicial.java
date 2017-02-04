package thiagocury.eti.br.exemplologinfirebase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TelaInicial extends AppCompatActivity {

    //Widgets
    private TextView tvOla;

    //Firebase autenticação
    private FirebaseAuth mAuth;

    //TAG para LOG
    private static final String TAG = "Tela Inicial Login";

    //Objeto Usuario global
    private Usuario u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        //Referencia
        tvOla = (TextView) findViewById(R.id.ti_tv_ola);

        //Pegando Referencia Firebase
        mAuth = FirebaseAuth.getInstance();

        //Pegando dados do usuário que está logado
        u = new Usuario();
        u.setLogin(mAuth.getCurrentUser().getEmail());

        tvOla.setText("Olá "+u.getLogin()+", seja bem vindo!");

        Toast.makeText(
                getBaseContext(),
                "Olá "+u.getLogin()+", seja bem vindo!",
                Toast.LENGTH_LONG).show();

    }//fecha onCreate
}//fecha classe

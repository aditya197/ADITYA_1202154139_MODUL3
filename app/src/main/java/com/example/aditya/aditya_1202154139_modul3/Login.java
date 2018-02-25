package com.example.aditya.aditya_1202154139_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button a;
    private EditText c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        a = (Button) findViewById(R.id.btn_login);
        c = (EditText) findViewById(R.id.input_username);
        d = (EditText) findViewById(R.id.input_password);

    }

    public void oke (View view) {
        final String user = c.getText().toString();
        String pass = d.getText().toString();

        if ((user.equals("EAD") && pass.equals("MOBILE")) ||(user.equals("ADITYA") && pass.equals("1202154139"))){
            Toast.makeText(this,"Anda berhasil login",Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert Message");
            alert.setMessage("Login Success")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent d = new Intent(Login.this,MainActivity.class);
                            d.putExtra("input_username",user);
                            startActivity(d);
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }

    }
}


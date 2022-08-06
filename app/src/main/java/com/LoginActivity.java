package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.logingeti.R;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextE;
    private EditText editTextP;
    private ImageView imageView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextE =findViewById(R.id.editTextTEmail);
        editTextP=findViewById(R.id.editTextTextPassword);
        imageView=findViewById(R.id.imageView2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email=editTextE.getText().toString();

                String Password=editTextP.getText().toString();
                Email=Email.trim();
                Password=Password.trim();

                if (Email.equals("")){
                    Toast.makeText(LoginActivity.this,"Email ia Empty",Toast.LENGTH_LONG).show();}
                    else if(Password.equals("")){
                    Toast.makeText(LoginActivity.this,"Password ia Empty",Toast.LENGTH_LONG).show();}
                 else {
                    Toast.makeText(LoginActivity.this,"Email ia"+Email+"password"+Password,Toast.LENGTH_LONG).show();

                }


            }
        });

    }
}
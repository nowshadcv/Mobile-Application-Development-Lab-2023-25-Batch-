package com.example.pgrm5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "CommitPrefEdits"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText username,phone,email,pass1,pass2;
        Button submit;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editor;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        phone=(EditText)findViewById(R.id.number);
        email=(EditText)findViewById(R.id.email);
        pass1=(EditText)findViewById(R.id.password);
        pass2=(EditText)findViewById(R.id.con_password);
        submit=(Button)findViewById(R.id.login);
        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernames=username.getText().toString().trim();
                int phones=Integer.parseInt(phone.getText().toString().trim());
                String emails=email.getText().toString().trim();
                String pass11=pass1.getText().toString().trim();
                String pass22=pass2.getText().toString().trim();
                if(usernames.isEmpty())
                {
                    username.setError("Username is Empty");
                    username.requestFocus();
                    return;
                }
                if(emails.isEmpty())
                {
                    email.setError("Input Email");
                    email.requestFocus();
                    return;
                }
                if(pass11.isEmpty())
                {
                    pass1.setError("Input Password");
                    pass1.requestFocus();
                    return;
                }
                if(pass22.isEmpty())
                {
                    pass2.setError("Input Password");
                    pass2.requestFocus();
                    return;
                }
                if(pass11.length()<6)
                {
                    pass1.setError("Length must be minimum 6 character");
                    pass1.requestFocus();
                    return;
                }
                if(!pass11.equals(pass22))
                {
                    pass2.setError("Password not matchd");
                    pass2.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"Registration Succesful",Toast.LENGTH_LONG).show();
                editor.putString("keyusername",usernames);
                editor.putInt("keyuserphone",phones);
                editor.putString("keyumail",emails);
                editor.putString("keypassword",pass22);
            }
        });

    }
}
package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,mobilenum,email,pass1,pass2;
    Button submit;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.userName);
        mobilenum = (EditText) findViewById(R.id.Number);
        email = (EditText) findViewById(R.id.Email);
        pass1 = (EditText) findViewById(R.id.Password);
        pass2 = (EditText) findViewById(R.id.cnfPass);
        submit = (Button) findViewById(R.id.Btn);
        sharedPreferences = getSharedPreferences("UserDetails", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernames = username.getText().toString().trim();
                int mobilei = Integer.parseInt(mobilenum.getText().toString().trim());
                String emails = email.getText().toString().trim();
                String pass1s = pass1.getText().toString().trim();
                String pass2s = pass2.getText().toString().trim();
                if (usernames.isEmpty()) {
                    username.setError("Usename is empty");
                    username.requestFocus();
                    return;
                }
                if (emails.isEmpty()) {
                    email.setError("Input Email");
                    email.requestFocus();
                    return;
                }
                if (pass1s.isEmpty()) {
                    pass1.setError("Enter password");
                    pass1.requestFocus();
                }
                if (pass2s.isEmpty()) {
                    pass2.setError("Enter password");
                    pass2.requestFocus();
                    return;
                }
                if (pass1s.length() < 6) {
                    pass1.setError("Length must be minimum 6 charecters");
                    pass1.requestFocus();
                    return;
                }
                if (!pass1s.equals(pass2s)) {
                    pass2.setError("Password not Matched");
                    pass2.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this, "Registeration succesfully", Toast.LENGTH_SHORT).show();
                editor.putString("keyusername", usernames);
                editor.putInt("keymobile", mobilei);
                editor.putString("keyemail", emails);
                editor.putString("keypassword", pass2s);
                editor.apply();
            }
        });
    }
}
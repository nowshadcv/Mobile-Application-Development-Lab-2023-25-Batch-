package com.example.registration_sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etname,etage,etemail,etphone,etaddress;
    private RadioGroup rggender;
    private CheckBox math,science,eng,social;
    private Button btnReg;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.etname);
        etage=findViewById(R.id.etage);
        etemail=findViewById(R.id.etemail);
        etphone=findViewById(R.id.etphone);
        rggender=findViewById(R.id.rggender);
        math=findViewById(R.id.math);
        science=findViewById(R.id.science);
        eng=findViewById(R.id.eng);
        social=findViewById(R.id.social);
        btnReg=findViewById(R.id.btnReg);
        sharedPreferences=getSharedPreferences("StudentData",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etname.getText().toString();
                String age=etage.getText().toString();
                String email=etemail.getText().toString();
                String phone=etphone.getText().toString();
                int selectedGenderId=rggender.getCheckedRadioButtonId();
                RadioButton rbgender=findViewById(selectedGenderId);
                String gender=rbgender != null ? rbgender.getText().toString() : "";
                StringBuilder subjects=new StringBuilder();
                if (math.isChecked()) subjects.append("Mathematics, ");
                if (science.isChecked()) subjects.append("Science, ");
                if (eng.isChecked()) subjects.append("English, ");
                if (social.isChecked()) subjects.append("Social Science, ");
                if (subjects.length()>0){
                    subjects.setLength(subjects.length() - 2);
                }
                if (name.isEmpty() || age.isEmpty() || email.isEmpty() || phone.isEmpty() || gender.isEmpty()){
                    Toast.makeText(MainActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                    return;
                }
                editor.putString("name",name);
                editor.putString("age",age);
                editor.putString("email",email);
                editor.putString("phone",phone);
                editor.putString("gender",gender);
                editor.putString("subjects",subjects.toString());
                editor.apply();
                Toast.makeText(MainActivity.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
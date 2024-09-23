package com.example.student_registration;

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
    private EditText etName,etAge,etEmail,etPhone;
    private RadioGroup rgGender;
    private CheckBox cbMath,cbScience,cbEnglish,cbHistory;
    private Button btnRegister;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etAge=findViewById(R.id.etAge);
        etEmail=findViewById(R.id.etEmail);
        etPhone=findViewById(R.id.etPhone);
        rgGender=findViewById(R.id.rgGender);
        cbMath=findViewById(R.id.cbMath);
        cbScience=findViewById(R.id.cbScience);
        cbEnglish=findViewById(R.id.cbEnglish);
        cbHistory=findViewById(R.id.cbHistory);
        btnRegister=findViewById(R.id.btnRegister);

        sharedPreferences=getSharedPreferences("StudentData",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String age = etAge.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();
                int selectedGenderId = rgGender.getCheckedRadioButtonId();
                RadioButton rbGender = findViewById(selectedGenderId);
                String gender = rbGender != null ? rbGender.getText().toString() : "";
                StringBuilder subjects = new StringBuilder();
                if (cbMath.isChecked()) subjects.append("Mathematics, ");
                if (cbScience.isChecked()) subjects.append("Science, ");
                if (cbEnglish.isChecked()) subjects.append("English, ");
                if (cbHistory.isChecked()) subjects.append("History, ");

                if (subjects.length() > 0) {
                    subjects.setLength(subjects.length() - 2);
                }
                if (name.isEmpty() || age.isEmpty() || email.isEmpty() || phone.isEmpty() || gender.isEmpty()) {
                    Toast.makeText(MainActivity.this, "All feilds are required", Toast.LENGTH_SHORT).show();
                    return;
                }
                editor.putString("name", name);
                editor.putString("age", age);
                editor.putString("email", email);
                editor.putString("phone", phone);
                editor.putString("gender", gender);
                editor.putString("subjects", subjects.toString());
                editor.apply();
                Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}



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
    private EditText etName, etAge, etEmail, etPhone;
    private RadioGroup rgGender;
    private CheckBox cbMath, cbScience, cbEnglish, cbHistory;
    private Button btnRegister;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById((R.id.etName));
        etAge = findViewById((R.id.etAge));
        etEmail = findViewById((R.id.etEmail));
        etPhone = findViewById((R.id.etphone));
        rgGender = findViewById((R.id.rgGender));
        cbMath = findViewById((R.id.cbMath));
        cbScience = findViewById((R.id.cbScience));
        cbEnglish = findViewById((R.id.cbEnglish));
        cbHistory = findViewById((R.id.cbHistory));
        btnRegister = findViewById((R.id.btnRegister));
        sharedPreferences = getSharedPreferences("StudentData", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String age = etAge.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();
                int selectedGenderid = rgGender.getCheckedRadioButtonId();
                RadioButton rbGender = findViewById(selectedGenderid);
                String gender = rbGender != null ? rbGender.getText().toString() : "";
                StringBuilder Subjects = new StringBuilder();
                if (cbMath.isChecked()) Subjects.append("Mathematics,");
                if (cbScience.isChecked()) Subjects.append("Science,");
                if (cbEnglish.isChecked()) Subjects.append("English,");
                if (cbHistory.isChecked()) Subjects.append("History,");
                if (Subjects.length() > 0) {
                    Subjects.setLength(Subjects.length() - 2);
                }
                if (name.isEmpty() || age.isEmpty() || email.isEmpty() || phone.isEmpty() || gender.isEmpty()) {
                    Toast.makeText(MainActivity.this, "all fields are required", Toast.LENGTH_SHORT).show();
                    return;
                }
                editor.putString("name", name);
                editor.putString("age", age);
                editor.putString("email", email);
                editor.putString("phone", phone);
                editor.putString("gender", gender);
                editor.putString("Subjects", Subjects.toString());
                editor.apply();
                Toast.makeText(MainActivity.this, "Registraion successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


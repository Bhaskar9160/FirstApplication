package com.akhm.firstapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class RegistrationActivity extends AppCompatActivity {

    private EditText etName, etPassword,etEmailId,etMobileNumber,etCountryCode,etUserType ;
    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        initializeComponents();
    }
    public void initializeComponents(){
      EditText  etName = findViewById(R.id.etRName);
        EditText  etPassword = findViewById(R.id.etRPassword);
        EditText  etEmailId = findViewById(R.id.etREmailId);
        EditText etCountryCode= findViewById(R.id.etRCountryCode);
        EditText  etMobileNumber= findViewById(R.id.etRMobileNumber);
        EditText  etUserType = findViewById(R.id.etRUserType);

       Button btRegister = findViewById(R.id.btnRegister);
       RetrofitClient retrofitClient=new RetrofitClient();

       API api= retrofitClient.getRetrofit().create(API.class);

               btRegister.setOnClickListener(view -> {

                   String name=String.valueOf(etName.getText());
                   String password=String.valueOf(etPassword.getText());
                   String emailId=String.valueOf(etEmailId.getText());
                   String countryCode=String.valueOf(etCountryCode.getText());
                   String mobileNumber=String.valueOf(etMobileNumber.getText());
                   String userType=String.valueOf(etUserType.getText());

                   UserEntity userEntity=new UserEntity();
                   userEntity.setName(name);
                   userEntity.setPassword(password);
                   userEntity.setEmailId(emailId);
                   userEntity.setCountryCode(countryCode);
                   userEntity.setMobileNumber(mobileNumber);
                   userEntity.setUserType(userType);

                   api.insertUser(userEntity)
                           .enqueue(new Callback<UserEntity>() {
                               @Override
                               public void onResponse(Call<UserEntity> call, Response<UserEntity> response) {
                                   Toast.makeText(RegistrationActivity.this, "Save successful!", Toast.LENGTH_SHORT).show();
                               }

                               @Override
                               public void onFailure(Call<UserEntity> call, Throwable t) {
                                   Toast.makeText(RegistrationActivity.this, "Save failed!!!", Toast.LENGTH_SHORT).show();
                                   Logger.getLogger(RegistrationActivity.class.getName()).log(Level.SEVERE, "Error occurred", t);
                               }

                           });
               });
    }///
}
package com.example.instaapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail,etPassword;
    private Button btnLogin;
    private FirebaseAuth mAuth;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        mAuth=FirebaseAuth.getInstance();
        pd=new ProgressDialog(this);
        pd.setTitle("Just a moment");
        pd.setMessage("Logging in...");


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=etEmail.getText().toString().trim();
                String password=etPassword.getText().toString().trim();
                if (!email.contains("@") || TextUtils.isEmpty(email) || email.length()<7)
                {
                    givemesometoast(etEmail,"Your email is invalid...");
                }else if (!TextUtils.isEmpty(password) && password.length()>=7)
                {
                    //Toast.makeText(MainActivity.this, "Correct details", Toast.LENGTH_SHORT).show();

                    pd.show();
                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful())
                            {
                                pd.dismiss();
                                Pair[] pairs=new Pair[1];
                                pairs[0]=new Pair<View,String>(etEmail,"etTransition");

                                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                                startActivity(new Intent(MainActivity.this,HomeActivity.class),options.toBundle());
                                finish();

                            }else {
                                pd.dismiss();
                                Toast.makeText(MainActivity.this, "Error: "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    //Do your stuffs here.
                    //givemesometoast("Your credentials input are correct...");

                }else{
                    pd.dismiss();
                    givemesometoast(etPassword,"Invalid password minimum of 7 characters ...");
                }
            }
        });
    }

    private void givemesometoast(EditText etText,String s) {
        //Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        etText.setError(s);
        etText.requestFocus();

    }

    public void registerme(View view) {
        startActivity(new Intent(MainActivity.this,RegisterActivity.class));
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser=mAuth.getCurrentUser();
        if (currentUser==null)
        {

        }else{
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            finish();

        }
    }
}
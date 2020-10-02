package com.example.g.salaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btn_login;
    private TextView txt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        this.setUsername((EditText) findViewById(R.id.editText));
        this.setPassword((EditText) findViewById(R.id.editText2));
        this.setBtn_login((Button) findViewById(R.id.btn_login));
        this.setTxt_register((TextView) findViewById(R.id.textView2));



        //TODO
        // Control method about existence of username and password in db
        /*if this method is verified then: enter in login*/

        this.getBtn_login().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pass to homepage
            }
        });

        //if user is not registered the he can click on textview and go to register activity
        this.getTxt_register().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity(RegisterActivity.class);
            }
        });

    }

    public void onClick(View v)
    {

    }

    /*
    Name: openNewActivity
    Parameters type: Class<RegisterActivity>
    Usage: go to another activity. The new one has passed as argument
    Warnings: yes
     */
    private void openNewActivity(Class<RegisterActivity> class_argument) {
        Intent intent = new Intent(this, class_argument);
        startActivity(intent);
    }


    //GET METHODS//
    public TextView getUsername() {
        return username;
    }

    public TextView getPassword() {
        return password;
    }

    public Button getBtn_login() {
        return btn_login;
    }

    public TextView getTxt_register() {
        return txt_register;
    }

    //SET METHODS//
    public void setUsername(TextView username) {
        this.username = (EditText) username;
    }

    public void setPassword(TextView password) {
        this.password = (EditText) password;
    }

    public void setBtn_login(Button btn_login) {
        this.btn_login = btn_login;
    }

    public void setTxt_register(TextView txt_register) {
        this.txt_register = txt_register;
    }
}

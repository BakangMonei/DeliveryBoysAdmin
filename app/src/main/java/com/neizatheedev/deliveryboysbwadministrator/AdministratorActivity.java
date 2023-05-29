package com.neizatheedev.deliveryboysbwadministrator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdministratorActivity extends AppCompatActivity {

    private Button ViewButton, addGuyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        ViewButton = (Button) findViewById(R.id.ViewButton);
        addGuyButton = (Button) findViewById(R.id.addGuyButton);

        ViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(AdministratorActivity.this, CustomerUserActivity.class);
                startActivity(x);
            }
        });

        addGuyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y = new Intent(AdministratorActivity.this, RegisterAdminActivity.class);
                startActivity(y);
            }
        });
    }
}
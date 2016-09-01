package com.andresvanegas.punto_2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View r1 = findViewById(R.id.radio1);
        View r2 = findViewById(R.id.radio2);
        View r3 = findViewById(R.id.radio3);
        View r4 = findViewById(R.id.radio4);
        View b1 = findViewById(R.id.bcalc);
// asignar evento onclick a los botones

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        EditText nu1,nu2;
        TextView Res;
        nu1 = (EditText) findViewById(R.id.enum1);
        nu2 = (EditText) findViewById(R.id.enum2);
        Res = (TextView) findViewById(R.id.tResp);
        // Check with radio button was clicked
        float x = Float.parseFloat(nu1.getText().toString());
        float y = Float.parseFloat(nu2.getText().toString());
        float z = 0;

        switch (view.getId()){
            case R.id.radio1:
                if (checked)
                z = x +y;
                Res.setText(String.format("Resultado: %.2f",z));
                break;
            case R.id.radio2:
                if (checked)
                z = x - y;
                Res.setText(String.format("Resultado: %.2f",z));
                break;
            case R.id.radio3:
                if (checked)
                z = x * y;
                Res.setText(String.format("Resultado: %.2f",z));
                break;
            case R.id.radio4:
                if (checked)
                z = x / y;
                Res.setText(String.format("Resultado: %.2f",z));
                break;
            case R.id.bcalc:
                if (checked)
                Res.setText(String.format("Resultado: %.2f",z));
                break;

        }

    }
}

package com.andresvanegas.punto3;

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

        View Area1 = findViewById(R.id.rCirculo);
        View Area2 = findViewById(R.id.rCuadrado);
        View Area3 = findViewById(R.id.rRectangulo);
        View Area4 = findViewById(R.id.rTriangulo);

        Area1.setOnClickListener(this);
        Area2.setOnClickListener(this);
        Area3.setOnClickListener(this);
        Area4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Button was checked
        boolean checked = ((RadioButton) view).isChecked();

        final EditText base,altura,lado,radio;
        final TextView area;

        base = (EditText) findViewById(R.id.eBase);
        altura = (EditText) findViewById(R.id.eAltura);
        lado = (EditText) findViewById(R.id.eLado);
        radio = (EditText) findViewById(R.id.eRadio);
        area = (TextView) findViewById(R.id.tArea);
        //check which radiobutton was clicked
        switch (view.getId()) {
            case R.id.rCirculo:
                if (checked)
                base.setVisibility(TextView.INVISIBLE);
                altura.setVisibility(TextView.INVISIBLE);
                radio.setVisibility(TextView.VISIBLE);
                lado.setVisibility(TextView.INVISIBLE);

                final Button button4 = (Button) findViewById(R.id.bCalcular);
                button4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on click
                        float a = Float.parseFloat(radio.getText().toString());
                        area.setText(String.format("El area del circulo es: %.2f", a * a * 3.1416));
                    }
                });
                break;
            case R.id.rCuadrado:
                if (checked)

                base.setVisibility(TextView.INVISIBLE);
                altura.setVisibility(TextView.INVISIBLE);
                radio.setVisibility(TextView.INVISIBLE);
                lado.setVisibility(TextView.VISIBLE);

                final Button button = (Button) findViewById(R.id.bCalcular);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on click
                        float a = Float.parseFloat(lado.getText().toString());
                        area.setText(String.format("El area del cuadrado es: %.2f", a*a));
                    }
                });
                break;
            case R.id.rRectangulo:
                if (checked)
                    base.setVisibility(TextView.VISIBLE);
                altura.setVisibility(TextView.VISIBLE);
                radio.setVisibility(TextView.INVISIBLE);
                lado.setVisibility(TextView.INVISIBLE);

                final Button button3 = (Button) findViewById(R.id.bCalcular);
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on click
                        float a = Float.parseFloat(base.getText().toString());
                        float b = Float.parseFloat(altura.getText().toString());
                        area.setText(String.format("El area rectangulo es: %.2f", a * b));
                    }
                });
                break;
            case R.id.rTriangulo:
                if (checked)
                    base.setVisibility(TextView.VISIBLE);
                altura.setVisibility(TextView.VISIBLE);
                radio.setVisibility(TextView.INVISIBLE);
                lado.setVisibility(TextView.INVISIBLE);

                final Button button2 = (Button) findViewById(R.id.bCalcular);
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on click
                        float a = Float.parseFloat(base.getText().toString());
                        float b = Float.parseFloat(altura.getText().toString());
                        area.setText(String.format("El area del triangulo es:%.2f", a * b/2));
                    }
                });
                break;


        }
    }
}

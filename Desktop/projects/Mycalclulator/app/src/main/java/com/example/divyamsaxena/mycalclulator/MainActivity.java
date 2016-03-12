package com.example.divyamsaxena.mycalclulator;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btMin,btMul,btAdd,btDiv,btClear,btEquals,btcopy,
    btpaste,btcase;
    TextView Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        bt1  = (Button) findViewById(R.id.button);
        bt2  = (Button) findViewById(R.id.button2);
        bt3  = (Button) findViewById(R.id.button3);
        bt4  = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6  = (Button) findViewById(R.id.button6);
        bt7  = (Button) findViewById(R.id.button7);
        bt8  = (Button) findViewById(R.id.button8);
        bt9  = (Button) findViewById(R.id.button9);
        bt0  = (Button) findViewById(R.id.button10);

        btClear  = (Button) findViewById(R.id.button11);
        btEquals  = (Button) findViewById(R.id.button12);
        btAdd  = (Button) findViewById(R.id.butto13);
        btMin  = (Button) findViewById(R.id.button14);
        btDiv  = (Button) findViewById(R.id.button15);
        btMul = (Button) findViewById(R.id.button16);
        btcopy = (Button) findViewById(R.id.buttonCopy);
        btpaste = (Button) findViewById(R.id.buttonPaste);

         Input = (TextView) findViewById(R.id.editTextInput);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt1.getText());
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt2.getText());
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt3.getText());
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt4.getText());
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt5.getText());
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt6.getText());
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt7.getText());
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt8.getText());
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt9.getText());
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + bt0.getText());
            }
        });
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btClear.getText());

            }
        });
        btEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btEquals.getText());
            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btAdd.getText());
            }
        });
        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btMin.getText());
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btMul.getText());
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btDiv.getText());
            }
        });
        btcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btcopy.getText());
            }
        });
        btpaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btpaste.getText());
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Input.setText("" + bt1.getText());
                    }
                });
            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("" + btAdd.getText());
                Toast.makeText(MainActivity.this,"calculator is running",Toast.LENGTH_SHORT).show();
            }
        });


        }
//    public void clickMe(View view){
//        switch(view.getId()) {
//
//            case R.id.button:
//
//        }
//    }
}

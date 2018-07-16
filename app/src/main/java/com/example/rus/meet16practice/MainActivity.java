package com.example.rus.meet16practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonEval;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMult;
    Button buttonDiv;
    Button buttonClean;
    TextView textView;
    private Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        presenter = new Presenter(this);
    }

    private void init() {
        button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(0);
            }
        });

        button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(1);
            }
        });

        button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(2);
            }
        });

        button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(3);
            }
        });

        button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(4);
            }
        });

        button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(5);
            }
        });

        button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(6);
            }
        });

        button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(7);
            }
        });

        button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(8);
            }
        });

        button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.numberPressed(9);
            }
        });

        buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addPressed();
            }
        });

        buttonClean = findViewById(R.id.button_clean);
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.clean();
            }
        });

        buttonDiv = findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.divPressed();
            }
        });

        buttonEval = findViewById(R.id.button_evaluate);
        buttonEval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.evaluatePressed();
            }
        });

        buttonMult = findViewById(R.id.button_mult);
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.MultPressed();
            }
        });

        buttonSub = findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.SubPressed();
            }
        });

        textView = findViewById(R.id.textView);


    }

    public void clean() {
        textView.setText("");
    }

    public void setResult(String result) {
        textView.setText(result);
    }

    public void setButtonsDisabled() {
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonSub.setEnabled(false);
        buttonMult.setEnabled(false);
        buttonEval.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonAdd.setEnabled(false);
    }

    public void setButtonsEnabled() {
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonSub.setEnabled(true);
        buttonMult.setEnabled(true);
        buttonEval.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonAdd.setEnabled(true);
    }
}

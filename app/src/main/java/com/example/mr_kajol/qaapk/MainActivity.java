package com.example.mr_kajol.qaapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] ques;
    String[] ans;
    int index ;
    TextView tvquestion,tvanswer,tvlengthyy,presentindexxx;
    Button left, right,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvquestion = findViewById(R.id.tvquestion);
        tvanswer = findViewById(R.id.tvanswer);
        presentindexxx =findViewById(R.id.tvxx);
        tvlengthyy =findViewById(R.id.tvyy);


        left = findViewById(R.id.bleft);
        right = findViewById(R.id.bright);
        show =findViewById(R.id.bshowanswer);


        left.setOnClickListener(this);
        show.setOnClickListener(this);
        right.setOnClickListener(this);


        ques = getResources().getStringArray(R.array.simple_ques);
        ans = getResources().getStringArray(R.array.answer);

        index = 0;
        tvquestion.setText(ques[index]);
        tvanswer.setText("Press ANSWER Button for answer.");
        presentindexxx.setText(String.valueOf(index+1));
        tvlengthyy.setText(" / "+String.valueOf(ques.length));


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bleft:
                tvanswer.setText("Press ANSWER Button for Answer. ");
                index--;
                if(index == -1){
                    index = ques.length -1;
                }
                tvquestion.setText(ques[index]);
                presentindexxx.setText(String.valueOf(index+1));
                break;

            case R.id.bshowanswer:

                tvanswer.setText(ans[index]);

                break;

            case R.id.bright:
                tvanswer.setText("Press ANSWER Button for Answer. ");
                index++;

                if(index == (ques.length)){
                    index = 0;
                }
                tvquestion.setText(ques[index]);
                presentindexxx.setText(String.valueOf(index+1));
                break;
        }

    }
}

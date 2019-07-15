package com.example.findandroidsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button ;
    TextView textView;
    int CVersion ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CVersion = android.os.Build.VERSION.SDK_INT;

                switch (CVersion){

                    case 11 :
                        textView.setText("Honeycomb");
                        break;

                    case 12 :
                        textView.setText("Honeycomb");
                        break;

                    case 13 :
                        textView.setText("Honeycomb");
                        break;

                    case 14 :
                        textView.setText("Ice Cream Sandwich");
                        break;

                    case 15 :
                        textView.setText("Ice Cream Sandwich");
                        break;

                    case 16 :
                        textView.setText("Jelly Bean");
                        break;

                    case 17 :
                        textView.setText("Jelly Bean");
                        break;

                    case 18 :
                        textView.setText("Jelly Bean");
                        break;

                    case 19 :
                        textView.setText("KitKat");
                        break;

                    case 21 :
                        textView.setText("Lollipop");
                        break;

                    case 22 :
                        textView.setText("Lollipop");
                        break;

                    case 23 :
                        textView.setText("Marshmallow");
                        break;

                    case 24 :
                        textView.setText("Nougat");
                        break;

                    case 25 :
                        textView.setText("Nougat");
                        break;

                    default:
                        Toast.makeText(MainActivity.this,"Not Found", Toast.LENGTH_LONG).show();
                        break;
                }

            }
        });
    }
}

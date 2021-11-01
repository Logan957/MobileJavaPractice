package ru.mirea.zaidulin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK = (Button) findViewById(R.id.btnOK);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);
        TextView textView = (TextView) findViewById(R.id.tvOut);

        View.OnClickListener oclBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка OK");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка Canel");
            }
        };

        btnOK.setOnClickListener(oclBtnOK);
        btnCancel.setOnClickListener(oclBtnCancel);
    }

    public void onMyButtonClick(View view) {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}
package com.example.tacademy.textactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textMessage;
    TextView textViewResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMessage = (TextView)findViewById(R.id.text_message);
        textViewResource = (TextView)findViewById(R.id.text_html_resource);
        Button btn = (Button)findViewById(R.id.btn_html);

        textViewResource.setText(Html.fromHtml(getResources().getString(R.string.link_text_manual)));
        textViewResource.setMovementMethod(LinkMovementMethod.getInstance());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getResources().getString(R.string.html_text);
                textMessage.setText(Html.fromHtml(text));
            }
        });
    }
}

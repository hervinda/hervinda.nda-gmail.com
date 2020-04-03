package com.example.infoman_u;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button webIntent = findViewById(R.id.web_Intent);
        webIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.google.com/search?q=jadwal+pertandingan+mu&rlz=1C1SQJL_enID873ID873&oq=jadwal+pertandingan+mu&aqs=chrome..69i57j0l7.5252j0j7&sourceid=chrome&ie=UTF-8#sie=t;/m/050fh;2;/m/02_tc;mt;fp;1;;");
                Intent webIntent = new Intent(Intent.ACTION_VIEW , webpage);
                startActivity(webIntent);

            }
        });

        Button web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.google.com/search?safe=strict&rlz=1C1SQJL_enID873ID873&sxsrf=ALeKk00QodZcWOB6kPcgurdR__ps0nOR1g%3A1585843971329&ei=Aw-GXpngE8u1rQHRy6KIDw&q=jadwal+pertandingan+mu&oq=jadwal+pertandingan&gs_lcp=CgZwc3ktYWIQAxgAUABYAGDLAWgAcAB4AIABAIgBAJIBAJgBAKoBB2d3cy13aXo&sclient=psy-ab#sie=t;/m/050fh;2;/m/02_tc;nw;fp;1;;");
                Intent web = new Intent(Intent.ACTION_VIEW , webpage);
                startActivity(web);

            }
        });

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_with_data);
        btnMoveWithDataActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveWithDataIntent = new Intent(Main2Activity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Manchester United Football Club (The Red Devils)");
                startActivity(moveWithDataIntent);
            }
        });
    }
}

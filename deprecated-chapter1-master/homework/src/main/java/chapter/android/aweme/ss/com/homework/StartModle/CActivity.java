package chapter.android.aweme.ss.com.homework.StartModle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import chapter.android.aweme.ss.com.homework.R;

public class CActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        findViewById(R.id.btn_c2d).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CActivity.this,DActivity.class);
                startActivity(intent);
            }
        });
    }
}

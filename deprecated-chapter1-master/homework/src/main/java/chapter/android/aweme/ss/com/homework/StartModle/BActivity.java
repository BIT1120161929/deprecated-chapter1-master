package chapter.android.aweme.ss.com.homework.StartModle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import chapter.android.aweme.ss.com.homework.R;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.btn_b2c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this,CActivity.class);
                startActivity(intent);
            }
        });
    }
}

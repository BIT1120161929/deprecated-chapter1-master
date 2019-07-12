package chapter.android.aweme.ss.com.homework.StartModle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import chapter.android.aweme.ss.com.homework.R;

public class DActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Log.d("D", "onClick: "+getTaskId());
        findViewById(R.id.btn_d2a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DActivity.this,AActivity.class);
                startActivity(intent);


            }
        });
    }
}

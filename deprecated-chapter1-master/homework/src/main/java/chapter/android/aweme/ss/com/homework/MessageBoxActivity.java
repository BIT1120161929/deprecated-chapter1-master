package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageBoxActivity extends AppCompatActivity {
    private TextView textView;

    private int Position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_box);

        textView = findViewById(R.id.mb_tv_position);

        Position = getIntent().getExtras().getInt("position");

        textView.setText(""+Position);
    }
}

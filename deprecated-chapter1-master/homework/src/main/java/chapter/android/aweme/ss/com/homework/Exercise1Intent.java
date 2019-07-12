package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Exercise1Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1_intent);

        Log.d("Exercise1Intent:","onCreate");
        Log.d("Exercise1Intent","task:"+getTaskId()+hashCode());
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Exercise1Intent:","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Exercise1Intent:","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Exercise1Intent:","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Exercise1Intent:","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Exercise1Intent:","onDestroy");
    }
}

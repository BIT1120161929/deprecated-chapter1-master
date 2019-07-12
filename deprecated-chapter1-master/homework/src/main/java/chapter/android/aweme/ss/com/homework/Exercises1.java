package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 */
public class Exercises1 extends AppCompatActivity {

    private static final String TAG = "Exercise1";

    private Button mBtnTurn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        mBtnTurn = findViewById(R.id.btn_turn);
        mBtnTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercises1.this,Exercise1Intent.class);
                startActivity(intent);
            }
        });

        //TAG：过滤器
        Log.d(TAG,"onCreate");
        Log.d(TAG,"task:"+getTaskId()+hashCode());
    }

    /**
     * 页面可见
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    /**
     * 页面可见并且获得焦点
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    /**
     * 页面可见但是失去焦点
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
        Log.d(TAG,"task:"+getTaskId()+hashCode());
    }

    /**
     * 页面不可见
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}

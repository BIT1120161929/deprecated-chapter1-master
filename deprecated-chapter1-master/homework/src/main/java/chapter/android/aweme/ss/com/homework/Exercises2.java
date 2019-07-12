package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    private View Testview;
    private TextView mTvShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        Testview  = findViewById(R.id.ll_test);
        mTvShow = findViewById(R.id.tv_show);
        mTvShow.setText(""+getViewCount(Testview));

    }

    public static int getViewCount(View view) {

        //存放View总数
        int ViewCount = 0;

        if(view == null) {
            return 0;
        }

        if(view instanceof ViewGroup){
            ViewCount += ((ViewGroup) view).getChildCount();
            for(int i = 0 ; i < ((ViewGroup) view).getChildCount() ; i++){
                View tempView = ((ViewGroup) view).getChildAt(i);
                if(tempView instanceof ViewGroup){
                    ViewCount += getViewCount(tempView);
                }
            }
        }

        return ViewCount;
    }
}

package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {

    private GridView mGvNavigator;

    private ListView mLvTips;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        mGvNavigator = findViewById(R.id.gv_navigation);
        mGvNavigator.setAdapter(new GridViewNavigator(Exercises3.this));

        mLvTips = findViewById(R.id.lv_tips);
        mLvTips.setAdapter(new ListViewAdapter(Exercises3.this));

        mLvTips.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Exercises3.this,MessageBoxActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("position",position);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}

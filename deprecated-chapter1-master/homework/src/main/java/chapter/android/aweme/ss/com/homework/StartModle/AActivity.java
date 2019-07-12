package chapter.android.aweme.ss.com.homework.StartModle;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import chapter.android.aweme.ss.com.homework.R;

public class AActivity extends AppCompatActivity {

    private String TAG = "AActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.btn_a2b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
//        Log.d(TAG, "onCreate: "+getTaskId()+" ,hash: "+hashCode());
//        try {
//            logtaskName();
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
        }
    }

//    private void logtaskName() throws PackageManager.NameNotFoundException {
//        ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
//        Log.d(TAG, info.taskAffinity);
//    }
//}

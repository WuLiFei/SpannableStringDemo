package com.mariostudio.texteditorpanel.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mariostudio.texteditorpanel.R;

/**
 * Created by MarioStudio on 2016/6/5.
 */
public class OtherActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text01);
        Intent intent = getIntent();
        if(intent != null) {
            Bundle bundle = intent.getBundleExtra("bundle");
            if(bundle != null) {
                String content = bundle.getString("content");
                textView.setText("这是传过来的内容：" + content);
            }
        }
    }
}

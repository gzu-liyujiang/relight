package com.ittianyu.relight.learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ittianyu.relight.R;
import com.ittianyu.relight.learn.widget.GirlLceermWidget;
import com.ittianyu.relight.utils.WidgetUtils;

public class GirlListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //View root = WidgetUtils.render(this, GirlLceermWidget.class);
        //setContentView(root);
        setContentView(R.layout.activity_learn);
    }

}

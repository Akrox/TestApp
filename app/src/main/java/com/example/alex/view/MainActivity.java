package com.example.alex.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.testapp.R;

public class MainActivity  extends Activity {

    private TextView oka;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews() {
        oka = (TextView) findViewById(R.id.oka_text);
    }

    private void setListeners() {
        oka.setOnClickListener(onClickOkaListener);
        oka.setOnLongClickListener(onLongClickOkaListener);
    }

    View.OnClickListener onClickOkaListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            oka.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_180));
        }
    };

    View.OnLongClickListener onLongClickOkaListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            oka.setBackgroundColor(getResources().getColor(R.color.black));
            return true;
        }
    };

    @Override protected void onStart() {
        super.onStart();
    }

    @Override protected void onResume() {
        super.onResume();
    }

    @Override protected void onPause() {
        super.onPause();
    }

    @Override protected void onStop() {
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }

}

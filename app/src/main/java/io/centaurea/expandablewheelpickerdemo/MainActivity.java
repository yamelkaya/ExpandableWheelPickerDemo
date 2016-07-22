package io.centaurea.expandablewheelpickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.aakira.expandablelayout.ExpandableLinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toggleButton = (Button) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(v -> onToggleClick(v));
    }

    private void onToggleClick(View v) {
        ExpandableLinearLayout expandable = (ExpandableLinearLayout) findViewById(R.id.test_root_ell);
        expandable.toggle();
        expandable.initLayout(true);
    }
}

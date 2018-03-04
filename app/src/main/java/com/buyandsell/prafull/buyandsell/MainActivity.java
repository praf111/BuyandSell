package com.buyandsell.prafull.buyandsell;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Item testItem;
        int i;
        NestedScrollView scrollarea = (NestedScrollView) findViewById(R.id.id_scrollarea);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        scrollarea.removeAllViews();

        for (i = 0; i < 50; ++i)
        {
            testItem = new Item("Cycle" + (i + 1), "H14", "Good cycle " + (i + 1), i + 5);
            LinearLayout itemView = (LinearLayout) ItemFactory.createItem(this, testItem);
            layout.addView(itemView);
        }

        scrollarea.addView(layout);
    }
}

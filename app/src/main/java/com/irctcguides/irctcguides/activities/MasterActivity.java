package com.irctcguides.irctcguides.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by Ram on 26/05/16.
 * This is the master activity which contains the basic boilerplate functionality needed by all Activities
 */

public class MasterActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * added butterknife injection boilerplate
     * @param layoutResID
     */
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.inject(this);
    }

    /**
     * reset butterknife
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }
}

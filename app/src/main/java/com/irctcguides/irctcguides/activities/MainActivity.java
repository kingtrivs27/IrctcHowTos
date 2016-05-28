package com.irctcguides.irctcguides.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.irctcguides.irctcguides.R;
import com.irctcguides.irctcguides.adapters.GuidesAdapter;
import com.irctcguides.irctcguides.constants.GlobalConstants;
import com.irctcguides.irctcguides.models.Guide;

import java.util.List;

import butterknife.InjectView;

/**
 * This is the launcher activity. This activity hosts a list of guides related to IRCTC.
 */
public class MainActivity extends MasterActivity {

    @InjectView(R.id.guides_list) RecyclerView guidesRecyclerView;
    @InjectView(R.id.fab) FloatingActionButton fab;
    @InjectView(R.id.toolbar) Toolbar toolbar;
    int dialerClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);
        setTitle("IRCTC Guides");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialerClickCount +=1;
                if(dialerClickCount == 1) {
                    Snackbar.make(view, "Tap again to contact IRCTC customer care.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    return;
                }
                dialPhoneNumber(getString(R.string.irctc_phone));

            }
        });

        List<Guide> guidesData = GlobalConstants.getGuidesData();

        GuidesAdapter guidesAdapter = new GuidesAdapter(guidesData, this);
        guidesRecyclerView.setAdapter(guidesAdapter);

        guidesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    /**
     * This method transfers the intent to the phone app
     * @param phoneNumber the phone number to dial
     */
    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}

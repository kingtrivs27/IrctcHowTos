package com.irctcguides.irctcguides.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.irctcguides.irctcguides.R;
import com.irctcguides.irctcguides.models.Guide;

import butterknife.InjectView;

public class GuideDetailsActivity extends MasterActivity {
    @InjectView(R.id.guide_details_title) TextView guideTitle;
    @InjectView(R.id.guide_content) TextView guideContent;
    @InjectView(R.id.guide_details_img) ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_details_scrolling);

        Intent intent = getIntent();
        Guide guide =  intent.getParcelableExtra("guideInfo");

        setTitle("IRCTC - How to..?");
        guideTitle.setText(guide.title);
        guideContent.setText(Html.fromHtml(guide.content));

        int resourceImage = this.getResources().getIdentifier(guide.image, "drawable", this.getPackageName());
        imgView.setImageResource(resourceImage);
    }
}
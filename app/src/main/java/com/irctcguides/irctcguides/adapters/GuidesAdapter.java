package com.irctcguides.irctcguides.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.irctcguides.irctcguides.R;
import com.irctcguides.irctcguides.activities.GuideDetailsActivity;
import com.irctcguides.irctcguides.models.Guide;

import java.util.List;

/**
 * Created by Ram on 26/05/16.
 */

public class GuidesAdapter extends RecyclerView.Adapter<GuidesAdapter.InfoViewHolder> {

    private final List<Guide> guidesList;
    private final Context ctx;


    public GuidesAdapter(List<Guide> guides, Context ctx) {
        this.guidesList = guides;
        this.ctx = ctx;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.guide_card_format, parent, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        TextView textViewGuideTitle = (TextView) holder.itemView.findViewById(R.id.guide_title);
        TextView textViewGuideSubTitle = (TextView) holder.itemView.findViewById(R.id.guide_sub_title);
        Button viewButton = (Button) holder.itemView.findViewById(R.id.view_guide_btn);

        Guide guide = guidesList.get(position);
        textViewGuideTitle.setText(guide.title);
        textViewGuideSubTitle.setText(guide.content);
        viewButton.setTag(guide);

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Guide guideInfo = (Guide) v.getTag();

                Intent guideDetailsIntent = new Intent(ctx, GuideDetailsActivity.class);
                guideDetailsIntent.putExtra("guideInfo", guideInfo);
                ctx.startActivity(guideDetailsIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return guidesList.size();
    }

    public static class InfoViewHolder extends RecyclerView.ViewHolder {

        public InfoViewHolder(View itemView) {
            super(itemView);
        }
    }
}
package com.orekie.component;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.orekie.component.diary.DiaryComponent;
import com.orekie.component.diary.TextComponent;

import java.util.List;


public class FreeAdapter extends RecyclerView.Adapter<FreeAdapter.FreeViewHolder> {

    private Context context;

    private int textViewId = R.layout.test_text_view;
    private int imageViewId = R.layout.test_image_view;
    private int voiceViewId = R.layout.test_voice_view;


    List<DiaryComponent> dataSet;

    public FreeAdapter(Context context, List<DiaryComponent> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    @Override
    public FreeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        switch (dataSet.get(i).getType()) {
            case DiaryComponent.TYPE_TEXT:
                return new TextViewHolder(LayoutInflater.from(context).inflate(textViewId, viewGroup, false));
            case DiaryComponent.TYPE_IMAGE:
                return new ImageViewHolder(LayoutInflater.from(context).inflate(imageViewId, viewGroup, false));
            case DiaryComponent.TYPE_VOICE:
                return new VoiceViewHolder(LayoutInflater.from(context).inflate(voiceViewId, viewGroup, false));
        }
        return null;
    }


    @Override
    public void onBindViewHolder(FreeViewHolder freeViewHolder, int i) {

        switch (dataSet.get(i).getType()) {
            case DiaryComponent.TYPE_TEXT:
                freeViewHolder.getItemView().setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        dataSet.add(((ViewGroup) v.getParent()).indexOfChild(v), new TextComponent());
                        notifyDataSetChanged();
                    }
                });
                break;
            case DiaryComponent.TYPE_IMAGE:
                break;
            case DiaryComponent.TYPE_VOICE:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public List<DiaryComponent> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<DiaryComponent> dataSet) {
        this.dataSet = dataSet;
    }

    public class FreeViewHolder extends RecyclerView.ViewHolder {
        private View itemView;

        public FreeViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
        }

        public View getItemView() {
            return itemView;
        }
    }

    public class TextViewHolder extends FreeViewHolder {

        public TextViewHolder(View itemView) {
            super(itemView);
        }
    }

    public class ImageViewHolder extends FreeViewHolder {

        public ImageViewHolder(View itemView) {
            super(itemView);
        }
    }

    public class VoiceViewHolder extends FreeViewHolder {

        public VoiceViewHolder(View itemView) {
            super(itemView);
        }
    }
}

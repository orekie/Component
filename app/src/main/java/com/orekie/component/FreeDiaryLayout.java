package com.orekie.component;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.orekie.component.diary.DiaryComponent;
import com.orekie.component.diary.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class FreeDiaryLayout extends RecyclerView {
    private List<DiaryComponent> dataSet;

    public FreeDiaryLayout(Context context) {
        super(context);
    }

    public FreeDiaryLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FreeDiaryLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void initEdit() {
        this.dataSet = new ArrayList<>();
        dataSet.add(new TextComponent());
        this.setAdapter(new FreeAdapter(getContext(), dataSet));
        this.setLayoutManager(new LinearLayoutManager(getContext(), VERTICAL, false));
    }

}

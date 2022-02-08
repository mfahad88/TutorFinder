package com.example.tutorfinder.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tutorfinder.R;

public class CustomRecyclerview extends RecyclerView {
    private int spacing;
    public CustomRecyclerview(@NonNull Context context) {
        super(context);

    }

    public CustomRecyclerview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setDivider(attrs);
    }

    public CustomRecyclerview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setDivider(AttributeSet attrs){
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.CustomRecyclerview, 0, 0);
        try {
            spacing=a.getInteger(R.styleable.CustomRecyclerview_setSize,0);
            addItemDecoration(new ItemDecoration() {
                @Override
                public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull State state) {
                    super.getItemOffsets(outRect, view, parent, state);

                    outRect.set(0, 0, 0, spacing);
                }
            });
        }finally {
            a.recycle();
        }
    }
}

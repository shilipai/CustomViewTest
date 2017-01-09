package com.lxs.customviewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/1/5 15:33.
 */

public class CustomTextView extends TextView {
    private Paint mPaint1, mPaint2;

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint1 = new Paint();
        mPaint1.setColor(Color.BLUE);
        getResources().getColor(R.color.colorAccent);//过时
        ContextCompat.getColor(context,R.color.colorAccent);//替代
        mPaint1.setStyle(Paint.Style.FILL);

        mPaint2 = new Paint();
        mPaint2.setColor(Color.GREEN);
        mPaint2.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(
                0,
                0,
                getMeasuredWidth(),
                getMeasuredHeight(),
                mPaint1
        );
        canvas.drawRect(
                10,
                10,
                getMeasuredWidth() - 10,
                getMeasuredHeight() - 10,
                mPaint2
        );
//        canvas.save();
//        canvas.translate(10, 0);
        super.onDraw(canvas);
//        canvas.restore();
    }
}

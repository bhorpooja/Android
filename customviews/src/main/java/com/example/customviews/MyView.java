package com.example.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by pooja on 4/10/17.
 */

public class MyView extends android.support.v7.widget.AppCompatTextView {

    public Paint paint;
    public MyView(Context context) {
        super(context);
        paint = new Paint();
        paint.setStrokeWidth(5.0f);
        paint.setColor(Color.RED);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
//        paint = new Paint();
//        paint.setStrokeWidth(5.0f);
//        paint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
        for (int i = 10; i < 500; i += 50) {
            canvas.drawLine(10, i, getWidth(), i, paint);
        }
        paint.setColor(Color.RED);
        canvas.drawLine(100, 0, 100, getHeight(), paint);
      //  canvas.drawLine(10,10,getWidth(),10,paint);
    }
}

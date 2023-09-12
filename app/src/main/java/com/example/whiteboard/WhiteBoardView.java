package com.example.whiteboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class WhiteBoardView extends View {

    Canvas canvas;
    public WhiteBoardView(Context whiteBoardActivity) {
        super(whiteBoardActivity);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        paint.setTextSize(40);

        System.out.println("------------->");
        System.out.println(getLeft());
        System.out.println(getRight());
        System.out.println(getTop());
        System.out.println(getBottom());
        System.out.println("------------->");
        canvas.drawRect(360, 705, 500, 900, paint);
        canvas.drawText("hello there!", 200, 200, paint);
        canvas.drawLine(100, 100, 360, 705, paint);
        canvas.drawCircle(100, 100, 10, paint);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        System.out.printf("from view X: %d, Y: %d\n", x, y);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        this.canvas.drawCircle(x, y, 100, paint);
        invalidate();

        return false;
    }
}

/***
 * Draw
 * 1. Rectangles - done
 * 2. circles - done
 * 3. lines - done
 */

package com.example.pr27_aubovsergey_pr_21102;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;

    public Draw2D(Context context) {
        super(context);
        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.plane);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.CYAN);
        canvas.drawPaint(mPaint);

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
        // canvas.drawCircle(950, 30, 25, mPaint);

        //Белокрылые лошадки (облака)
        canvas.drawCircle(width - 500, 500, 120, mPaint);
        canvas.drawCircle(width - 650, 600, 150, mPaint);
        canvas.drawCircle(width - 300, 600, 120, mPaint);
        canvas.drawCircle(width - 450, 630, 120, mPaint);

        canvas.drawCircle(width - 1200, 1000, 120, mPaint);
        canvas.drawCircle(width - 980, 1000, 150, mPaint);
        canvas.drawCircle(width - 800, 1000, 120, mPaint);
        canvas.drawCircle(width - 900, 900, 120, mPaint);
        canvas.drawCircle(width - 1080, 900, 160, mPaint);

        //А это вообще только под определенным ракурсом видно

        canvas.drawCircle(width - 2200, 700, 120, mPaint);
        canvas.drawCircle(width - 1980, 700, 150, mPaint);
        canvas.drawCircle(width - 1800, 700, 120, mPaint);
        canvas.drawCircle(width - 1900, 600, 120, mPaint);
        canvas.drawCircle(width - 2080, 600, 160, mPaint);

        mPaint.setColor(Color.GREEN);

        canvas.drawRect(0, canvas.getHeight() - 50, width, height, mPaint);

        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 1000, mPaint);
    }
}


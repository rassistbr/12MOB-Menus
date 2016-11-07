package com.example.rm31675.menus;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.nio.InvalidMarkException;

public class CanvasActivity extends AppCompatActivity {

    private ImageView imgCanvas;
    private boolean blnStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        imgCanvas  = (ImageView) findViewById(R.id.imgCanvas);
        desenharNormal();
    }

    public void desenharNormal(){
        Bitmap bmp = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmp);

        Paint p = new Paint();
        p.setColor (Color.YELLOW);

        Paint p2 = new Paint();
        p2.setColor(Color.BLACK);

        c.drawCircle(50,50,30,p);
        c.drawLine(40,70,60,70,p2);
        c.drawCircle(40,40,5,p2);
        if(blnStatus) {
            c.drawCircle(60, 40, 5, p2);
        }
        else {
            c.drawLine(40, 70, 60, 70, p2);
            blnStatus = true;
        }
        imgCanvas.setImageBitmap(bmp);
    }
}


package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    private Animation slideinright, slideoutleft;
    GestureDetector detector;
    Button coffbtn, resbtn, barbtn, sodbtn;
    ViewFlipper slides;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        coffbtn=(Button)findViewById(R.id.coffbutton);
        slideinright = AnimationUtils.loadAnimation(this, R.anim.slideinright);
        slideoutleft = AnimationUtils.loadAnimation(this, R.anim.slideoutleft);
        coffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                v.startAnimation(buttonClick);
                Intent i = new Intent(getApplicationContext(),coffeactivity.class);
                startActivity(i);
            }
        });
        resbtn=(Button)findViewById(R.id.resbutton);
        resbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                v.startAnimation(buttonClick);
                Intent i = new Intent(getApplicationContext(),resActivity.class);
                startActivity(i);
            }
        });
        barbtn=(Button)findViewById(R.id.barbutton);
        barbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                v.startAnimation(buttonClick);
                Intent i = new Intent(getApplicationContext(),BarActivity.class);
                startActivity(i);
            }
        });
        sodbtn=(Button)findViewById(R.id.sodbutton);
        sodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                v.startAnimation(buttonClick);
                Intent i = new Intent(getApplicationContext(),sodActivity.class);
                startActivity(i);
            }
        });
        slides = (ViewFlipper)findViewById(R.id.slideshow);
        slides.setInAnimation(slideinright);
        slides.setOutAnimation(slideoutleft);
        slides.setAutoStart(true);
        slides.setFlipInterval(5000);
        slides.startFlipping();
    }
}
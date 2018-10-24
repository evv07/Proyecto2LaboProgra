package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    Button coffbtn, resbtn, barbtn, sodbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        coffbtn=(Button)findViewById(R.id.coffbutton);
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
    }
}

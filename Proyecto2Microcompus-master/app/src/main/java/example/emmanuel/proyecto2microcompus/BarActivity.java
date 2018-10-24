package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

public class BarActivity extends AppCompatActivity {


    public static double Latitud;
    public static double Longitud;
    public static String SnippetRestaurante;
    public static String NombreRestaurante;
    public static String NombreLogo;
    public static String NombrePin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.bartoolbar);
        setSupportActionBar(toolbar);

        final RelativeLayout TextViewCacciosLatina  = (RelativeLayout) this.findViewById(R.id.BcacciosButton);
        final RelativeLayout TextViewFitos = (RelativeLayout) this.findViewById(R.id.BfitosButton);
        final RelativeLayout TextViewHooters  = (RelativeLayout) this.findViewById(R.id.BhootersButton);

        TextViewCacciosLatina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Caccios Latina";
                SnippetRestaurante = "Los mejores olafos";
                NombreLogo = "logocaccios";
                NombrePin = "pinbares";
                Latitud = 9.93316439764063;
                Longitud = -84.0450668334961;
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("NombreRest",NombreRestaurante);
                i.putExtra("SnippetRest",SnippetRestaurante);
                i.putExtra("NombreLogoRest",NombreLogo);
                i.putExtra("NombrePin",NombrePin);
                i.putExtra("Latitud",Latitud);
                i.putExtra("Longitud",Longitud);
                startActivity(i);
            }
        });

        TextViewFitos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Fitos";
                SnippetRestaurante = "Las mejores bocas";
                NombreLogo = "logofitos";
                NombrePin = "pinbares";
                Latitud = 9.93387773733445;
                Longitud = -84.0521049499512;
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("NombreRest",NombreRestaurante);
                i.putExtra("SnippetRest",SnippetRestaurante);
                i.putExtra("NombreLogoRest",NombreLogo);
                i.putExtra("NombrePin",NombrePin);
                i.putExtra("Latitud",Latitud);
                i.putExtra("Longitud",Longitud);
                startActivity(i);
            }
        });

        TextViewHooters.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Hooters";
                SnippetRestaurante = "Las mejores alitas";
                NombreLogo = "logohooters";
                NombrePin = "pinbares";
                Latitud = 9.9370851047;
                Longitud = -84.0545672178;
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("NombreRest",NombreRestaurante);
                i.putExtra("SnippetRest",SnippetRestaurante);
                i.putExtra("NombreLogoRest",NombreLogo);
                i.putExtra("NombrePin",NombrePin);
                i.putExtra("Latitud",Latitud);
                i.putExtra("Longitud",Longitud);
                startActivity(i);
            }
        });
    }
}

package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

public class sodActivity extends AppCompatActivity {

    public static double Latitud;
    public static double Longitud;
    public static String SnippetRestaurante;
    public static String NombreRestaurante;
    public static String NombreLogo;
    public static String NombrePin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sod);
        Toolbar toolbar = (Toolbar) findViewById(R.id.sodtoolbar);
        setSupportActionBar(toolbar);

        final RelativeLayout TextViewSodaGenerales = (RelativeLayout) this.findViewById(R.id.SgeneralesButton);
        final RelativeLayout TextViewSodaEducacion = (RelativeLayout) this.findViewById(R.id.SeducaButton);
        final RelativeLayout TextViewSodaSociales  = (RelativeLayout) this.findViewById(R.id.SsocialesButton);

        TextViewSodaGenerales.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Generales";
                SnippetRestaurante = "Los mejores maduritos";
                NombreLogo = "logogenerales";
                NombrePin = "pinsodas";
                Latitud = 9.93606001873945;
                Longitud = -84.050458073616;
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

        TextViewSodaEducacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Educación";
                SnippetRestaurante = "Los mejores casados";
                NombreLogo = "logoeducacion";
                NombrePin = "pinsodas";
                Latitud = 9.93601774708295;
                Longitud = -84.0486824512482;
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

        TextViewSodaSociales.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Sociales";
                SnippetRestaurante = "Los mejores burritos";
                NombreLogo = "logosociales";
                NombrePin = "pinsodas";
                Latitud = 9.9376610537068;
                Longitud = -84.0426903963089;
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

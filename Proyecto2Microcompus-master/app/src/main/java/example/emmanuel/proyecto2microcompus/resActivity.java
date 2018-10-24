package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class resActivity extends AppCompatActivity {


    public static double Latitud;
    public static double Longitud;
    public static String SnippetRestaurante;
    public static String NombreRestaurante;
    public static String NombreLogo;
    public static String NombrePin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        Toolbar toolbar = (Toolbar) findViewById(R.id.restoolbar);
        setSupportActionBar(toolbar);


        final RelativeLayout TextViewPataconeria  = (RelativeLayout) this.findViewById(R.id.RpataconeriaButton);
        final RelativeLayout TextViewMantras  = (RelativeLayout) this.findViewById(R.id.RmantraButton);
        final RelativeLayout TextViewSaulBistro  = (RelativeLayout) this.findViewById(R.id.RsaulbistroButton);

        TextViewPataconeria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Pataconería";
                SnippetRestaurante = "Los mejores patacones";
                NombreLogo = "logopataconeria";
                NombrePin = "pinrestaurantes";
                Latitud = 9.93160032886846;
                Longitud = -84.0450829267502;
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

        TextViewSaulBistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Saúl Bistro";
                SnippetRestaurante = "Las mejores crepas";
                NombreLogo = "logosaulbistro";
                NombrePin = "pinrestaurantes";
                Latitud = 9.93619211763075;
                Longitud = -84.06414270401;
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

        TextViewMantras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Mantras";
                SnippetRestaurante = "La mejor comida vegetariana";
                NombreLogo = "logomantras";
                NombrePin = "pinrestaurantes";
                Latitud = 9.93686846311843;
                Longitud = -84.0620881319046;
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



    public void MapsActivity(View view){

        Intent GoToMapsActivity = new Intent(this, MapsActivity.class);
        startActivity(GoToMapsActivity);
    }
}

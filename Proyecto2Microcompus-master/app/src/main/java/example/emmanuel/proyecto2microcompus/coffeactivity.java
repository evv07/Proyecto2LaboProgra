package example.emmanuel.proyecto2microcompus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

public class coffeactivity extends AppCompatActivity {

    public static double Latitud;
    public static double Longitud;
    public static String SnippetRestaurante;
    public static String NombreRestaurante;
    public static String NombreLogo;
    public static String NombrePin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.cofftoolbar);
        setSupportActionBar(toolbar);

        final RelativeLayout TextViewCafeSpoon = (RelativeLayout) this.findViewById(R.id.CspoonButton);
        final RelativeLayout TextViewCafeKracovia = (RelativeLayout) this.findViewById(R.id.CkracButton);
        final RelativeLayout TextViewCafeMiel  = (RelativeLayout) this.findViewById(R.id.CmielButton);

        TextViewCafeSpoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Spoon";
                SnippetRestaurante = "Los mejores postres";
                NombreLogo = "cspoon";
                NombrePin = "pincafes";
                Latitud = 9.93867556685683;
                Longitud = -84.0554523468018;
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

        TextViewCafeKracovia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Kracovia";
                SnippetRestaurante = "Las mejores cafés";
                NombreLogo = "ckrac";
                NombrePin = "pincafes";
                Latitud = 9.93775088051896;
                Longitud = -84.0539610385895;
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

        TextViewCafeMiel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                NombreRestaurante = "Café Miel";
                SnippetRestaurante = "Los mejores queques";
                NombreLogo = "cmiel";
                NombrePin = "pincafes";
                Latitud = 9.9373849;
                Longitud = -84.0725813;
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

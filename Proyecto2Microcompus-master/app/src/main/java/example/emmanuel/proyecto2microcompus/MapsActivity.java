package example.emmanuel.proyecto2microcompus;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        Toast toast = Toast.makeText(MapsActivity.this,"Para navegar al restaurante, toque el pin", Toast.LENGTH_LONG);
        for(int i = 0 ; i<100 ; i++){
            toast.show();
        }

        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        Bundle extras = getIntent().getExtras();


        Marker marker;

        //LatLng posicion = new LatLng(9.93160032886846, -84.0450829267502);
        LatLng posicionRest = new LatLng(extras.getDouble("Latitud"),extras.getDouble("Longitud"));

        MarkerOptions options = new MarkerOptions().position(posicionRest);
        Bitmap bitmap = createUserBitmap();
        if(bitmap!=null){
            options.title(extras.getString("NombreRest"));
            options.icon(BitmapDescriptorFactory.fromBitmap(bitmap));
            options.anchor(0.5f, 0.5f);
            options.snippet(extras.getString("SnippetRest"));
            marker = mMap.addMarker(options);
            marker.showInfoWindow();
            mMap.moveCamera(CameraUpdateFactory.newLatLng(posicionRest));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);
        }
    }

    public int dp(float value) {
        if (value == 0) {
            return 0;
        }
        return (int) Math.ceil(getResources().getDisplayMetrics().density * value);
    }

    private Bitmap createUserBitmap() {
        Bundle extras = getIntent().getExtras();

        Bitmap result = null;
        try {
            result = Bitmap.createBitmap(dp(72) , dp(96), Bitmap.Config.ARGB_8888);
            result.eraseColor(Color.TRANSPARENT);
            Canvas canvas = new Canvas(result);

            Resources res = this.getResources();
            int resIDPin = res.getIdentifier(extras.getString("NombrePin"), "drawable", this.getPackageName());

            Drawable drawable = getResources().getDrawable(resIDPin);
            //Drawable drawable = getResources().getDrawable(R.drawable.pinsodas);

            drawable.setBounds(0, 0, dp(72), dp(96));
            drawable.draw(canvas);

            Paint roundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
            RectF bitmapRect = new RectF();
            canvas.save();

            Resources res1 = this.getResources();
            int resID = res1.getIdentifier(extras.getString("NombreLogoRest"), "drawable", this.getPackageName());
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), resID);

            if (bitmap != null) {
                BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                float scale = dp(45) / (float) bitmap.getWidth();
                matrix.postTranslate(200, 200);
                matrix.postScale(scale, scale);
                roundPaint.setShader(shader);
                shader.setLocalMatrix(matrix);
                bitmapRect.set(dp(8), dp(5), dp(52+5), dp(52+5));
                canvas.drawRoundRect(bitmapRect, dp(56), dp(56), roundPaint);
            }
            canvas.restore();
            try {
                canvas.setBitmap(null);
            } catch (Exception e) {}
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return result;
    }
}
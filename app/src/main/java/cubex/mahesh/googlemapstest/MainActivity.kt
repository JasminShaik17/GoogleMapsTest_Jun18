package cubex.mahesh.googlemapstest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sFrag:SupportMapFragment =
 supportFragmentManager.findFragmentById(R.id.frag1)
         as SupportMapFragment

        sFrag.getMapAsync(object : OnMapReadyCallback {
            override fun onMapReady(gMap: GoogleMap?) {

                Toast.makeText(this@MainActivity,
                        "Map is Ready...",
                        Toast.LENGTH_LONG).show()

                var options = MarkerOptions( )
                options.position(LatLng(17.4373252,78.4494391))
                options.title("NareshIT - New Block")
                options.icon(BitmapDescriptorFactory.fromResource(
                                    R.drawable.truck))
                gMap?.addMarker(options)
                gMap?.animateCamera(CameraUpdateFactory.
              newLatLngZoom(LatLng(17.4373252,78.4494391),14f))
            }
        })

    }
}

package nttvn.dn.justlikeme.fragment;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import nttvn.dn.justlikeme.R;
import nttvn.dn.justlikeme.helper.AppValue;

public class FragmentMaps extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public FragmentMaps() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_person_map, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MapFragment mapFragment = (MapFragment) getActivity().getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onResume() {
        super.onResume();

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
        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            //Set Mylocation Enable
            mMap.setMyLocationEnabled(true);

            //Get current location
            LocationManager service = (LocationManager) getActivity().getSystemService(getActivity().LOCATION_SERVICE);

            Criteria criteria = new Criteria();
            String provider = service.getBestProvider(criteria, false);
            Location location = service.getLastKnownLocation(provider);
            LatLng curLocation = new LatLng(location.getLatitude(), location.getLongitude());

            //Animate Camera to mylocation
            //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(curLocation, 20.0f));

            service.requestLocationUpdates(LocationManager.GPS_PROVIDER, 100, 1, new android.location.LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    if (mMap != null && ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {
                        //Set Mylocation Enable
                        mMap.setMyLocationEnabled(true);
                        Toast.makeText(getActivity(), String.valueOf(location.getLatitude()) + "===" + String.valueOf(location.getLongitude()), Toast.LENGTH_SHORT).show();
                        LatLng curLocation = new LatLng(location.getLatitude(), location.getLongitude());
                        //Animate Camera to mylocation
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(curLocation, 18.0f));
                    }
                    Snackbar.make(getView(), "Location changed", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                    double[] local = new double[2];
                    local[0] = location.getLatitude();
                    local[1] = location.getLongitude();
                    AppValue.getInstance().setLocation(local);
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }
            });
        }

        Snackbar.make(getView(), "Loaded onMapReady", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

        MarkerOptions mp = new MarkerOptions();
        //mp.position(new LatLng(location.getLatitude(), location.getLongitude()));
        mp.position(new LatLng(16.0609723, 108.2161258));
        //mp.icon(BitmapDescriptorFactory.fromResource(R.)));
        mp.title("??y l? khu v?c c?m nghe ku");
        mp.snippet("Coi ch?ng m?t m?ng ??. Ta ?? th? v? ch?t t?i ??y ^^");
        mMap.addMarker(mp);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(16.0609743, 108.2161258), 20.0f));

    }

}

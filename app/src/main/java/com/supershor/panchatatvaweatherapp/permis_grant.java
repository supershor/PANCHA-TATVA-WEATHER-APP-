package com.supershor.panchatatvaweatherapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class permis_grant extends AppCompatActivity {
    AppCompatButton butt;
    SharedPreferences.Editor editor;
    LottieAnimationView errorballon;
    FusedLocationProviderClient fusedLocationClient;
    Intent intent;
    LottieAnimationView loadinglottie;
    LocationManager locationManager;
    SharedPreferences sharedPreferences;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permis_grant);
        this.loadinglottie = (LottieAnimationView) findViewById(R.id.loading_lottie);
        SharedPreferences sharedPreferences = getSharedPreferences("locations", 0);
        this.sharedPreferences = sharedPreferences;
        this.editor = sharedPreferences.edit();
        this.butt = (AppCompatButton) findViewById(R.id.allowbutton);
        this.errorballon = (LottieAnimationView) findViewById(R.id.errorballon);
        this.locationManager = (LocationManager) getSystemService("gps");
        this.fusedLocationClient = LocationServices.getFusedLocationProviderClient((Activity) this);
        this.intent = new Intent(this, MainActivity.class);
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            permis_grant.this.butt.setVisibility(View.GONE);
            finalCall();
        }
        this.butt.setOnClickListener(new View.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                permis_grant.this.requestPermission1();
            }
        });
    }

    public void buildAlertMessageNoGps() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                permis_grant.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    @SuppressLint("MissingPermission")
    public void finalCall() {
        this.fusedLocationClient.getCurrentLocation(100, (CancellationToken) null).addOnSuccessListener(new OnSuccessListener<Location>() { // from class: com.apify.panch_tatva.permis_grant.4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Location location) {
                if (location != null) {
                    Log.d("ans loc 1", location.getLatitude() + " , " + location.getLongitude());
                    permis_grant.this.editor.clear();
                    permis_grant.this.editor.putString("getLatitude", location.getLatitude() + "");
                    permis_grant.this.editor.putString("getLongitude", location.getLongitude() + "");
                    Geocoder geocoder = new Geocoder(permis_grant.this, Locale.getDefault());
                    try {
                        Log.d("ans geo1", "1");
                        List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        Log.d("ans city", fromLocation.get(0).getLocality() + " ,1 " + fromLocation.get(0).getAdminArea() + " ,2 " + fromLocation.get(0).getCountryName());
                        permis_grant.this.editor.putString("locality", fromLocation.get(0).getLocality().toString());
                        Log.d("ans geo", fromLocation.get(0).getAddressLine(0) + " ,1 " + fromLocation.get(0).getAddressLine(1) + " ,2 " + fromLocation.get(0).getAddressLine(2));
                        permis_grant.this.editor.commit();
                        permis_grant permis_grantVar = permis_grant.this;
                        permis_grantVar.startActivity(permis_grantVar.intent);
                        permis_grant.this.finish();
                        Log.d("ans loc 2", permis_grant.this.sharedPreferences.getString("getLatitude", null) + " , " + permis_grant.this.sharedPreferences.getString("getLongitude", null));
                        return;
                    } catch (IOException e) {
                        Log.d("ans geo1", "2");
                        throw new RuntimeException(e);
                    }
                }
                else {
                    permis_grant.this.buildAlertMessageNoGps();
                }
            }
        });
    }

    public void requestPermission1() {
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            requestPermission2();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION","android.permission.ACCESS_FINE_LOCATION"}, 100);
        }
    }

    public void requestPermission2() {
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            finalCall();
            permis_grant.this.butt.setVisibility(View.GONE);
            Log.d("ans req2", "finalhit");
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 100);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length > 0 && iArr[0] == 0) {
            requestPermission1();
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_COARSE_LOCATION")) {
            Log.d("ans", "reached");
            new AlertDialog.Builder(this).setMessage("We need to know your current location in order to provide weather information of your location. Please allow the location permissions using app settings.").setTitle("Permission required").setCancelable(false).setPositiveButton("ALLOW", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", permis_grant.this.getPackageName(), null));
                    permis_grant.this.startActivity(intent);
                    dialogInterface.dismiss();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    permis_grant.this.finish();
                }
            }).show();
        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            Log.d("ans", "reached");
            new AlertDialog.Builder(this).setMessage("We need to know your current location in order to provide weather information of your location. Please allow the location permissions using app settings.").setTitle("Permission required").setCancelable(false).setPositiveButton("ALLOW", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.8
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", permis_grant.this.getPackageName(), null));
                    permis_grant.this.startActivity(intent);
                    dialogInterface.dismiss();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.apify.panch_tatva.permis_grant.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    permis_grant.this.finish();
                }
            }).show();
        } else {
            requestPermission1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        finalCall();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finalCall();
    }
}
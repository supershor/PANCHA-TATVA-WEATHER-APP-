package com.supershor.panchatatvaweatherapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.net.MailTo;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class MainActivity extends AppCompatActivity {
    TextView all_1_7_date;
    TextView all_1_7_max_temp;
    TextView all_1_7_min_temp;
    TextView all_1_7_rain;
    TextView all_1_7_shower;
    TextView all_1_7_snowfall;
    TextView all_1_7_sunrise;
    TextView all_1_7_sunset;
    TextView all_1_7_uv;
    ImageView all_1_7_weather;
    TextView all_2_7_date;
    TextView all_2_7_max_temp;
    TextView all_2_7_min_temp;
    TextView all_2_7_rain;
    TextView all_2_7_shower;
    TextView all_2_7_snowfall;
    TextView all_2_7_sunrise;
    TextView all_2_7_sunset;
    TextView all_2_7_uv;
    ImageView all_2_7_weather;
    TextView all_3_7_date;
    TextView all_3_7_max_temp;
    TextView all_3_7_min_temp;
    TextView all_3_7_rain;
    TextView all_3_7_shower;
    TextView all_3_7_snowfall;
    TextView all_3_7_sunrise;
    TextView all_3_7_sunset;
    TextView all_3_7_uv;
    ImageView all_3_7_weather;
    TextView all_4_7_date;
    TextView all_4_7_max_temp;
    TextView all_4_7_min_temp;
    TextView all_4_7_rain;
    TextView all_4_7_shower;
    TextView all_4_7_snowfall;
    TextView all_4_7_sunrise;
    TextView all_4_7_sunset;
    TextView all_4_7_uv;
    ImageView all_4_7_weather;
    TextView all_5_7_date;
    TextView all_5_7_max_temp;
    TextView all_5_7_min_temp;
    TextView all_5_7_rain;
    TextView all_5_7_shower;
    TextView all_5_7_snowfall;
    TextView all_5_7_sunrise;
    TextView all_5_7_sunset;
    TextView all_5_7_uv;
    ImageView all_5_7_weather;
    TextView all_6_7_date;
    TextView all_6_7_max_temp;
    TextView all_6_7_min_temp;
    TextView all_6_7_rain;
    TextView all_6_7_shower;
    TextView all_6_7_snowfall;
    TextView all_6_7_sunrise;
    TextView all_6_7_sunset;
    TextView all_6_7_uv;
    ImageView all_6_7_weather;
    TextView all_7_7_date;
    TextView all_7_7_max_temp;
    TextView all_7_7_min_temp;
    TextView all_7_7_rain;
    TextView all_7_7_shower;
    TextView all_7_7_snowfall;
    TextView all_7_7_sunrise;
    TextView all_7_7_sunset;
    TextView all_7_7_uv;
    ImageView all_7_7_weather;
    TextView current_amonia_at_all_current;
    TextView current_cloud_cover_at_all_current;
    TextView current_co_at_all_current;
    TextView current_dust_at_all_current;
    TextView current_humidity_at_all_current;
    TextView current_nitrogen_at_all_current;
    TextView current_ozone_at_all_current;
    TextView current_pm10_at_all_current;
    TextView current_pm2_at_all_current;
    TextView current_rain_at_all_current;
    TextView current_showers_at_all_current;
    TextView current_snow_at_all_current;
    TextView current_sulphur_at_all_current;
    TextView current_sunrise_time;
    TextView current_sunset_time;
    TextView current_temp_at_all_current;
    TextView current_wind_direction_at_all_current;
    TextView current_wind_speed_at_all_current;
    GraphView graphView;
    LottieAnimationView lottieAnimationView1;
    LottieAnimationView lottiedark;
    LottieAnimationView lottielight;
    TextView max_temp_day_1;
    TextView max_temp_day_10;
    TextView max_temp_day_11;
    TextView max_temp_day_12;
    TextView max_temp_day_13;
    TextView max_temp_day_14;
    TextView max_temp_day_15;
    TextView max_temp_day_16;
    TextView max_temp_day_17;
    TextView max_temp_day_18;
    TextView max_temp_day_19;
    TextView max_temp_day_2;
    TextView max_temp_day_20;
    TextView max_temp_day_21;
    TextView max_temp_day_22;
    TextView max_temp_day_23;
    TextView max_temp_day_24;
    TextView max_temp_day_3;
    TextView max_temp_day_4;
    TextView max_temp_day_5;
    TextView max_temp_day_6;
    TextView max_temp_day_7;
    TextView max_temp_day_8;
    TextView max_temp_day_9;
    NestedScrollView nestedScrollView;
    TextView rain_day_1;
    TextView rain_day_10;
    TextView rain_day_11;
    TextView rain_day_12;
    TextView rain_day_13;
    TextView rain_day_14;
    TextView rain_day_15;
    TextView rain_day_16;
    TextView rain_day_17;
    TextView rain_day_18;
    TextView rain_day_19;
    TextView rain_day_2;
    TextView rain_day_20;
    TextView rain_day_21;
    TextView rain_day_22;
    TextView rain_day_23;
    TextView rain_day_24;
    TextView rain_day_3;
    TextView rain_day_4;
    TextView rain_day_5;
    TextView rain_day_6;
    TextView rain_day_7;
    TextView rain_day_8;
    TextView rain_day_9;
    SharedPreferences sharedPreferences;
    TextView showers_day_1;
    TextView showers_day_10;
    TextView showers_day_11;
    TextView showers_day_12;
    TextView showers_day_13;
    TextView showers_day_14;
    TextView showers_day_15;
    TextView showers_day_16;
    TextView showers_day_17;
    TextView showers_day_18;
    TextView showers_day_19;
    TextView showers_day_2;
    TextView showers_day_20;
    TextView showers_day_21;
    TextView showers_day_22;
    TextView showers_day_23;
    TextView showers_day_24;
    TextView showers_day_3;
    TextView showers_day_4;
    TextView showers_day_5;
    TextView showers_day_6;
    TextView showers_day_7;
    TextView showers_day_8;
    TextView showers_day_9;
    TextView snowfall_day_1;
    TextView snowfall_day_10;
    TextView snowfall_day_11;
    TextView snowfall_day_12;
    TextView snowfall_day_13;
    TextView snowfall_day_14;
    TextView snowfall_day_15;
    TextView snowfall_day_16;
    TextView snowfall_day_17;
    TextView snowfall_day_18;
    TextView snowfall_day_19;
    TextView snowfall_day_2;
    TextView snowfall_day_20;
    TextView snowfall_day_21;
    TextView snowfall_day_22;
    TextView snowfall_day_23;
    TextView snowfall_day_24;
    TextView snowfall_day_3;
    TextView snowfall_day_4;
    TextView snowfall_day_5;
    TextView snowfall_day_6;
    TextView snowfall_day_7;
    TextView snowfall_day_8;
    TextView snowfall_day_9;
    TextView temp_at_main;
    TextView timing_day_1;
    TextView timing_day_10;
    TextView timing_day_11;
    TextView timing_day_12;
    TextView timing_day_13;
    TextView timing_day_14;
    TextView timing_day_15;
    TextView timing_day_16;
    TextView timing_day_17;
    TextView timing_day_18;
    TextView timing_day_19;
    TextView timing_day_2;
    TextView timing_day_20;
    TextView timing_day_21;
    TextView timing_day_22;
    TextView timing_day_23;
    TextView timing_day_24;
    TextView timing_day_3;
    TextView timing_day_4;
    TextView timing_day_5;
    TextView timing_day_6;
    TextView timing_day_7;
    TextView timing_day_8;
    TextView timing_day_9;
    Toolbar toolbar;
    TextView uv_day_1;
    TextView uv_day_10;
    TextView uv_day_11;
    TextView uv_day_12;
    TextView uv_day_13;
    TextView uv_day_14;
    TextView uv_day_15;
    TextView uv_day_16;
    TextView uv_day_17;
    TextView uv_day_18;
    TextView uv_day_19;
    TextView uv_day_2;
    TextView uv_day_20;
    TextView uv_day_21;
    TextView uv_day_22;
    TextView uv_day_23;
    TextView uv_day_24;
    TextView uv_day_3;
    TextView uv_day_4;
    TextView uv_day_5;
    TextView uv_day_6;
    TextView uv_day_7;
    TextView uv_day_8;
    TextView uv_day_9;
    TextView weather_at_main;
    ImageView weather_day_1;
    ImageView weather_day_10;
    ImageView weather_day_11;
    ImageView weather_day_12;
    ImageView weather_day_13;
    ImageView weather_day_14;
    ImageView weather_day_15;
    ImageView weather_day_16;
    ImageView weather_day_17;
    ImageView weather_day_18;
    ImageView weather_day_19;
    ImageView weather_day_2;
    ImageView weather_day_20;
    ImageView weather_day_21;
    ImageView weather_day_22;
    ImageView weather_day_23;
    ImageView weather_day_24;
    ImageView weather_day_3;
    ImageView weather_day_4;
    ImageView weather_day_5;
    ImageView weather_day_6;
    ImageView weather_day_7;
    ImageView weather_day_8;
    ImageView weather_day_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.lottielight = (LottieAnimationView) findViewById(R.id.lottie1);
        this.lottiedark = (LottieAnimationView) findViewById(R.id.lottie2);
        this.lottieAnimationView1 = (LottieAnimationView) findViewById(R.id.errorballon);
        this.nestedScrollView = (NestedScrollView) findViewById(R.id.nestedscrool);
        this.toolbar = (Toolbar) findViewById(R.id.toolsbar);
        this.temp_at_main = (TextView) findViewById(R.id.current_temp_at_front);
        this.weather_at_main = (TextView) findViewById(R.id.current_weather_type_at_front);
        this.timing_day_1 = (TextView) findViewById(R.id.timing_day_1);
        this.weather_day_1 = (ImageView) findViewById(R.id.weather_type_day_1);
        this.weather_day_2 = (ImageView) findViewById(R.id.weather_type_day_2);
        this.weather_day_3 = (ImageView) findViewById(R.id.weather_type_day_3);
        this.weather_day_4 = (ImageView) findViewById(R.id.weather_type_day_4);
        this.weather_day_5 = (ImageView) findViewById(R.id.weather_type_day_5);
        this.weather_day_6 = (ImageView) findViewById(R.id.weather_type_day_6);
        this.weather_day_8 = (ImageView) findViewById(R.id.weather_type_day_8);
        this.weather_day_7 = (ImageView) findViewById(R.id.weather_type_day_7);
        this.all_1_7_weather = (ImageView) findViewById(R.id.all_1_7_weather);
        this.all_2_7_weather = (ImageView) findViewById(R.id.all_2_7_weather);
        this.all_3_7_weather = (ImageView) findViewById(R.id.all_3_7_weather);
        this.all_4_7_weather = (ImageView) findViewById(R.id.all_4_7_weather);
        this.all_5_7_weather = (ImageView) findViewById(R.id.all_5_7_weather);
        this.all_6_7_weather = (ImageView) findViewById(R.id.all_6_7_weather);
        this.all_7_7_weather = (ImageView) findViewById(R.id.all_7_7_weather);
        this.weather_day_9 = (ImageView) findViewById(R.id.weather_type_day_9);
        this.weather_day_10 = (ImageView) findViewById(R.id.weather_type_day_10);
        this.weather_day_11 = (ImageView) findViewById(R.id.weather_type_day_11);
        this.weather_day_12 = (ImageView) findViewById(R.id.weather_type_day_12);
        this.weather_day_13 = (ImageView) findViewById(R.id.weather_type_day_13);
        this.weather_day_14 = (ImageView) findViewById(R.id.weather_type_day_14);
        this.weather_day_15 = (ImageView) findViewById(R.id.weather_type_day_15);
        this.weather_day_16 = (ImageView) findViewById(R.id.weather_type_day_16);
        this.weather_day_18 = (ImageView) findViewById(R.id.weather_type_day_18);
        this.weather_day_17 = (ImageView) findViewById(R.id.weather_type_day_17);
        this.weather_day_19 = (ImageView) findViewById(R.id.weather_type_day_19);
        this.weather_day_20 = (ImageView) findViewById(R.id.weather_type_day_20);
        this.weather_day_21 = (ImageView) findViewById(R.id.weather_type_day_21);
        this.weather_day_22 = (ImageView) findViewById(R.id.weather_type_day_22);
        this.weather_day_23 = (ImageView) findViewById(R.id.weather_type_day_23);
        this.weather_day_24 = (ImageView) findViewById(R.id.weather_type_day_24);
        this.max_temp_day_1 = (TextView) findViewById(R.id.max_temp_day_1);
        this.uv_day_1 = (TextView) findViewById(R.id.uv_day_1);
        this.rain_day_1 = (TextView) findViewById(R.id.rain_day_1);
        this.showers_day_1 = (TextView) findViewById(R.id.showers_day_1);
        this.snowfall_day_1 = (TextView) findViewById(R.id.snowfall_day_1);
        this.timing_day_2 = (TextView) findViewById(R.id.timing_day_2);
        this.max_temp_day_2 = (TextView) findViewById(R.id.max_temp_day_2);
        this.uv_day_2 = (TextView) findViewById(R.id.uv_day_2);
        this.rain_day_2 = (TextView) findViewById(R.id.rain_day_2);
        this.showers_day_2 = (TextView) findViewById(R.id.showers_day_2);
        this.snowfall_day_2 = (TextView) findViewById(R.id.snowfall_day_2);
        this.timing_day_3 = (TextView) findViewById(R.id.timing_day_3);
        this.max_temp_day_3 = (TextView) findViewById(R.id.max_temp_day_3);
        this.uv_day_3 = (TextView) findViewById(R.id.uv_day_3);
        this.rain_day_3 = (TextView) findViewById(R.id.rain_day_3);
        this.showers_day_3 = (TextView) findViewById(R.id.showers_day_3);
        this.snowfall_day_3 = (TextView) findViewById(R.id.snowfall_day_3);
        this.timing_day_4 = (TextView) findViewById(R.id.timing_day_4);
        this.max_temp_day_4 = (TextView) findViewById(R.id.max_temp_day_4);
        this.uv_day_4 = (TextView) findViewById(R.id.uv_day_4);
        this.rain_day_4 = (TextView) findViewById(R.id.rain_day_4);
        this.showers_day_4 = (TextView) findViewById(R.id.showers_day_4);
        this.snowfall_day_4 = (TextView) findViewById(R.id.snowfall_day_4);
        this.timing_day_5 = (TextView) findViewById(R.id.timing_day_5);
        this.max_temp_day_5 = (TextView) findViewById(R.id.max_temp_day_5);
        this.uv_day_5 = (TextView) findViewById(R.id.uv_day_5);
        this.rain_day_5 = (TextView) findViewById(R.id.rain_day_5);
        this.showers_day_5 = (TextView) findViewById(R.id.showers_day_5);
        this.snowfall_day_5 = (TextView) findViewById(R.id.snowfall_day_5);
        this.timing_day_6 = (TextView) findViewById(R.id.timing_day_6);
        this.max_temp_day_6 = (TextView) findViewById(R.id.max_temp_day_6);
        this.uv_day_6 = (TextView) findViewById(R.id.uv_day_6);
        this.rain_day_6 = (TextView) findViewById(R.id.rain_day_6);
        this.showers_day_6 = (TextView) findViewById(R.id.showers_day_6);
        this.snowfall_day_6 = (TextView) findViewById(R.id.snowfall_day_6);
        this.timing_day_7 = (TextView) findViewById(R.id.timing_day_7);
        this.max_temp_day_7 = (TextView) findViewById(R.id.max_temp_day_7);
        this.uv_day_7 = (TextView) findViewById(R.id.uv_day_7);
        this.rain_day_7 = (TextView) findViewById(R.id.rain_day_7);
        this.showers_day_7 = (TextView) findViewById(R.id.showers_day_7);
        this.snowfall_day_7 = (TextView) findViewById(R.id.snowfall_day_7);
        this.timing_day_8 = (TextView) findViewById(R.id.timing_day_8);
        this.max_temp_day_8 = (TextView) findViewById(R.id.max_temp_day_8);
        this.uv_day_8 = (TextView) findViewById(R.id.uv_day_8);
        this.rain_day_8 = (TextView) findViewById(R.id.rain_day_8);
        this.showers_day_8 = (TextView) findViewById(R.id.showers_day_8);
        this.snowfall_day_8 = (TextView) findViewById(R.id.snowfall_day_8);
        this.timing_day_9 = (TextView) findViewById(R.id.timing_day_9);
        this.max_temp_day_9 = (TextView) findViewById(R.id.max_temp_day_9);
        this.uv_day_9 = (TextView) findViewById(R.id.uv_day_9);
        this.rain_day_9 = (TextView) findViewById(R.id.rain_day_9);
        this.showers_day_9 = (TextView) findViewById(R.id.showers_day_9);
        this.snowfall_day_9 = (TextView) findViewById(R.id.snowfall_day_9);
        this.timing_day_10 = (TextView) findViewById(R.id.timing_day_10);
        this.max_temp_day_10 = (TextView) findViewById(R.id.max_temp_day_10);
        this.uv_day_10 = (TextView) findViewById(R.id.uv_day_10);
        this.rain_day_10 = (TextView) findViewById(R.id.rain_day_10);
        this.showers_day_10 = (TextView) findViewById(R.id.showers_day_10);
        this.snowfall_day_10 = (TextView) findViewById(R.id.snowfall_day_10);
        this.timing_day_11 = (TextView) findViewById(R.id.timing_day_11);
        this.max_temp_day_11 = (TextView) findViewById(R.id.max_temp_day_11);
        this.uv_day_11 = (TextView) findViewById(R.id.uv_day_11);
        this.rain_day_11 = (TextView) findViewById(R.id.rain_day_11);
        this.showers_day_11 = (TextView) findViewById(R.id.showers_day_11);
        this.snowfall_day_11 = (TextView) findViewById(R.id.snowfall_day_11);
        this.timing_day_12 = (TextView) findViewById(R.id.timing_day_12);
        this.max_temp_day_12 = (TextView) findViewById(R.id.max_temp_day_12);
        this.uv_day_12 = (TextView) findViewById(R.id.uv_day_12);
        this.rain_day_12 = (TextView) findViewById(R.id.rain_day_12);
        this.showers_day_12 = (TextView) findViewById(R.id.showers_day_12);
        this.snowfall_day_12 = (TextView) findViewById(R.id.snowfall_day_12);
        this.timing_day_13 = (TextView) findViewById(R.id.timing_day_13);
        this.max_temp_day_13 = (TextView) findViewById(R.id.max_temp_day_13);
        this.uv_day_13 = (TextView) findViewById(R.id.uv_day_13);
        this.rain_day_13 = (TextView) findViewById(R.id.rain_day_13);
        this.showers_day_13 = (TextView) findViewById(R.id.showers_day_13);
        this.snowfall_day_13 = (TextView) findViewById(R.id.snowfall_day_13);
        this.timing_day_14 = (TextView) findViewById(R.id.timing_day_14);
        this.max_temp_day_14 = (TextView) findViewById(R.id.max_temp_day_14);
        this.uv_day_14 = (TextView) findViewById(R.id.uv_day_14);
        this.rain_day_14 = (TextView) findViewById(R.id.rain_day_14);
        this.showers_day_14 = (TextView) findViewById(R.id.showers_day_14);
        this.snowfall_day_14 = (TextView) findViewById(R.id.snowfall_day_14);
        this.timing_day_15 = (TextView) findViewById(R.id.timing_day_15);
        this.max_temp_day_15 = (TextView) findViewById(R.id.max_temp_day_15);
        this.uv_day_15 = (TextView) findViewById(R.id.uv_day_15);
        this.rain_day_15 = (TextView) findViewById(R.id.rain_day_15);
        this.showers_day_15 = (TextView) findViewById(R.id.showers_day_15);
        this.snowfall_day_15 = (TextView) findViewById(R.id.snowfall_day_15);
        this.timing_day_16 = (TextView) findViewById(R.id.timing_day_16);
        this.max_temp_day_16 = (TextView) findViewById(R.id.max_temp_day_16);
        this.uv_day_16 = (TextView) findViewById(R.id.uv_day_16);
        this.rain_day_16 = (TextView) findViewById(R.id.rain_day_16);
        this.showers_day_16 = (TextView) findViewById(R.id.showers_day_16);
        this.snowfall_day_16 = (TextView) findViewById(R.id.snowfall_day_16);
        this.timing_day_17 = (TextView) findViewById(R.id.timing_day_17);
        this.max_temp_day_17 = (TextView) findViewById(R.id.max_temp_day_17);
        this.uv_day_17 = (TextView) findViewById(R.id.uv_day_17);
        this.rain_day_17 = (TextView) findViewById(R.id.rain_day_17);
        this.showers_day_17 = (TextView) findViewById(R.id.showers_day_17);
        this.snowfall_day_17 = (TextView) findViewById(R.id.snowfall_day_17);
        this.timing_day_18 = (TextView) findViewById(R.id.timing_day_18);
        this.max_temp_day_18 = (TextView) findViewById(R.id.max_temp_day_18);
        this.uv_day_18 = (TextView) findViewById(R.id.uv_day_18);
        this.rain_day_18 = (TextView) findViewById(R.id.rain_day_18);
        this.showers_day_18 = (TextView) findViewById(R.id.showers_day_18);
        this.snowfall_day_18 = (TextView) findViewById(R.id.snowfall_day_18);
        this.timing_day_19 = (TextView) findViewById(R.id.timing_day_19);
        this.max_temp_day_19 = (TextView) findViewById(R.id.max_temp_day_19);
        this.uv_day_19 = (TextView) findViewById(R.id.uv_day_19);
        this.rain_day_19 = (TextView) findViewById(R.id.rain_day_19);
        this.showers_day_19 = (TextView) findViewById(R.id.showers_day_19);
        this.snowfall_day_19 = (TextView) findViewById(R.id.snowfall_day_19);
        this.timing_day_20 = (TextView) findViewById(R.id.timing_day_20);
        this.max_temp_day_20 = (TextView) findViewById(R.id.max_temp_day_20);
        this.uv_day_20 = (TextView) findViewById(R.id.uv_day_20);
        this.rain_day_20 = (TextView) findViewById(R.id.rain_day_20);
        this.showers_day_20 = (TextView) findViewById(R.id.showers_day_20);
        this.snowfall_day_20 = (TextView) findViewById(R.id.snowfall_day_20);
        this.timing_day_21 = (TextView) findViewById(R.id.timing_day_21);
        this.max_temp_day_21 = (TextView) findViewById(R.id.max_temp_day_21);
        this.uv_day_21 = (TextView) findViewById(R.id.uv_day_21);
        this.rain_day_21 = (TextView) findViewById(R.id.rain_day_21);
        this.showers_day_21 = (TextView) findViewById(R.id.showers_day_21);
        this.snowfall_day_21 = (TextView) findViewById(R.id.snowfall_day_21);
        this.timing_day_22 = (TextView) findViewById(R.id.timing_day_22);
        this.max_temp_day_22 = (TextView) findViewById(R.id.max_temp_day_22);
        this.uv_day_22 = (TextView) findViewById(R.id.uv_day_22);
        this.rain_day_22 = (TextView) findViewById(R.id.rain_day_22);
        this.showers_day_22 = (TextView) findViewById(R.id.showers_day_22);
        this.snowfall_day_22 = (TextView) findViewById(R.id.snowfall_day_22);
        this.timing_day_23 = (TextView) findViewById(R.id.timing_day_23);
        this.max_temp_day_23 = (TextView) findViewById(R.id.max_temp_day_23);
        this.uv_day_23 = (TextView) findViewById(R.id.uv_day_23);
        this.rain_day_23 = (TextView) findViewById(R.id.rain_day_23);
        this.showers_day_23 = (TextView) findViewById(R.id.showers_day_23);
        this.snowfall_day_23 = (TextView) findViewById(R.id.snowfall_day_23);
        this.timing_day_24 = (TextView) findViewById(R.id.timing_day_24);
        this.max_temp_day_24 = (TextView) findViewById(R.id.max_temp_day_24);
        this.uv_day_24 = (TextView) findViewById(R.id.uv_day_24);
        this.rain_day_24 = (TextView) findViewById(R.id.rain_day_24);
        this.showers_day_24 = (TextView) findViewById(R.id.showers_day_24);
        this.snowfall_day_24 = (TextView) findViewById(R.id.snowfall_day_24);
        this.current_temp_at_all_current = (TextView) findViewById(R.id.current_temp_at_all_current);
        this.current_wind_speed_at_all_current = (TextView) findViewById(R.id.current_wind_speed_at_all_current);
        this.current_wind_direction_at_all_current = (TextView) findViewById(R.id.current_wind_direction_at_all_current);
        this.current_showers_at_all_current = (TextView) findViewById(R.id.current_showers_at_all_current);
        this.current_rain_at_all_current = (TextView) findViewById(R.id.current_rain_at_all_current);
        this.current_snow_at_all_current = (TextView) findViewById(R.id.current_snow_at_all_current);
        this.current_humidity_at_all_current = (TextView) findViewById(R.id.current_humidity_at_all_current);
        this.current_cloud_cover_at_all_current = (TextView) findViewById(R.id.current_cloud_cover_at_all_current);
        this.current_pm2_at_all_current = (TextView) findViewById(R.id.current_pm2_at_all_current);
        this.current_pm10_at_all_current = (TextView) findViewById(R.id.current_pm10_at_all_current);
        this.current_co_at_all_current = (TextView) findViewById(R.id.current_co_at_all_current);
        this.current_ozone_at_all_current = (TextView) findViewById(R.id.current_ozone_at_all_current);
        this.current_dust_at_all_current = (TextView) findViewById(R.id.current_dust_at_all_current);
        this.current_amonia_at_all_current = (TextView) findViewById(R.id.current_amonia_at_all_current);
        this.current_nitrogen_at_all_current = (TextView) findViewById(R.id.current_nitrogen_at_all_current);
        this.current_sulphur_at_all_current = (TextView) findViewById(R.id.current_sulphur_at_all_current);
        this.current_sunrise_time = (TextView) findViewById(R.id.current_sunrise_time);
        this.current_sunset_time = (TextView) findViewById(R.id.current_sunset_time);
        this.all_1_7_date = (TextView) findViewById(R.id.all_1_7_date);
        this.all_1_7_uv = (TextView) findViewById(R.id.all_1_7_uv);
        this.all_1_7_max_temp = (TextView) findViewById(R.id.all_1_7_max_temp);
        this.all_1_7_min_temp = (TextView) findViewById(R.id.all_1_7_min_temp);
        this.all_2_7_min_temp = (TextView) findViewById(R.id.all_2_7_min_temp);
        this.all_3_7_min_temp = (TextView) findViewById(R.id.all_3_7_min_temp);
        this.all_4_7_min_temp = (TextView) findViewById(R.id.all_4_7_min_temp);
        this.all_5_7_min_temp = (TextView) findViewById(R.id.all_5_7_min_temp);
        this.all_6_7_min_temp = (TextView) findViewById(R.id.all_6_7_min_temp);
        this.all_7_7_min_temp = (TextView) findViewById(R.id.all_7_7_min_temp);
        this.all_1_7_rain = (TextView) findViewById(R.id.all_1_7_rain);
        this.all_1_7_shower = (TextView) findViewById(R.id.all_1_7_shower);
        this.all_1_7_snowfall = (TextView) findViewById(R.id.all_1_7_snowfall);
        this.all_1_7_sunrise = (TextView) findViewById(R.id.all_1_7_sunrise);
        this.all_1_7_sunset = (TextView) findViewById(R.id.all_1_7_sunset);
        this.all_2_7_date = (TextView) findViewById(R.id.all_2_7_date);
        this.all_2_7_uv = (TextView) findViewById(R.id.all_2_7_uv);
        this.all_2_7_max_temp = (TextView) findViewById(R.id.all_2_7_max_temp);
        this.all_2_7_rain = (TextView) findViewById(R.id.all_2_7_rain);
        this.all_2_7_shower = (TextView) findViewById(R.id.all_2_7_shower);
        this.all_2_7_snowfall = (TextView) findViewById(R.id.all_2_7_snowfall);
        this.all_2_7_sunrise = (TextView) findViewById(R.id.all_2_7_sunrise);
        this.all_2_7_sunset = (TextView) findViewById(R.id.all_2_7_sunset);
        this.all_3_7_date = (TextView) findViewById(R.id.all_3_7_date);
        this.all_3_7_uv = (TextView) findViewById(R.id.all_3_7_uv);
        this.all_3_7_max_temp = (TextView) findViewById(R.id.all_3_7_max_temp);
        this.all_3_7_rain = (TextView) findViewById(R.id.all_3_7_rain);
        this.all_3_7_shower = (TextView) findViewById(R.id.all_3_7_shower);
        this.all_3_7_snowfall = (TextView) findViewById(R.id.all_3_7_snowfall);
        this.all_3_7_sunrise = (TextView) findViewById(R.id.all_3_7_sunrise);
        this.all_3_7_sunset = (TextView) findViewById(R.id.all_3_7_sunset);
        this.all_4_7_date = (TextView) findViewById(R.id.all_4_7_date);
        this.all_4_7_uv = (TextView) findViewById(R.id.all_4_7_uv);
        this.all_4_7_max_temp = (TextView) findViewById(R.id.all_4_7_max_temp);
        this.all_4_7_rain = (TextView) findViewById(R.id.all_4_7_rain);
        this.all_4_7_shower = (TextView) findViewById(R.id.all_4_7_shower);
        this.all_4_7_snowfall = (TextView) findViewById(R.id.all_4_7_snowfall);
        this.all_4_7_sunrise = (TextView) findViewById(R.id.all_4_7_sunrise);
        this.all_4_7_sunset = (TextView) findViewById(R.id.all_4_7_sunset);
        this.all_5_7_date = (TextView) findViewById(R.id.all_5_7_date);
        this.all_5_7_uv = (TextView) findViewById(R.id.all_5_7_uv);
        this.all_5_7_max_temp = (TextView) findViewById(R.id.all_5_7_max_temp);
        this.all_5_7_rain = (TextView) findViewById(R.id.all_5_7_rain);
        this.all_5_7_shower = (TextView) findViewById(R.id.all_5_7_shower);
        this.all_5_7_snowfall = (TextView) findViewById(R.id.all_5_7_snowfall);
        this.all_5_7_sunrise = (TextView) findViewById(R.id.all_5_7_sunrise);
        this.all_5_7_sunset = (TextView) findViewById(R.id.all_5_7_sunset);
        this.all_6_7_date = (TextView) findViewById(R.id.all_6_7_date);
        this.all_6_7_uv = (TextView) findViewById(R.id.all_6_7_uv);
        this.all_6_7_max_temp = (TextView) findViewById(R.id.all_6_7_max_temp);
        this.all_6_7_rain = (TextView) findViewById(R.id.all_6_7_rain);
        this.all_6_7_shower = (TextView) findViewById(R.id.all_6_7_shower);
        this.all_6_7_snowfall = (TextView) findViewById(R.id.all_6_7_snowfall);
        this.all_6_7_sunrise = (TextView) findViewById(R.id.all_6_7_sunrise);
        this.all_6_7_sunset = (TextView) findViewById(R.id.all_6_7_sunset);
        this.all_7_7_date = (TextView) findViewById(R.id.all_7_7_date);
        this.all_7_7_uv = (TextView) findViewById(R.id.all_7_7_uv);
        this.all_7_7_max_temp = (TextView) findViewById(R.id.all_7_7_max_temp);
        this.all_7_7_rain = (TextView) findViewById(R.id.all_7_7_rain);
        this.all_7_7_shower = (TextView) findViewById(R.id.all_7_7_shower);
        this.all_7_7_snowfall = (TextView) findViewById(R.id.all_7_7_snowfall);
        this.all_7_7_sunrise = (TextView) findViewById(R.id.all_7_7_sunrise);
        this.all_7_7_sunset = (TextView) findViewById(R.id.all_7_7_sunset);
        this.graphView = (GraphView) findViewById(R.id.graph);
        this.sharedPreferences = getSharedPreferences("locations", 0);
        recall();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        recall();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        recall();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.refresh) {
            recall();
            Toast.makeText(this, "refresh done", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.report) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"supershor.cp@gmail.com"});
            intent.putExtra("android.intent.extra.SUBJECT", "Error in PANCHA_TATVA(Weather app)");
            startActivity(intent);
        } else if (itemId == R.id.contact) {
            Intent intent2 = new Intent("android.intent.action.SENDTO");
            intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{"supershor.cp@gmail.com"});
            intent2.putExtra("android.intent.extra.SUBJECT", "Owner PANCHA_TATVA(Weather app");
            startActivity(intent2);
        } else if (itemId == R.id.newloc) {
            Intent newloc=new Intent(MainActivity.this,New_Location.class);
            startActivity(newloc);
            finish();
        }else if(itemId==R.id.days_7_168_hours_detail){
            Intent days7=new Intent(MainActivity.this,hours_168.class);
            startActivity(days7);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void recall() {
        AndroidNetworking.initialize(this);
        if (this.sharedPreferences.getString("locality", null) != null) {
            this.toolbar.setTitle(this.sharedPreferences.getString("locality", "++"));
        }
        setSupportActionBar(this.toolbar);
        if (this.sharedPreferences.getString("getLatitude", null) != null && this.sharedPreferences.getString("getLongitude", null) != null && this.sharedPreferences.getString("getLatitude", null).length() > 0 && this.sharedPreferences.getString("getLongitude", null).length() > 0) {
            AndroidNetworking.get("https://api.open-meteo.com/v1/forecast?latitude=" + this.sharedPreferences.getString("getLatitude", null) + "&longitude=" + this.sharedPreferences.getString("getLongitude", null) + "&current=relative_humidity_2m,temperature,apparent_temperature,is_day,rain,showers,snowfall,weather_code,cloud_cover,wind_speed_10m,wind_direction_10m&hourly=apparent_temperature,rain,showers,snowfall,weather_code,wind_speed_10m,wind_direction_10m,uv_index,is_day&daily=weather_code,apparent_temperature_max,apparent_temperature_min,sunrise,sunset,uv_index_max,rain_sum,showers_sum,snowfall_sum&timezone=auto&forecast_days=7").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.apify.panch_tatva.MainActivity.1
                @SuppressLint("SetTextI18n")
                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onResponse(JSONObject jSONObject) {
                    JSONArray jSONArray;
                    int i;
                    JSONArray jSONArray2;
                    JSONArray jSONArray3;
                    JSONArray jSONArray4;
                    JSONArray jSONArray5;
                    JSONArray jSONArray6;
                    JSONArray jSONArray7;
                    JSONArray jSONArray8;
                    JSONArray jSONArray9;
                    JSONArray jSONArray10;
                    JSONArray jSONArray11;
                    JSONArray jSONArray12;
                    JSONArray jSONArray13;
                    String str;
                    String str2 = "yyyy-MM-dd";
                    Log.d("ans", jSONObject.toString());
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("current");
                        JSONObject jSONObject3 = jSONObject.getJSONObject("hourly");
                        JSONArray jSONArray14 = jSONObject3.getJSONArray("apparent_temperature");
                        JSONArray jSONArray15 = jSONObject3.getJSONArray("rain");
                        JSONArray jSONArray16 = jSONObject3.getJSONArray("showers");
                        JSONArray jSONArray17 = jSONObject3.getJSONArray("snowfall");
                        JSONArray jSONArray18 = jSONObject3.getJSONArray("time");
                        JSONArray jSONArray19 = jSONArray16;
                        JSONArray jSONArray20 = jSONObject3.getJSONArray("uv_index");
                        JSONArray jSONArray21 = jSONObject3.getJSONArray("weather_code");
                        JSONArray jSONArray22 = jSONArray15;
                        JSONObject jSONObject4 = jSONObject.getJSONObject("daily");
                        JSONArray jSONArray23 = jSONObject4.getJSONArray("time");
                        JSONArray jSONArray24 = jSONObject4.getJSONArray("weather_code");
                        JSONArray jSONArray25 = jSONArray20;
                        JSONArray jSONArray26 = jSONObject4.getJSONArray("apparent_temperature_max");
                        JSONArray jSONArray27 = jSONArray14;
                        JSONArray jSONArray28 = jSONObject4.getJSONArray("apparent_temperature_min");
                        JSONArray jSONArray29 = jSONArray21;
                        JSONArray jSONArray30 = jSONArray26;
                        Log.d("ans arr", jSONArray28.toString());
                        JSONArray jSONArray31 = jSONObject4.getJSONArray("rain_sum");
                        JSONArray jSONArray32 = jSONObject4.getJSONArray("snowfall_sum");
                        JSONArray jSONArray33 = jSONArray28;
                        JSONArray jSONArray34 = jSONObject4.getJSONArray("showers_sum");
                        JSONArray jSONArray35 = jSONArray32;
                        JSONArray jSONArray36 = jSONObject4.getJSONArray("sunrise");
                        JSONArray jSONArray37 = jSONArray31;
                        JSONArray jSONArray38 = jSONObject4.getJSONArray("sunset");
                        JSONArray jSONArray39 = jSONArray34;
                        JSONArray jSONArray40 = jSONObject4.getJSONArray("uv_index_max");
                        Log.d("ans 1", jSONObject2.toString());
                        MainActivity.this.temp_at_main.setText(jSONObject2.get("apparent_temperature") + "℃");
                        MainActivity.this.weather_typer_main_set(((Integer) jSONObject2.get("weather_code")).intValue(), Double.valueOf(((Double) jSONObject2.get("temperature")).doubleValue()));
                        MainActivity.this.current_temp_at_all_current.setText(jSONObject2.get("temperature") + "℃\nTemp");
                        MainActivity.this.current_wind_speed_at_all_current.setText(jSONObject2.get("wind_speed_10m") + "\nkm/h\nWIND SPEED");
                        MainActivity.this.current_wind_direction_at_all_current.setText(jSONObject2.get("wind_direction_10m") + "°\nWIND DIRECTION");
                        MainActivity.this.current_showers_at_all_current.setText(jSONObject2.get("showers") + "\nmm\nSHOWER");
                        MainActivity.this.current_rain_at_all_current.setText(jSONObject2.get("rain") + "\nmm\nRAIN");
                        MainActivity.this.current_snow_at_all_current.setText(jSONObject2.get("snowfall") + "\nmm\nSNOW");
                        MainActivity.this.current_humidity_at_all_current.setText(jSONObject2.get("relative_humidity_2m") + "%\nHUMIDITY");
                        MainActivity.this.current_cloud_cover_at_all_current.setText(jSONObject2.get("cloud_cover") + "%\nCLOUD COVER");
                        Log.d("ans system date", new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
                        Log.d("ans system time", new SimpleDateFormat("HH-mm-ss", Locale.getDefault()).format(new Date()));
                        Log.d("ans time 1", jSONArray18.get(0).toString().substring(0, 10));
                        Log.d("ans time 2", jSONArray18.get(24).toString().substring(0, 10));
                        int i2 = 0;
                        while (i2 < jSONArray23.length()) {
                            if (i2 == 0) {
                                MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 0);
                                MainActivity.this.current_sunrise_time.setText(jSONArray36.get(0).toString().substring(11) + "\nam");
                                MainActivity.this.current_sunset_time.setText(jSONArray38.get(0).toString().substring(11) + "\npm");
                                MainActivity.this.all_1_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                JSONArray jSONArray41 = jSONArray30;
                                MainActivity.this.all_1_7_max_temp.setText(String.valueOf(jSONArray41.get(i2)));
                                JSONArray jSONArray42 = jSONArray39;
                                MainActivity.this.all_1_7_shower.setText(String.valueOf(jSONArray42.get(i2)));
                                JSONArray jSONArray43 = jSONArray37;
                                MainActivity.this.all_1_7_rain.setText(String.valueOf(jSONArray43.get(i2)));
                                JSONArray jSONArray44 = jSONArray35;
                                MainActivity.this.all_1_7_snowfall.setText(String.valueOf(jSONArray44.get(i2)));
                                JSONArray jSONArray45 = jSONArray33;
                                MainActivity.this.all_1_7_min_temp.setText(String.valueOf(jSONArray45.get(i2)));
                                jSONArray13 = jSONArray40;
                                MainActivity.this.all_1_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                MainActivity.this.all_1_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                MainActivity.this.all_1_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                str = str2;
                                jSONArray11 = jSONArray43;
                                jSONArray9 = jSONArray45;
                                jSONArray8 = jSONArray41;
                                jSONArray12 = jSONArray42;
                                jSONArray10 = jSONArray44;
                            } else {
                                jSONArray8 = jSONArray30;
                                jSONArray9 = jSONArray33;
                                jSONArray10 = jSONArray35;
                                jSONArray11 = jSONArray37;
                                jSONArray12 = jSONArray39;
                                jSONArray13 = jSONArray40;
                                if (i2 == 1) {
                                    MainActivity.this.all_2_7_min_temp.setText(jSONArray9.get(i2).toString());
                                    str = str2;
                                    MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 1);
                                    MainActivity.this.all_2_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                    MainActivity.this.all_2_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                    MainActivity.this.all_2_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                    MainActivity.this.all_2_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                    MainActivity.this.all_2_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                    MainActivity.this.all_2_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                    MainActivity.this.all_2_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                    MainActivity.this.all_2_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                } else {
                                    str = str2;
                                    if (i2 == 2) {
                                        MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 2);
                                        MainActivity.this.all_3_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                        MainActivity.this.all_3_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                        MainActivity.this.all_3_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                        MainActivity.this.all_3_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                        MainActivity.this.all_3_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                        MainActivity.this.all_3_7_min_temp.setText(String.valueOf(jSONArray9.get(i2)));
                                        MainActivity.this.all_3_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                        MainActivity.this.all_3_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                        MainActivity.this.all_3_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                    } else if (i2 == 3) {
                                        MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 3);
                                        MainActivity.this.all_4_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                        MainActivity.this.all_4_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                        MainActivity.this.all_4_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                        MainActivity.this.all_4_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                        MainActivity.this.all_4_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                        MainActivity.this.all_4_7_min_temp.setText(String.valueOf(jSONArray9.get(i2)));
                                        MainActivity.this.all_4_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                        MainActivity.this.all_4_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                        MainActivity.this.all_4_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                    } else if (i2 == 4) {
                                        MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 4);
                                        MainActivity.this.all_5_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                        MainActivity.this.all_5_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                        MainActivity.this.all_5_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                        MainActivity.this.all_5_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                        MainActivity.this.all_5_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                        MainActivity.this.all_5_7_min_temp.setText(String.valueOf(jSONArray9.get(i2)));
                                        MainActivity.this.all_5_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                        MainActivity.this.all_5_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                        MainActivity.this.all_5_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                    } else if (i2 == 5) {
                                        MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 5);
                                        MainActivity.this.all_6_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                        MainActivity.this.all_6_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                        MainActivity.this.all_6_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                        MainActivity.this.all_6_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                        MainActivity.this.all_6_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                        MainActivity.this.all_6_7_min_temp.setText(String.valueOf(jSONArray9.get(i2)));
                                        MainActivity.this.all_6_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                        MainActivity.this.all_6_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                        MainActivity.this.all_6_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                    } else if (i2 == 6) {
                                        MainActivity.this.day_7_weather_typer_set(((Integer) jSONArray24.get(i2)).intValue(), 6);
                                        MainActivity.this.all_7_7_date.setText(jSONArray23.get(i2).toString().substring(8));
                                        MainActivity.this.all_7_7_max_temp.setText(String.valueOf(jSONArray8.get(i2)));
                                        MainActivity.this.all_7_7_shower.setText(String.valueOf(jSONArray12.get(i2)));
                                        MainActivity.this.all_7_7_rain.setText(String.valueOf(jSONArray11.get(i2)));
                                        MainActivity.this.all_7_7_snowfall.setText(String.valueOf(jSONArray10.get(i2)));
                                        MainActivity.this.all_7_7_min_temp.setText(String.valueOf(jSONArray9.get(i2)));
                                        MainActivity.this.all_7_7_uv.setText(String.valueOf(jSONArray13.get(i2)));
                                        MainActivity.this.all_7_7_sunrise.setText(jSONArray36.get(i2).toString().substring(12));
                                        MainActivity.this.all_7_7_sunset.setText(jSONArray38.get(i2).toString().substring(11));
                                    }
                                }
                            }
                            i2++;
                            jSONArray30 = jSONArray8;
                            jSONArray33 = jSONArray9;
                            jSONArray40 = jSONArray13;
                            jSONArray37 = jSONArray11;
                            jSONArray35 = jSONArray10;
                            jSONArray39 = jSONArray12;
                            str2 = str;
                        }
                        String str3 = str2;
                        if (jSONArray18.get(0).toString().substring(0, 10).compareTo(new SimpleDateFormat(str3, Locale.getDefault()).format(new Date())) == 0) {
                            Log.d("ans step", "1");
                            int parseInt = Integer.parseInt(new SimpleDateFormat("HH", Locale.getDefault()).format(new Date()));
                            Log.d("ans step 1", String.valueOf(parseInt));
                            int i3 = parseInt;
                            while (i3 <= parseInt + 24) {
                                int i4 = i3 - parseInt;
                                if (i4 == 0) {
                                    jSONArray7 = jSONArray29;
                                    MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_1);
                                    MainActivity.this.timing_day_1.setText("NOW");
                                    jSONArray6 = jSONArray27;
                                    MainActivity.this.max_temp_day_1.setText(jSONArray6.get(i3).toString());
                                    jSONArray5 = jSONArray25;
                                    MainActivity.this.uv_day_1.setText(jSONArray5.get(i3).toString());
                                    jSONArray4 = jSONArray22;
                                    MainActivity.this.rain_day_1.setText(jSONArray4.get(i3).toString());
                                    jSONArray3 = jSONArray19;
                                    MainActivity.this.showers_day_1.setText(jSONArray3.get(i3).toString());
                                    jSONArray2 = jSONArray17;
                                    MainActivity.this.snowfall_day_1.setText(jSONArray2.get(i3).toString());
                                } else {
                                    jSONArray2 = jSONArray17;
                                    jSONArray3 = jSONArray19;
                                    jSONArray4 = jSONArray22;
                                    jSONArray5 = jSONArray25;
                                    jSONArray6 = jSONArray27;
                                    jSONArray7 = jSONArray29;
                                    if (i4 == 1) {
                                        MainActivity.this.timing_day_2.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_2);
                                        MainActivity.this.max_temp_day_2.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_2.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_2.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_2.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_2.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 2) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_3);
                                        MainActivity.this.timing_day_3.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_3.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_3.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_3.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_3.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_3.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 3) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_4);
                                        MainActivity.this.timing_day_4.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_4.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_4.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_4.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_4.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_4.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 4) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_5);
                                        MainActivity.this.timing_day_5.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_5.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_5.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_5.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_5.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_5.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 5) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_6);
                                        MainActivity.this.timing_day_6.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_6.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_6.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_6.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_6.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_6.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 6) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_7);
                                        MainActivity.this.timing_day_7.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_7.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_7.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_7.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_7.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_7.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 7) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_8);
                                        MainActivity.this.timing_day_8.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_8.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_8.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_8.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_8.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_8.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 8) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_9);
                                        MainActivity.this.timing_day_9.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_9.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_9.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_9.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_9.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_9.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 9) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_10);
                                        MainActivity.this.timing_day_10.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_10.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_10.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_10.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_10.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_10.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 10) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_11);
                                        MainActivity.this.timing_day_11.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_11.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_11.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_11.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_11.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_11.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 11) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_12);
                                        MainActivity.this.timing_day_12.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_12.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_12.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_12.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_12.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_12.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 12) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_13);
                                        MainActivity.this.timing_day_13.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_13.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_13.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_13.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_13.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_13.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 13) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_14);
                                        MainActivity.this.timing_day_14.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_14.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_14.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_14.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_14.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_14.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 14) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_15);
                                        MainActivity.this.timing_day_15.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_15.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_15.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_15.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_15.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_15.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 15) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_16);
                                        MainActivity.this.timing_day_16.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_16.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_16.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_16.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_16.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_16.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 16) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_17);
                                        MainActivity.this.timing_day_17.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_17.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_17.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_17.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_17.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_17.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 17) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_18);
                                        MainActivity.this.timing_day_18.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_18.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_18.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_18.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_18.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_18.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 18) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_19);
                                        MainActivity.this.timing_day_19.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_19.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_19.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_19.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_19.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_19.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 19) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_20);
                                        MainActivity.this.timing_day_20.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_20.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_20.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_20.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_20.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_20.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 20) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_21);
                                        MainActivity.this.timing_day_21.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_21.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_21.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_21.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_21.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_21.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 21) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_22);
                                        MainActivity.this.timing_day_22.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_22.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_22.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_22.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_22.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_22.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 22) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_23);
                                        MainActivity.this.timing_day_23.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_23.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_23.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_23.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_23.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_23.setText(jSONArray2.get(i3).toString());
                                    } else if (i4 == 23) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray7.get(i3)).intValue(), MainActivity.this.weather_day_24);
                                        MainActivity.this.timing_day_24.setText(jSONArray18.get(i3).toString().substring(11));
                                        MainActivity.this.max_temp_day_24.setText(jSONArray6.get(i3).toString());
                                        MainActivity.this.uv_day_24.setText(jSONArray5.get(i3).toString());
                                        MainActivity.this.rain_day_24.setText(jSONArray4.get(i3).toString());
                                        MainActivity.this.showers_day_24.setText(jSONArray3.get(i3).toString());
                                        MainActivity.this.snowfall_day_24.setText(jSONArray2.get(i3).toString());
                                    }
                                }
                                i3++;
                                jSONArray29 = jSONArray7;
                                jSONArray27 = jSONArray6;
                                jSONArray25 = jSONArray5;
                                jSONArray22 = jSONArray4;
                                jSONArray19 = jSONArray3;
                                jSONArray17 = jSONArray2;
                            }
                            jSONArray = jSONArray27;
                            i = parseInt;
                        } else {
                            jSONArray = jSONArray27;
                            if (jSONArray18.get(24).toString().substring(0, 10).compareTo(new SimpleDateFormat(str3, Locale.getDefault()).format(new Date())) == 0) {
                                Log.d("ans step", "2");
                                int parseInt2 = Integer.parseInt(new SimpleDateFormat("HH", Locale.getDefault()).format(new Date()));
                                i = parseInt2 + 24;
                                for (int i5 = i; i5 <= parseInt2 + 48; i5++) {
                                    int i6 = i5 - i;
                                    if (i6 == 0) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_1);
                                        MainActivity.this.timing_day_1.setText("NOW");
                                        MainActivity.this.max_temp_day_1.setText(jSONArray.get(i5).toString());
                                        MainActivity.this.uv_day_1.setText(jSONArray25.get(i5).toString());
                                        MainActivity.this.rain_day_1.setText(jSONArray22.get(i5).toString());
                                        MainActivity.this.showers_day_1.setText(jSONArray19.get(i5).toString());
                                        MainActivity.this.snowfall_day_1.setText(jSONArray17.get(i5).toString());
                                    } else if (i6 == 1) {
                                        MainActivity.this.timing_day_2.setText(jSONArray18.get(i5).toString().substring(11));
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_2);
                                        MainActivity.this.max_temp_day_2.setText(jSONArray.get(i5).toString());
                                        MainActivity.this.uv_day_2.setText(jSONArray25.get(i5).toString());
                                        MainActivity.this.rain_day_2.setText(jSONArray22.get(i5).toString());
                                        MainActivity.this.showers_day_2.setText(jSONArray19.get(i5).toString());
                                        MainActivity.this.snowfall_day_2.setText(jSONArray17.get(i5).toString());
                                    } else if (i6 == 2) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_3);
                                        MainActivity.this.timing_day_3.setText(jSONArray18.get(i5).toString().substring(11));
                                        MainActivity.this.max_temp_day_3.setText(jSONArray.get(i5).toString());
                                        MainActivity.this.uv_day_3.setText(jSONArray25.get(i5).toString());
                                        MainActivity.this.rain_day_3.setText(jSONArray22.get(i5).toString());
                                        MainActivity.this.showers_day_3.setText(jSONArray19.get(i5).toString());
                                        MainActivity.this.snowfall_day_3.setText(jSONArray17.get(i5).toString());
                                    } else if (i6 == 3) {
                                        MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_4);
                                        MainActivity.this.timing_day_4.setText(jSONArray18.get(i5).toString().substring(11));
                                        MainActivity.this.max_temp_day_4.setText(jSONArray.get(i5).toString());
                                        MainActivity.this.uv_day_4.setText(jSONArray25.get(i5).toString());
                                        MainActivity.this.rain_day_4.setText(jSONArray22.get(i5).toString());
                                        MainActivity.this.showers_day_4.setText(jSONArray19.get(i5).toString());
                                        MainActivity.this.snowfall_day_4.setText(jSONArray17.get(i5).toString());
                                    } else {
                                        if (i6 == 4) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_5);
                                            MainActivity.this.timing_day_5.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_5.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_5.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_5.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_5.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_5.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 5) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_6);
                                            MainActivity.this.timing_day_6.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_6.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_6.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_6.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_6.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_6.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 6) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_7);
                                            MainActivity.this.timing_day_7.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_7.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_7.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_7.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_7.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_7.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 7) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_8);
                                            MainActivity.this.timing_day_8.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_8.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_8.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_8.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_8.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_8.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 8) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_9);
                                            MainActivity.this.timing_day_9.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_9.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_9.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_9.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_9.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_9.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 9) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_10);
                                            MainActivity.this.timing_day_10.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_10.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_10.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_10.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_10.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_10.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 10) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_11);
                                            MainActivity.this.timing_day_11.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_11.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_11.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_11.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_11.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_11.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 11) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_12);
                                            MainActivity.this.timing_day_12.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_12.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_12.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_12.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_12.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_12.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 12) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_13);
                                            MainActivity.this.timing_day_13.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_13.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_13.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_13.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_13.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_13.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 13) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_14);
                                            MainActivity.this.timing_day_14.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_14.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_14.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_14.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_14.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_14.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 14) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_15);
                                            MainActivity.this.timing_day_15.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_15.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_15.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_15.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_15.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_15.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 15) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_16);
                                            MainActivity.this.timing_day_16.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_16.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_16.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_16.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_16.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_16.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 16) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_17);
                                            MainActivity.this.timing_day_17.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_17.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_17.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_17.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_17.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_17.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 17) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_18);
                                            MainActivity.this.timing_day_18.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_18.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_18.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_18.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_18.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_18.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 18) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_19);
                                            MainActivity.this.timing_day_19.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_19.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_19.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_19.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_19.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_19.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 19) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_20);
                                            MainActivity.this.timing_day_20.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_20.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_20.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_20.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_20.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_20.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 20) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_21);
                                            MainActivity.this.timing_day_21.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_21.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_21.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_21.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_21.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_21.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 21) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_22);
                                            MainActivity.this.timing_day_22.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_22.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_22.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_22.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_22.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_22.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 22) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_23);
                                            MainActivity.this.timing_day_23.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_23.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_23.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_23.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_23.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_23.setText(jSONArray17.get(i5).toString());
                                        } else if (i6 == 23) {
                                            MainActivity.this.weather_typer_24_hour_set(((Integer) jSONArray29.get(i5)).intValue(), MainActivity.this.weather_day_24);
                                            MainActivity.this.timing_day_24.setText(jSONArray18.get(i5).toString().substring(11));
                                            MainActivity.this.max_temp_day_24.setText(jSONArray.get(i5).toString());
                                            MainActivity.this.uv_day_24.setText(jSONArray25.get(i5).toString());
                                            MainActivity.this.rain_day_24.setText(jSONArray22.get(i5).toString());
                                            MainActivity.this.showers_day_24.setText(jSONArray19.get(i5).toString());
                                            MainActivity.this.snowfall_day_24.setText(jSONArray17.get(i5).toString());
                                        }
                                    }
                                }
                            } else {
                                i = 0;
                            }
                        }
                        Log.d("ans --->>", String.valueOf(i));
                        MainActivity.this.set_graph(i, jSONArray);
                    } catch (Exception unused) {
                        Toast.makeText(MainActivity.this, "Error in weather details please try restarting the app", Toast.LENGTH_LONG).show();
                        MainActivity.this.lottieAnimationView1.setVisibility(View.VISIBLE);
                        MainActivity.this.lottielight.setVisibility(View.GONE);
                        MainActivity.this.lottiedark.setVisibility(View.GONE);
                        MainActivity.this.nestedScrollView.setVisibility(View.GONE);
                    }
                }

                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onError(ANError aNError) {
                    Log.d("ans", aNError.toString());
                    Toast.makeText(MainActivity.this, "Error in weather details please try restarting the app", Toast.LENGTH_LONG).show();
                    MainActivity.this.lottieAnimationView1.setVisibility(View.VISIBLE);
                    MainActivity.this.lottielight.setVisibility(View.GONE);
                    MainActivity.this.lottiedark.setVisibility(View.GONE);
                    MainActivity.this.nestedScrollView.setVisibility(View.GONE);
                }
            });
        } else {
            Toast.makeText(this, "Couldn't get your current location please try restarting the app", Toast.LENGTH_LONG).show();
            this.lottieAnimationView1.setVisibility(View.VISIBLE);
            this.lottielight.setVisibility(View.GONE);
            this.lottiedark.setVisibility(View.GONE);
            this.nestedScrollView.setVisibility(View.GONE);
        }
        if (this.sharedPreferences.getString("getLatitude", null) != null && this.sharedPreferences.getString("getLongitude", null) != null && this.sharedPreferences.getString("getLatitude", null).length() > 0 && this.sharedPreferences.getString("getLongitude", null).length() > 0) {
            AndroidNetworking.get("https://air-quality-api.open-meteo.com/v1/air-quality?latitude=" + this.sharedPreferences.getString("getLatitude", null) + "&longitude=" + this.sharedPreferences.getString("getLongitude", null) + "&current=european_aqi,us_aqi,pm10,pm2_5,carbon_monoxide,nitrogen_dioxide,sulphur_dioxide,ozone,dust,ammonia&timezone=auto&forecast_days=1").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.apify.panch_tatva.MainActivity.2
                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onResponse(JSONObject jSONObject) {
                    Log.d("ans", jSONObject.toString());
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("current");
                        Log.d("ans 2", jSONObject2.toString());
                        MainActivity.this.current_pm2_at_all_current.setText(jSONObject2.get("pm2_5") + "\nμg/m³\nPM2.5");
                        MainActivity.this.current_pm10_at_all_current.setText(jSONObject2.get("pm10") + "\nμg/m³\nPM10");
                        MainActivity.this.current_co_at_all_current.setText(jSONObject2.get("carbon_monoxide") + "\nμg/m³\n CO ");
                        MainActivity.this.current_ozone_at_all_current.setText(jSONObject2.get("ozone") + "\nμg/m³\nOZONE");
                        MainActivity.this.current_dust_at_all_current.setText(jSONObject2.get("dust") + "\nμg/m³\nDUST");
                        MainActivity.this.current_amonia_at_all_current.setText(jSONObject2.get("ammonia") + "\nμg/m³\nAMONIA");
                        MainActivity.this.current_nitrogen_at_all_current.setText(jSONObject2.get("nitrogen_dioxide") + "\nμg/m³\nNO₂");
                        MainActivity.this.current_sulphur_at_all_current.setText(jSONObject2.get("sulphur_dioxide") + "\nμg/m³\nSO₂");
                    } catch (Exception unused) {
                        Toast.makeText(MainActivity.this, "Error in air details please try restarting the app", Toast.LENGTH_LONG).show();
                        MainActivity.this.lottieAnimationView1.setVisibility(View.VISIBLE);
                        MainActivity.this.lottielight.setVisibility(View.GONE);
                        MainActivity.this.lottiedark.setVisibility(View.GONE);
                        MainActivity.this.nestedScrollView.setVisibility(View.GONE);
                    }
                }

                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onError(ANError aNError) {
                    Log.d("ans", aNError.toString());
                    Toast.makeText(MainActivity.this, "Error in air details please try restarting the app", Toast.LENGTH_LONG).show();
                    MainActivity.this.lottieAnimationView1.setVisibility(View.VISIBLE);
                    MainActivity.this.lottielight.setVisibility(View.GONE);
                    MainActivity.this.lottiedark.setVisibility(View.GONE);
                    MainActivity.this.nestedScrollView.setVisibility(View.GONE);
                }
            });
            return;
        }
        Toast.makeText(this, "Couldn't get your current location please try restarting the app", Toast.LENGTH_LONG).show();
        this.lottieAnimationView1.setVisibility(View.VISIBLE);
        this.lottielight.setVisibility(View.GONE);
        this.lottiedark.setVisibility(View.GONE);
        this.nestedScrollView.setVisibility(View.GONE);
    }
    public void weather_typer_main_set(int i, Double d) {
        if (i == 0) {
            this.weather_at_main.setText("CLEAR SKY ⁓ " + d + "℃");
        } else if (i == 1) {
            this.weather_at_main.setText("MAINLY CLEAR ⁓ " + d + "℃");
        } else if (i == 2) {
            this.weather_at_main.setText("PARTLY CLOUDY ⁓ " + d + "℃");
        } else if (i == 3) {
            this.weather_at_main.setText("CLOUDED ⁓ " + d + "℃");
        } else if (i == 45 || i == 48) {
            this.weather_at_main.setText("FOGY ⁓ " + d + "℃");
        } else if (i == 51 || i == 53 || i == 55) {
            this.weather_at_main.setText("FINE RAIN ⁓ " + d + "℃");
        } else if (i == 56 || i == 57) {
            this.weather_at_main.setText("FREZZING FINE RAIN ⁓ " + d + "℃");
        } else if (i == 61) {
            this.weather_at_main.setText("SLIGHT RAIN ⁓ " + d + "℃");
        } else if (i == 63) {
            this.weather_at_main.setText("MODERATE RAIN ⁓ " + d + "℃");
        } else if (i == 65) {
            this.weather_at_main.setText("HEAVY RAIN ⁓ " + d + "℃");
        } else if (i == 66) {
            this.weather_at_main.setText("FREEZING LIGHT RAIN ⁓ " + d + "℃");
        } else if (i == 67) {
            this.weather_at_main.setText("FREEZING HEAVY RAIN ⁓ " + d + "℃");
        } else if (i == 71) {
            this.weather_at_main.setText("SLIGHT SNOWFALL ⁓ " + d + "℃");
        } else if (i == 73) {
            this.weather_at_main.setText("MODERATE SNOWFALL ⁓ " + d + "℃");
        } else if (i == 75) {
            this.weather_at_main.setText("HEAVY SNOWFALL ⁓ " + d + "℃");
        } else if (i == 77) {
            this.weather_at_main.setText("SNOW GRAINS ⁓ " + d + "℃");
        } else if (i == 80) {
            this.weather_at_main.setText("SLIGHT SHOWERS ⁓ " + d + "℃");
        } else if (i == 81) {
            this.weather_at_main.setText("MODERATE SHOWERS ⁓ " + d + "℃");
        } else if (i == 82) {
            this.weather_at_main.setText("VOILENT SHOWERS ⁓ " + d + "℃");
        } else if (i == 85) {
            this.weather_at_main.setText("SNOW SHOWERS SLIGHT ⁓ " + d + "℃");
        } else if (i == 86) {
            this.weather_at_main.setText("SNOW SHOWERS HEAVY ⁓ " + d + "℃");
        } else if (i == 95) {
            this.weather_at_main.setText("THUNDERSTROM ⁓ " + d + "℃");
        } else if (i == 96) {
            this.weather_at_main.setText("THUNDERSTROM WITH SLIGHT HAIL ⁓ " + d + "℃");
        } else if (i == 99) {
            this.weather_at_main.setText("THUNDERSTROM WITH HEAVY HAIL ⁓ " + d + "℃");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void day_7_weather_typer_set(int i, int i2) {
        if (i2 == 0) {
            if (i == 0) {
                this.all_1_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_1_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_1_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_1_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_1_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_1_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_1_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_1_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_1_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_1_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_1_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_1_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_1_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_1_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_1_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_1_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_1_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_1_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_1_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_1_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_1_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_1_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_1_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_1_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_1_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_1_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 1) {
            if (i == 0) {
                this.all_2_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_2_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_2_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_2_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_2_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_2_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_2_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_2_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_2_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_2_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_2_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_2_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_2_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_2_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_2_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_2_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_2_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_2_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_2_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_2_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_2_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_2_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_2_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_2_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_2_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_2_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 2) {
            if (i == 0) {
                this.all_3_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_3_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_3_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_3_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_3_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_3_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_3_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_3_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_3_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_3_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_3_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_3_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_3_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_3_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_3_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_3_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_3_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_3_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_3_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_3_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_3_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_3_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_3_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_3_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_3_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_3_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 3) {
            if (i == 0) {
                this.all_4_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_4_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_4_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_4_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_4_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_4_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_4_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_4_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_4_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_4_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_4_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_4_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_4_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_4_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_4_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_4_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_4_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_4_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_4_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_4_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_4_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_4_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_4_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_4_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_4_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_4_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 4) {
            if (i == 0) {
                this.all_5_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_5_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_5_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_5_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_5_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_5_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_5_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_5_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_5_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_5_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_5_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_5_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_5_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_5_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_5_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_5_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_5_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_5_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_5_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_5_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_5_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_5_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_5_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_5_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_5_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_5_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 5) {
            if (i == 0) {
                this.all_6_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_6_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_6_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_6_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_6_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_6_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_6_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_6_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_6_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_6_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_6_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_6_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_6_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_6_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_6_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_6_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_6_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_6_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_6_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_6_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_6_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_6_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_6_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_6_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_6_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_6_7_weather.setImageResource(R.drawable.ice_storm);
            }
        } else if (i2 == 6) {
            if (i == 0) {
                this.all_7_7_weather.setImageResource(R.drawable.sun);
            } else if (i == 1) {
                this.all_7_7_weather.setImageResource(R.drawable.mainly_clear);
            } else if (i == 2) {
                this.all_7_7_weather.setImageResource(R.drawable.partially_clear);
            } else if (i == 3) {
                this.all_7_7_weather.setImageResource(R.drawable.overcast);
            } else if (i == 45 || i == 48) {
                this.all_7_7_weather.setImageResource(R.drawable.foog);
            } else if (i == 51) {
                this.all_7_7_weather.setImageResource(R.drawable.drizzle_light);
            } else if (i == 53) {
                this.all_7_7_weather.setImageResource(R.drawable.drizzle_moderate);
            } else if (i == 55) {
                this.all_7_7_weather.setImageResource(R.drawable.drizzle_dense);
            } else if (i == 56 || i == 57) {
                this.all_7_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 61) {
                this.all_7_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 63) {
                this.all_7_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 65) {
                this.all_7_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 66) {
                this.all_7_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 67) {
                this.all_7_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 71) {
                this.all_7_7_weather.setImageResource(R.drawable.snow_slight);
            } else if (i == 73) {
                this.all_7_7_weather.setImageResource(R.drawable.snow_moderate);
            } else if (i == 75) {
                this.all_7_7_weather.setImageResource(R.drawable.snow_heavy);
            } else if (i == 77) {
                this.all_7_7_weather.setImageResource(R.drawable.snowgrains);
            } else if (i == 80) {
                this.all_7_7_weather.setImageResource(R.drawable.rain_slight);
            } else if (i == 81) {
                this.all_7_7_weather.setImageResource(R.drawable.rainy_moderate);
            } else if (i == 82) {
                this.all_7_7_weather.setImageResource(R.drawable.rainy_intense);
            } else if (i == 85) {
                this.all_7_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 86) {
                this.all_7_7_weather.setImageResource(R.drawable.freezing_drizzle);
            } else if (i == 95) {
                this.all_7_7_weather.setImageResource(R.drawable.thunderstorm);
            } else if (i == 96) {
                this.all_7_7_weather.setImageResource(R.drawable.ice_storm);
            } else if (i == 99) {
                this.all_7_7_weather.setImageResource(R.drawable.ice_storm);
            }
        }
    }

    public void set_graph(int i, JSONArray jSONArray) throws JSONException {
        Log.d("step1", "");
        LineGraphSeries lineGraphSeries = new LineGraphSeries(new DataPoint[]{new DataPoint(0.0d, ((Double) jSONArray.get(i)).doubleValue()), new DataPoint(1.0d, ((Double) jSONArray.get(i + 1)).doubleValue()), new DataPoint(2.0d, ((Double) jSONArray.get(i + 2)).doubleValue()), new DataPoint(3.0d, ((Double) jSONArray.get(i + 3)).doubleValue()), new DataPoint(4.0d, ((Double) jSONArray.get(i + 4)).doubleValue()), new DataPoint(5.0d, ((Double) jSONArray.get(i + 5)).doubleValue()), new DataPoint(6.0d, ((Double) jSONArray.get(i + 6)).doubleValue()), new DataPoint(7.0d, ((Double) jSONArray.get(i + 7)).doubleValue()), new DataPoint(8.0d, ((Double) jSONArray.get(i + 8)).doubleValue()), new DataPoint(9.0d, ((Double) jSONArray.get(i + 9)).doubleValue()), new DataPoint(10.0d, ((Double) jSONArray.get(i + 10)).doubleValue()), new DataPoint(11.0d, ((Double) jSONArray.get(i + 11)).doubleValue()), new DataPoint(12.0d, ((Double) jSONArray.get(i + 12)).doubleValue()), new DataPoint(13.0d, ((Double) jSONArray.get(i + 13)).doubleValue()), new DataPoint(14.0d, ((Double) jSONArray.get(i + 14)).doubleValue()), new DataPoint(15.0d, ((Double) jSONArray.get(i + 15)).doubleValue()), new DataPoint(16.0d, ((Double) jSONArray.get(i + 16)).doubleValue()), new DataPoint(17.0d, ((Double) jSONArray.get(i + 17)).doubleValue()), new DataPoint(18.0d, ((Double) jSONArray.get(i + 18)).doubleValue()), new DataPoint(19.0d, ((Double) jSONArray.get(i + 19)).doubleValue()), new DataPoint(20.0d, ((Double) jSONArray.get(i + 20)).doubleValue()), new DataPoint(21.0d, ((Double) jSONArray.get(i + 21)).doubleValue()), new DataPoint(22.0d, ((Double) jSONArray.get(i + 22)).doubleValue()), new DataPoint(23.0d, ((Double) jSONArray.get(i + 23)).doubleValue())});
        Log.d("step2", "");
        lineGraphSeries.setColor(R.color.black);
        this.graphView.setTitleColor(R.color.black);
        Log.d("step3", "");
        this.graphView.addSeries(lineGraphSeries);
        Log.d("step4", "");
        Log.d("ans --->>", "b");
    }

    public void weather_typer_24_hour_set(int i, ImageView imageView) {
        if (i == 0) {
            imageView.setImageResource(R.drawable.sun);
        } else if (i == 1) {
            imageView.setImageResource(R.drawable.mainly_clear);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.partially_clear);
        } else if (i == 3) {
            imageView.setImageResource(R.drawable.overcast);
        } else if (i == 45 || i == 48) {
            imageView.setImageResource(R.drawable.foog);
        } else if (i == 51) {
            imageView.setImageResource(R.drawable.drizzle_light);
        } else if (i == 53) {
            imageView.setImageResource(R.drawable.drizzle_moderate);
        } else if (i == 55) {
            imageView.setImageResource(R.drawable.drizzle_dense);
        } else if (i == 56 || i == 57) {
            imageView.setImageResource(R.drawable.freezing_drizzle);
        } else if (i == 61) {
            imageView.setImageResource(R.drawable.rain_slight);
        } else if (i == 63) {
            imageView.setImageResource(R.drawable.rainy_moderate);
        } else if (i == 65) {
            imageView.setImageResource(R.drawable.rainy_intense);
        } else if (i == 66) {
            imageView.setImageResource(R.drawable.freezing_drizzle);
        } else if (i == 67) {
            imageView.setImageResource(R.drawable.freezing_drizzle);
        } else if (i == 71) {
            imageView.setImageResource(R.drawable.snow_slight);
        } else if (i == 73) {
            imageView.setImageResource(R.drawable.snow_moderate);
        } else if (i == 75) {
            imageView.setImageResource(R.drawable.snow_heavy);
        } else if (i == 77) {
            imageView.setImageResource(R.drawable.snowgrains);
        } else if (i == 80) {
            imageView.setImageResource(R.drawable.rain_slight);
        } else if (i == 81) {
            imageView.setImageResource(R.drawable.rainy_moderate);
        } else if (i == 82) {
            imageView.setImageResource(R.drawable.rainy_intense);
        } else if (i == 85) {
            imageView.setImageResource(R.drawable.freezing_drizzle);
        } else if (i == 86) {
            imageView.setImageResource(R.drawable.freezing_drizzle);
        } else if (i == 95) {
            imageView.setImageResource(R.drawable.thunderstorm);
        } else if (i == 96) {
            imageView.setImageResource(R.drawable.ice_storm);
        } else if (i == 99) {
            imageView.setImageResource(R.drawable.ice_storm);
        }
    }
}
package com.apify.panchatatvaweatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
public class New_Location extends AppCompatActivity {
    EditText editText;
    ListView listView;
    ArrayList<String>places;
    ArrayAdapter<String>arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_location);
        AndroidNetworking.initialize(this);
        editText=findViewById(R.id.text);
        listView=findViewById(R.id.listview);
        places=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<>(New_Location.this,R.layout.overview,R.id.text_view,places);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                change();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void change(){
        places.clear();
        arrayAdapter.notifyDataSetChanged();
        String link="https://geocoding-api.open-meteo.com/v1/search?name="+editText.getText().toString()+"&count=100&language=en&format=json";
        Log.d("ans string",link);
        AndroidNetworking.get(link)
                .setPriority(Priority.HIGH)
                .build().getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            if (response.has("results")){
                                JSONArray jsonArray=response.getJSONArray("results");
                                Log.d("ans arr",jsonArray.toString());
                                for (int i=0;i<jsonArray.length();i++){
                                    JSONObject jsonObject=jsonArray.getJSONObject(i);
                                    Log.d("ans"+i,jsonObject.toString());
                                    StringBuilder final_ans=new StringBuilder("");
                                    final_ans.append(jsonObject.getString("name"));
                                    if (jsonObject.has("admin2") && jsonObject.getString("admin2")!=null && jsonObject.getString("admin2").length()!=0){
                                        final_ans.append(", "+jsonObject.getString("admin2"));
                                    }
                                    if (jsonObject.has("admin1") && jsonObject.getString("admin1")!=null && jsonObject.getString("admin1").length()!=0){
                                        final_ans.append(", "+jsonObject.getString("admin1"));
                                    }if (jsonObject.has("country") && jsonObject.getString("country")!=null && jsonObject.getString("country").length()!=0){
                                        final_ans.append(", "+jsonObject.getString("country")+".");
                                    }
                                    Log.d("ans-"+i,final_ans.toString());
                                    places.add(final_ans.toString());
                                }
                                Log.d("ans places arr",places.toString());
                                listView.setAdapter(arrayAdapter);
                                arrayAdapter.notifyDataSetChanged();
                                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                        Toast.makeText(New_Location.this, places.get(position).toString(), Toast.LENGTH_SHORT).show();
                                        try {
                                            JSONObject final_tap=jsonArray.getJSONObject(position);
                                            Toast.makeText(New_Location.this,final_tap.get("name").toString()+"->city", Toast.LENGTH_SHORT).show();
                                            SharedPreferences sharedPreferences=getSharedPreferences("locations",0);
                                            SharedPreferences.Editor editor=sharedPreferences.edit();
                                            editor.clear();
                                            editor.putString("getLatitude", final_tap.get("latitude").toString());
                                            editor.putString("getLongitude", final_tap.get("longitude").toString());
                                            editor.putString("locality", final_tap.get("name").toString());
                                            editor.commit();
                                            Intent intent=new Intent(New_Location.this,MainActivity.class);
                                            startActivity(intent);
                                            finish();
                                        } catch (JSONException e) {
                                            Log.e("ans",e.toString());
                                        }

                                    }
                                });
                            }else {
                                places.clear();
                                arrayAdapter.notifyDataSetChanged();
                                listView.clearChoices();
                                Log.e("ans none","");
                            }
                        }catch (Exception e){
                            places.clear();
                            Log.e("ans->e",e.toString());
                            arrayAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.d("ans->error",anError.toString());
                        arrayAdapter.notifyDataSetChanged();
                    }
                });
    }
}
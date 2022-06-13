package com.example.weatherservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // assigning buttons

    Button btn_report;
    TextView tv_name;
    EditText et_search;
    ListView lv_report;
    String id;
    final WeatherDataService weatherDataService = new WeatherDataService(MainActivity.this);


    public void testing() {

        weatherDataService.getCityID(et_search.getText().toString(), new WeatherDataService.VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(MainActivity.this, "Something wrong", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String cityID) {

                Toast.makeText(MainActivity.this, "Return an id of: " + cityID, Toast.LENGTH_SHORT).show();
                id = cityID;

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_name = findViewById(R.id.tv_name);
        et_search = findViewById(R.id.et_search);
        lv_report = findViewById(R.id.lv_report);

        btn_report = findViewById(R.id.button);


        btn_report.setOnClickListener(view -> {
            // generate report

            testing();
            RequestQueue queue = Volley.newRequestQueue(MainActivity.this);


            weatherDataService.getCityForecastByName(id, new WeatherDataService.ForecastListener() {
                @Override
                public void onError(String message) {
                    Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onResponse(List<WeatherReportModel> weatherReportModels) {

                    // put the info in the list

                    ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, weatherReportModels);
                    lv_report.setAdapter(arrayAdapter);


                }
            });


//
//                JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        String cityID="";
//                        try {
//                            JSONObject cityInfo = response.getJSONObject(0);
//                             cityID= cityInfo.getString("woeid");
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                        Toast.makeText(MainActivity.this, "City ID= " + cityID, Toast.LENGTH_SHORT).show();
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//                );
//
//                MySingleton.getInstance(MainActivity.this).addToRequestQueue(request);
//
//
//
//        });


        });
    }

}
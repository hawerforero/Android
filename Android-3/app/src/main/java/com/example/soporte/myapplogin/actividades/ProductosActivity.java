package com.example.soporte.myapplogin.actividades;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.soporte.myapplogin.R;
import com.example.soporte.myapplogin.actividades.adapters.PromocionAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ProductosActivity extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {
    JsonObjectRequest jsArrayRequest;
    String URL="http://moi24.org/api/index/";
    //ListView LV;
    GridView GV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        setTitle("ProductosActivity");
        //LV = (ListView) findViewById(R.id.lista_listview);
        GV = (GridView) findViewById(R.id.grid_gridview);
        jsArrayRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                this, this
        );

        RequestQueue rq = Volley.newRequestQueue(this);
        rq.add(jsArrayRequest);

    }

    @Override
    public void onErrorResponse(VolleyError error) {
        error.printStackTrace();
    }

    @Override
    public void onResponse(JSONObject response) {
        Log.i("RTA", response.toString());
        try {
            JSONArray Productos = response.getJSONArray("productos");
            Adapter adaptador = new PromocionAdapter(Productos, this);
            GV.setAdapter((ListAdapter) adaptador);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

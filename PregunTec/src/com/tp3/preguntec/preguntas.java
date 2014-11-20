package com.tp3.preguntec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class preguntas extends Activity{
	ListView lista;
	ArrayAdapter<String> adaptador;
	ArrayList<String> datos;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preguntas);
		
		/*datos= new ArrayList<String>();
		llenarLista();
		lista= (ListView)findViewById(R.id.List_preg);
		
		adaptador= new ArrayAdapter<String>(this, R.layout.activity_preguntas, datos);
		lista.setAdapter(adaptador);
		lista.setOnClickListener(new OnClickListener(){
			
			public void onItemClick(AdapterView<?> arg0, View vista, int posicion, long arg3){
				Toast.makeText(getApplication(),""+(String)((TextView)vista).getText(), Toast.LENGTH_LONG).show();
			}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}

		});*/
	}
	
	/*public void llenarLista(){
		datos.add("como se usa esto?");
		datos.add("Así no!");
		datos.add("tons q?");
		datos.add("q chochera!");
	}*/
	
}

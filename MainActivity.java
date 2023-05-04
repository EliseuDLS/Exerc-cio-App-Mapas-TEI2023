package com.example.mapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.ImageView;

import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
   public ImageView mapaPR;
   public ImageView mapaRS;
   public ImageView mapaSC;
   public TextInputEditText estado;
   public TextView idh;
   public TextView populacao;
   public TextView area;
   public TextView municipios;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       mapaPR = findViewById(R.id.mapaPR);
       mapaRS = findViewById(R.id.mapaRS);
       mapaSC = findViewById(R.id.mapaSC);
       estado = findViewById(R.id.estado);
       idh = findViewById(R.id.idh);
       populacao = findViewById(R.id.populacao);
       area = findViewById(R.id.area);
       municipios = findViewById(R.id.municipios);
   }
   public void pesquisar(View view){
       String entrada = estado.getText().toString();

       if (entrada.equals("parana") || entrada.equals("pr")){
           mapaPR.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,749 [2010]");
           area.setText("Área: 199.298,981 km² [2022]");
           municipios.setText("N° Municipios: 284");
           populacao.setText("População: 11.597.484 pessoas [2021]");
       }
       else if (entrada.equals("santa catarina") || entrada.equals("sc")){
           mapaSC.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,774 [2010]");
           area.setText("Área: 95.730,690km² [2022]");
           municipios.setText("N° Municipios: 295");
           populacao.setText("População: 7.338.473 pessoas [2021]");
       }
       else if (entrada.equals("rio grande do sul") || entrada.equals("rs")){
           mapaRS.setVisibility(View.VISIBLE);
           idh.setText("IDH: 0,746 [2010]");
           area.setText("Área: 281.707,151km² [2022]");
           municipios.setText("N° Municipios: 497");
           populacao.setText("População: 11.466.630 pessoas [2021]");
       }
   }
}

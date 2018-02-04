package com.visakh.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
        Toast.makeText(getApplication(),"onCreate invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
        Toast.makeText(getApplication(),"onStart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
        Toast.makeText(getApplication(),"onResume invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
        Toast.makeText(getApplication(),"onPause invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
        Toast.makeText(getApplication(),"onStop invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
        Toast.makeText(getApplication(),"onRestart invoked",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
        Toast.makeText(getApplication(),"onDestroy invoked",Toast.LENGTH_SHORT).show();
    }
}

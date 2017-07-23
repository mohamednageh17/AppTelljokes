package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidlibrary.androidLibActivity;


public class MainActivity extends AppCompatActivity  implements  NetworkOperations {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btn);
        button.setClickable(false);


            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.setNetworkOperations(this);
            endpointsAsyncTask.execute();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        Intent in =new Intent(this,androidLibActivity.class);
        in.putExtra("joke",joke);
        startActivity(in);

    }

    String joke;

    @Override
    public void OnReceiveData(String JsonData) {

        Toast.makeText(MainActivity.this, JsonData, Toast.LENGTH_LONG).show();
        if(!JsonData.equals("error"))
             joke=JsonData;
        else
           joke="joke";
        button.setClickable(true);
    }

}

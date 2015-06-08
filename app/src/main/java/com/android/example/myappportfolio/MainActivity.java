package com.android.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSpotifyStreamer(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch my Spotify Streamer!",Toast.LENGTH_LONG).show();
    }

    public void launchScores(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch my Scores App!",Toast.LENGTH_LONG).show();
    }

    public void launchLibrary(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch my Library App!",Toast.LENGTH_LONG).show();
    }

    public void launchBuildIt(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch Build it Bigger!",Toast.LENGTH_LONG).show();
    }

    public void launchXYZReader(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch XYZ Reader!",Toast.LENGTH_LONG).show();
    }

    public void launchCapstone(View view) {
        Toast.makeText(getApplicationContext(),"This Button will launch my Capstone App!",Toast.LENGTH_LONG).show();
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
}

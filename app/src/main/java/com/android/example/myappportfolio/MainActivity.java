package com.android.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button btnSpotifyStreamer,btnScores,btnLibrary,btnBuildIt,btnXYZReader,btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotifyStreamer = (Button)findViewById(R.id.btnSpotifyStreamer);
        btnScores = (Button)findViewById(R.id.btnScores);
        btnLibrary = (Button)findViewById(R.id.btnLibrary);
        btnBuildIt = (Button)findViewById(R.id.btnBuildIt);
        btnXYZReader = (Button)findViewById(R.id.btnXYZReader);
        btnCapstone = (Button)findViewById(R.id.btnCapstone);

        btnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Spotify Streamer!",Toast.LENGTH_LONG).show();
            }
        });

        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Scores App!",Toast.LENGTH_LONG).show();
            }
        });

        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Library App!",Toast.LENGTH_LONG).show();
            }
        });

        btnBuildIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch Build it Bigger!",Toast.LENGTH_LONG).show();
            }
        });

        btnXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch XYZ Reader!",Toast.LENGTH_LONG).show();
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Capstone App!",Toast.LENGTH_LONG).show();
            }
        });
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

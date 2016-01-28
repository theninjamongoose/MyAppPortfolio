package com.example.stewart.myappportfolio.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.stewart.myappportfolio.R;

public class AppSelectActivity extends AppCompatActivity {

    private Button mSpotifyStreamerBtn;
    private Button mScoresAppBtn;
    private Button mLibraryAppBtn;
    private Button mBuildItBiggerBtn;
    private Button mXyzReaderBtn;
    private Button mMyOwnAppBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    private void init() {
        mBuildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger_btn);
        mSpotifyStreamerBtn = (Button) findViewById(R.id.spotify_streamer_btn);
        mScoresAppBtn = (Button) findViewById(R.id.scores_app_btn);
        mLibraryAppBtn = (Button) findViewById(R.id.library_app_btn);
        mXyzReaderBtn = (Button) findViewById(R.id.xyz_reader_btn);
        mMyOwnAppBtn = (Button) findViewById(R.id.my_own_app_btn);

        mBuildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.build_it_bigger_preview));
            }
        });
        mSpotifyStreamerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.spotify_streamer_preview));
            }
        });
        mScoresAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.scores_app_preview));
            }
        });
        mLibraryAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.library_app_preview));
            }
        });
        mXyzReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.xyz_reader_preview));
            }
        });
        mMyOwnAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast(getString(R.string.my_own_app_preview));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_select, menu);
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

    private void displayToast(String toastText){
        Toast toast = Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT);
        toast.show();
    }
}

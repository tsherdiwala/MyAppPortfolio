package com.knoxpo.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button
            mSpotifyStreamerBtn,
            mScoresAppBtn,
            mLibraryAppBtn,
            mBuildItBiggerBtn,
            mXyzReaderBtn,
            mCapstoreBtn;

    private View.OnClickListener mBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button)v;
        Toast.makeText(MainActivity.this,getString(R.string.toast,button.getText()),Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();

        mSpotifyStreamerBtn.setOnClickListener(mBtnClickListener);
        mScoresAppBtn.setOnClickListener(mBtnClickListener);
        mLibraryAppBtn.setOnClickListener(mBtnClickListener);
        mBuildItBiggerBtn.setOnClickListener(mBtnClickListener);
        mXyzReaderBtn.setOnClickListener(mBtnClickListener);
        mCapstoreBtn.setOnClickListener(mBtnClickListener);

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

    private void init() {
        mSpotifyStreamerBtn = (Button) findViewById(R.id.btn_spotify_streamer);
        mScoresAppBtn = (Button) findViewById(R.id.btn_scores_app);
        mLibraryAppBtn = (Button) findViewById(R.id.btn_library_app);
        mBuildItBiggerBtn = (Button) findViewById(R.id.btn_build_it_bigger);
        mXyzReaderBtn = (Button) findViewById(R.id.btn_xyz_reader);
        mCapstoreBtn = (Button) findViewById(R.id.btn_capstone);
    }
}

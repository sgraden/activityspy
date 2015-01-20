/**
 * Steven Raden
 * MainActivity
 * 1/19/2015
 */

package edu.washington.sraden.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate event fired. " + getIntent());
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart event fired. " + getIntent());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired. " + getIntent());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume event fired. " + getIntent());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause event fired. " + getIntent());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop event fired. " + getIntent());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy event fired. " + getIntent());
        Log.e(TAG, "We're going down, Captain!");
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

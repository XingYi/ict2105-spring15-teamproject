package edu.singaporetech.ict2105.teamproject;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ADDED BY : Yeong Chai 25 MAR 2015

        setTitle("Issue List");    // Changes the title of the activity

        // EXTRA STEPS NEEDED FOR ANDROID LOLLIPOP AND ABOVE
        // ****************************************************
        // As ActionBar was generalized by Toolbar (beginning from Android 5.0), app icon and logo
        // will not be shown (by default) on the toolbar to support its Material Design UI theme.
        // https://developer.android.com/reference/android/widget/Toolbar.html

        // However we insist to include the logo to provide a consistent UI
        // among different versions of Android OS and an unique identity
        // of our app.
        ActionBar myActionBar = getSupportActionBar();    // Gets a reference of the ActionBar object from the Activity
        myActionBar.setLogo(R.drawable.title_icon);    // Attach the app logo (from the drawable res) onto the ActionBar
        myActionBar.setDisplayUseLogoEnabled(true);    // Informs Android that we will be displaying logo on ActionBar
        myActionBar.setDisplayShowHomeEnabled(true);    // Informs Android to show up the HOME on ActionBar


        Log.d(TAG, "Test logging message");

        // Xing Yi - Friday, 23 Jan 2015
        // Has previous state been saved?
        if (savedInstanceState != null) {
            Log.d(TAG, "savedInstanceState is not NULL");
        }
        // End Xing Yi

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
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        // Emit LogCat message
        Log.i(TAG, "Entered the onDestroy() method");
    }
}

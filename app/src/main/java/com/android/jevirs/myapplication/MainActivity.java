package com.android.jevirs.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private List<Sample> samples=new ArrayList<Sample>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listview);
        intlizeSamples();
        SampleAdapter sampleAdapter=new SampleAdapter(getApplicationContext(),R.layout.sample_layout,samples);
        listView.setAdapter(sampleAdapter);
    }

    private List<Sample> intlizeSamples() {
        Sample a = new Sample("travel", R.drawable.pic1);
        samples.add(a);
        Sample b=new Sample("food",R.drawable.pic2);
        samples.add(b);
        Sample c=new Sample("pic",R.drawable.pic3);
        samples.add(c);
        Sample d=new Sample("car",R.drawable.pic4);
        samples.add(d);
        Sample e=new Sample("sofa",R.drawable.pic5);
        samples.add(e);
        Sample f=new Sample("fashion",R.drawable.pic6);
        samples.add(f);
        Sample g=new Sample("pet",R.drawable.pic7);
        samples.add(g);
        Sample h=new Sample("duang~~~",R.drawable.pic8);
        samples.add(h);
        Sample i=new Sample("photo",R.drawable.pic9);
        samples.add(i);
        Sample j=new Sample("design",R.drawable.pic10);
        samples.add(j);
        return samples;
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

package com.example.sagar.writeareview;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mLayout;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        setContentView(R.layout.activity_main);
        mButton.setOnClickListener(onClick());
        TextView textView = new TextView(this);
    }




    private View.OnClickListener onClick() {
        return new View.OnClickListener()  {

            @Override
            public void onClick(View v) {
                mLayout.addView(createNewTextView();
            }
        };
    }



    private TextView createNewTextView() {
        final RelativeLayout.LayoutParams lparams =new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);;
        final TextView textView = new TextView(this);
        textView.setLayoutParams(lparams);
        return textView;
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

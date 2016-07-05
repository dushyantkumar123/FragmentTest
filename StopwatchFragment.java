package com.source.administrator.fragementtest;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StopwatchFragment extends android.app.Fragment  {
   // private int seconds=0;
    //private  boolean running=false;
    //private  boolean wasRunning;


    public StopwatchFragment() {
        // Required empty public constructor
    }
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        /*if(saveInstanceState!=null)
        {
            seconds=saveInstanceState.getInt("seconds");
            running=saveInstanceState.getBoolean("running");
            wasRunning=saveInstanceState.getBoolean("wasRunning");
            if(wasRunning)
                running=true;
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_stopwatch,container,false);
        //runTimer(layout);
        // Inflate the layout for this fragment
        return layout;
    }
    /*public void onResume()
    {
        super.onResume();
        if(wasRunning)
            running=true;
    }
    public void onSaveInstanceState(Bundle onSaveInstanceState)
    {
        onSaveInstanceState.putInt("seconds",seconds);
        onSaveInstanceState.putBoolean("running",running);
        onSaveInstanceState.putBoolean("wasRunning",wasRunning);
    }
public void onClickStart(View view)
{
    running=true;
}
    public void onClickStop(View view)
    {
        running=false;
    }
    public void onClickReset(View view)
    {
        running=false;
        seconds=0;
    }
    public void runTimer(View view)
    {
        final TextView textView=(TextView)view.findViewById(R.id.textView);
        final Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=seconds/3600;
                int minutes=(seconds%3600)/60;
                int sec=seconds%60;
                String time=String.format("%d:%02d:%02d",hours,minutes,sec);
                textView.setText(time);
                if(running)
                {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }
    public void onClick(View view)
    {

    }*/
}

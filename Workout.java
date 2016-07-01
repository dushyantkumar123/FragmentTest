package com.source.administrator.fragementtest;

/**
 * Created by Administrator on 6/28/2016.
 */
public class Workout {
    private  String name;
    private String description;
    public static final Workout[]workouts={new Workout("The Limb Loosner","5 Handstand pushups\n 10-1 legged squats\n15 pull-ups"),
            new Workout("Core Agony","100 pull-ups\n100 push-ups\n100 sit-ups"),new Workout("the wimp special","1000everythin"),new Workout("Strength and length","100pull ups\n100 push ups\n 100situps")};
    private Workout(String name,String description)
    {
        this.name=name;
        this.description=description;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public String toString()
    {
        return name;
    }
}

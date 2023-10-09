package com.web;

import com.web.*;

public class Home extends about{
    public void getHome()
    {
        System.out.println("Home");
    }
    protected void postHome()
    {
        postAbout();
        // postDelete();
        System.out.println("post Home");
    }
    public static void main(String args[])
    {
        System.out.println("hello");
    }
    
}

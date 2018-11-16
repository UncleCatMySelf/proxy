package com.github.unclacatmyself.server.impl;

import com.github.unclacatmyself.server.TattooServer;

/**
 * Created by MySelf on 2018/11/16.
 */
public class TattooServerImpl implements TattooServer {

    private String title;

    public TattooServerImpl(String title){
        this.title = title;
        loadFrom(title);
    }

    @Override
    public void toplay() {
        System.out.println("to play by " +title);
    }

    private void loadFrom(String title){
        System.out.println("loading "+title);
    }

}

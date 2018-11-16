package com.github.unclacatmyself.server.proxy;

import com.github.unclacatmyself.server.impl.TattooServerImpl;
import com.github.unclacatmyself.server.TattooServer;

/**
 * Created by MySelf on 2018/11/16.
 */
public class ProxyTattooServerImpl implements TattooServer {

    private TattooServer tattooServer;
    private String title;

    public ProxyTattooServerImpl(String title){
        this.title = title;
    }

    @Override
    public void toplay() {
        if (tattooServer == null){
            tattooServer = new TattooServerImpl(title);
        }
        tattooServer.toplay();
        System.out.println("[log]:toplay()");
    }
}

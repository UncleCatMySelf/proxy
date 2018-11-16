package com.github.unclacatmyself.test;

import com.github.unclacatmyself.server.TattooServer;
import com.github.unclacatmyself.server.impl.TattooServerImpl;
import com.github.unclacatmyself.server.proxy.ProxyTattooServerImpl;

/**
 * Created by MySelf on 2018/11/16.
 */
public class App {

    public static void main(String[] args) {
        TattooServer tattooServer = new TattooServerImpl("Cat");  //just play
//        TattooServer tattooServer = new ProxyTattooServerImpl("Cat"); //Start static proxy

        //loading
        tattooServer.toplay();
        System.out.println("--");
        tattooServer.toplay();
        System.out.println("--");
        tattooServer.toplay();
    }

}

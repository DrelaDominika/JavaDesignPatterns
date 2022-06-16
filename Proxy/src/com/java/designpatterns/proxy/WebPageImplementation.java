package com.java.designpatterns.proxy;

public class WebPageImplementation implements WebPage {
    @Override
    public void renderPage(String url) throws Exception {
        System.out.println(url + " rendered successfully");
    }
}

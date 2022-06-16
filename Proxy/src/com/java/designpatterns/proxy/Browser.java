package com.java.designpatterns.proxy;

public class Browser {

    public static void main(String[] args) {
        WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("www.twitch.com");
        } catch (Exception e) {
            System.out.println("Exception occurred " + e.getMessage());
            e.printStackTrace();
        }
    }
}

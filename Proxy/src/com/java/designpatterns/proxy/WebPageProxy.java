package com.java.designpatterns.proxy;

public class WebPageProxy implements WebPage {
    private WebPage webPage;

    public WebPageProxy() {
        webPage = new WebPageImplementation();
    }

    @Override
    public void renderPage(String url) throws Exception {
        if (url.equalsIgnoreCase("www.twitch.com")) {
            throw new Exception(url + " is blocked by ISP");
        } else {
            webPage.renderPage(url);
        }
    }
}

package com.template.structural.proxy;

public class MainProxy {
    public static void main(String[] args) {
        MainPage page = new VirusProxy();
        page.showInfo();
    }
}

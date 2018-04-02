package by.kolbun.andersen;

import by.kolbun.andersen.webservices.WebServiceImpl;

import javax.xml.ws.Endpoint;

public class MyWebServicePublisher {
    public static void main(String[] args) {
        System.out.println("start publishing...");
        Endpoint.publish("http://localhost:1986/wss/met", new WebServiceImpl());
        System.out.println("...end publishing");
    }
}

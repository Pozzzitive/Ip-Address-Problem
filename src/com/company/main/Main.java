package com.company.main;


public class Main {

    public static void main(String[] args) {
        IpAddress ip = new IpAddress();
        try {
            System.out.println(ip.returnIpv4Address(2149583361L));
            System.out.println(ip.returnIpv4Address(4294967295L));
            System.out.println(ip.returnIpv4Address(4294967295999L));
            System.out.println(ip.returnIpv4Address(-1L));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

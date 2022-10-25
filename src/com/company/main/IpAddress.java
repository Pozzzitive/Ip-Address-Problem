package com.company.main;

import com.company.main.exceptions.InvalidIpAddressException;

public class IpAddress {

    public String returnIpv4Address(long number) throws InvalidIpAddressException {
        if (number > Math.pow(2, 32) - 1 || number < 0) {
            throw new InvalidIpAddressException("Invalid Ip address");
        }
        StringBuilder ipAddress = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            int aux = (int) (number % 256);
            ipAddress.insert(0, aux);
            if (i < 3) {
                ipAddress.insert(0, '.');
                number = number / 256;
            }
        }
        return String.valueOf(ipAddress);
    }
}

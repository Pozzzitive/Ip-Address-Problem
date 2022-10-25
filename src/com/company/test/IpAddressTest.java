package com.company.test;

import com.company.main.IpAddress;
import com.company.main.exceptions.InvalidIpAddressException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IpAddressTest {

    IpAddress ip = new IpAddress();

    @Test
    void correctIpTests() throws InvalidIpAddressException {
        assertEquals("128.32.10.1", ip.returnIpv4Address(2149583361L));
        assertEquals("55.233.115.227", ip.returnIpv4Address(938046435L));
        assertEquals("0.0.0.32", ip.returnIpv4Address(32L));
        assertEquals("0.0.0.0", ip.returnIpv4Address(0L));
    }

    @Test
    void incorrectIpTestNumberTooLarge() {
        InvalidIpAddressException exception = null;
        try {
            ip.returnIpv4Address(4294967295999L);
        } catch (InvalidIpAddressException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(exception.getMessage(), "Invalid Ip address");
    }

    @Test
    void incorrectIpTestNegativeNumber() {
        InvalidIpAddressException exception = null;
        try {
            ip.returnIpv4Address(-1L);
        } catch (InvalidIpAddressException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(exception.getMessage(), "Invalid Ip address");
    }
}
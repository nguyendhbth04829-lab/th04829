package vn.fpoly.th04829_20042026.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {
MyUtil myUtil =new MyUtil();
    @Test
    void tinhTongChan() {
        assertEquals(6,myUtil.tinhTongChan(4));
    }
}
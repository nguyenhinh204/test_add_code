package com.example.asmgd1.Service;


import com.example.asmgd1.asm.Repository.HoaDonRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import com.example.asmgd1.asm.model.hoadon;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
class HoaDonServiceTest {
@Autowired
private HoaDonService hds;
@Autowired
private HoaDonRepository hdr;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testgetAllHoaDon() {
        List<hoadon> hoaDonList = hds.getAllHoaDon();
        assertTrue(hoaDonList.size() > 0, "Danh sách hóa đơn phải có ít nhất một hóa đơn.");
    }
    @Test
    void testGetAllHoaDon_SoLuongChinhXac() {
        List<hoadon> hoaDonList = hds.getAllHoaDon();
        assertEquals(18, hoaDonList.size(), "Số lượng hóa đơn không đúng.");
    }




}
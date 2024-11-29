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

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback
class HoaDonServiceTest1 {
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
    void getAllHoaDon() {
    }



    @Test
    void testAddHoaDon_ThemVoiDuLieuNull() {
        hoadon newHoaDon = new hoadon(null, null, null, null, false);
        Exception exception = assertThrows(Exception.class, () -> hds.saveHoaDon(newHoaDon));
        assertTrue(exception.getMessage().contains("invalid data"), "Không xử lý được khi thêm dữ liệu null.");
    }

//    @Test
//    void testAddHoaDon_TrungMaHoaDon() {
//        HoaDon duplicateHoaDon = new HoaDon("HD001", LocalDate.now(), "Khách C", 700000, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(duplicateHoaDon));
//        assertTrue(exception.getMessage().contains("duplicate"), "Không xử lý được trường hợp mã hóa đơn bị trùng.");
//    }
//
//    @Test
//    void testAddHoaDon_TongTienBang0() {
//        HoaDon hoaDon = new HoaDon("HD004", LocalDate.now(), "Khách D", 0, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid total amount"), "Không xử lý được khi tổng tiền bằng 0.");
//    }
//
//    @Test
//    void testAddHoaDon_NgayLapNull() {
//        HoaDon hoaDon = new HoaDon("HD005", null, "Khách E", 500000, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid date"), "Không xử lý được khi ngày lập null.");
//    }
//
//    @Test
//    void testAddHoaDon_KhachHangNull() {
//        HoaDon hoaDon = new HoaDon("HD006", LocalDate.now(), null, 500000, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid customer"), "Không xử lý được khi khách hàng null.");
//    }
//
//    @Test
//    void testAddHoaDon_TrangThaiNull() {
//        HoaDon hoaDon = new HoaDon("HD007", LocalDate.now(), "Khách F", 500000, null);
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid status"), "Không xử lý được khi trạng thái null.");
//    }
//
//    @Test
//    void testAddHoaDon_DuLieuHopLe() {
//        HoaDon hoaDon = new HoaDon("HD008", LocalDate.now(), "Khách G", 1000000, "Đã thanh toán");
//        hoaDonService.addHoaDon(hoaDon);
//        assertTrue(hoaDonRepository.existsByMaHoaDon("HD008"), "Hóa đơn hợp lệ không được thêm thành công.");
//    }
//
//    @Test
//    void testAddHoaDon_TongTienAm() {
//        HoaDon hoaDon = new HoaDon("HD009", LocalDate.now(), "Khách H", -500000, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid total amount"), "Không xử lý được khi tổng tiền âm.");
//    }
//
//    @Test
//    void testAddHoaDon_MaHoaDonRong() {
//        HoaDon hoaDon = new HoaDon("", LocalDate.now(), "Khách I", 300000, "Chờ xử lý");
//        Exception exception = assertThrows(Exception.class, () -> hoaDonService.addHoaDon(hoaDon));
//        assertTrue(exception.getMessage().contains("invalid code"), "Không xử lý được khi mã hóa đơn rỗng.");
//    }

}
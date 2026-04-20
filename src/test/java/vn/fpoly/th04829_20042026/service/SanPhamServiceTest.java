package vn.fpoly.th04829_20042026.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vn.fpoly.th04829_20042026.entity.SanPham;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
SanPhamService sanPhamService;
    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }
    @Test
    @DisplayName("luong chinh update")
    void updateSanPhamThanhCong(){
        SanPham sanPham = new SanPham("sp1","Ma",2020,50000,8,"Da dung");
        sanPhamService.addSanPham(sanPham);
        sanPham.setTen("Hello");
        sanPhamService.updateSanPham(sanPham);
        assertEquals("Hello",sanPhamService.getById("sp1").getTen());
    }
    @Test
    @DisplayName("id khong ton tai")
    void updateSanPhamThatBaiVoiIdKhongTonTai(){
        SanPham sanPham = new SanPham("sp2","Ma",2020,50000,8,"Da dung");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("sp3","Ma",2020,50000,9,"Da dung")));
        assertEquals("Id khong ton tai",exception.getMessage());
    }
    @Test
    @DisplayName("ten khong hop le")
        void updateSanPhamThatBaiVoiTenKhongHopLe(){
        SanPham sanPham = new SanPham("sp4","Ma",2020,50000,8,"Da dung");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("sp4","",2020,50000,9,"Da dung")));
        assertEquals("Ten khong hop le",exception.getMessage());
        }

        @Test
    @DisplayName("nam bao hanh khong hop le")
    void updateSanPhamThatBaiVoiNamBaoHanhKhongHopLe(){
            SanPham sanPham = new SanPham("sp5","Ma",2020,50000,8,"Da dung");
            sanPhamService.addSanPham(sanPham);
            Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("sp5","Mao",0,50000,9,"Da dung")));
            assertEquals("Nam bao hanh khong hop le",exception.getMessage());

        }

        @Test
    @DisplayName("so luong khong hop le")
    void updateSanPhamThatBaiVoiSoLuongKhongHopLe(){
            SanPham sanPham = new SanPham("sp6","Ma",2020,50000,8,"Da dung");
            sanPhamService.addSanPham(sanPham);
            Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("sp6","Mao",2020,50000,0,"Da dung")));
            assertEquals("So luong khong hop le",exception.getMessage());
        }
        @Test
    @DisplayName("Null")
    void updateSanPhamNull(){
            Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(null));
            assertEquals("San pham null",exception.getMessage());
        }

        @Test
    @DisplayName("Luong chinh add")
    void addSanPhamThanhCong(){
            SanPham sanPham = new SanPham("sp7","Ma",2020,50000,8,"Da dung");
            sanPhamService.addSanPham(sanPham);
            SanPham sanPham2 = new SanPham("sp8","Mao",2020,50000,8,"Da dung");
            sanPhamService.addSanPham(sanPham2);
      assertEquals(2,sanPhamService.getAll().size());

        }

        @Test
    void addSanPhamVoiIdDaTonTai(){
            SanPham sanPham = new SanPham("sp9","Ma",2020,50000,8,"Da dung");
            sanPhamService.addSanPham(sanPham);
            Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("sp9","Ma",2020,50000,8,"Da dung")));
            assertEquals("Id da ton tai, khong the add",exception.getMessage());
        }


    }

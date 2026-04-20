package vn.fpoly.th04829_20042026.service;

import vn.fpoly.th04829_20042026.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> sanPhams = new ArrayList<>();
    public void addSanPham(SanPham sanPham){
        if (sanPham==null){
            throw new IllegalArgumentException("San pham null");
        }
        sanPhams.add(sanPham);
    }
    public void updateSanPham(SanPham sanPham){
        if (sanPham==null){
            throw new IllegalArgumentException("San pham null");
        }
        for (int i = 0; i < sanPhams.size();i++){
            if (sanPhams.get(i).getMa() == sanPham.getMa()){
                sanPhams.set(i,sanPham);
                return;
            }else {
                throw new IllegalArgumentException("Id khong ton tai");
            }
        }
    }
    public SanPham getById(String ma){
        for (SanPham sanPham: sanPhams){
            if (sanPham.getMa().equals(ma)){
                return  sanPham;
            }
        }
        return null;
    }
    public List<SanPham> getAll(){
        return sanPhams;
    }
}

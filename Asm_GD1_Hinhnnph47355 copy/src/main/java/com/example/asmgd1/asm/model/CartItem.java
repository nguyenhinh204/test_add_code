package com.example.asmgd1.asm.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem {
    private Integer sanPhamChiTietId;
    private String tenSanPham;
    private String mauSac;
    private String kichThuoc;
    private Integer soLuong;
    private Double donGia;
}

package com.example.session.w3;

public enum TinhThanh {
    Ha_Noi("Hà Nội"),
    Ho_Chi_Minh("Hồ Chí Minh"),
    Da_Nang("Đà Nẵng"),
    Hai_Phong("Hải Phòng");

    private String name;
    TinhThanh(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

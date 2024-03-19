package com.example.session.w3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author PhongTT35
 * @description N/A
 **/
public class NguoiYeuRepository {

    private static final List<NguoiYeu> DS_NGUOI_YEU = new ArrayList<>();
    static {
        DS_NGUOI_YEU.add(new NguoiYeu("Chiến", 80, 1.85f ));
        DS_NGUOI_YEU.add(new NguoiYeu("Thuần", 70, 1.80f ));
        DS_NGUOI_YEU.add(new NguoiYeu("Khánh", 75, 1.90f ));
        DS_NGUOI_YEU.add(new NguoiYeu("Mạnh", 88, 2.0f ));
        DS_NGUOI_YEU.add(new NguoiYeu("Dương", 65, 1.75f ));
    }

    public List<NguoiYeu> getDsNguoiYeu() {
        return DS_NGUOI_YEU;
    }

    public List<NguoiYeu> searchNguoiYeu(String keyword) {
        return DS_NGUOI_YEU.stream()
                .filter(ny ->
                        ny.getHoTen().toLowerCase(Locale.ROOT).contains(keyword)
                    || ny.getMa().contains(keyword)
                    || ny.getChieuCao().toString().contains(keyword)
                    || (ny.getCanNang() + "").contains(keyword)
                ).collect(Collectors.toList());
    }

}

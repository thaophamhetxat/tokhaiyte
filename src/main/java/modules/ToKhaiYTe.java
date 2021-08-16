package modules;

import java.sql.Date;

public class ToKhaiYTe {
    String name;
    int year;
    boolean sex;
    String quocTich;
    int soHoChieu;
    String thongTinDiLai;
    String soHieuPhuongTien;
    int soGhe;
    Date ngayKhoiHanh;
    Date ngayKetThuc;
    String lichSu;
    String address;
    int phone;
    String email;

    public ToKhaiYTe() {
    }

    public ToKhaiYTe(String name, int year, boolean sex, String quocTich, int soHoChieu, String thongTinDiLai,
                     String soHieuPhuongTien, int soGhe, Date ngayKhoiHanh, Date ngayKetThuc, String lichSu, String address, int phone, String email) {
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.quocTich = quocTich;
        this.soHoChieu = soHoChieu;
        this.thongTinDiLai = thongTinDiLai;
        this.soHieuPhuongTien = soHieuPhuongTien;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.lichSu = lichSu;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(int soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getThongTinDiLai() {
        return thongTinDiLai;
    }

    public void setThongTinDiLai(String thongTinDiLai) {
        this.thongTinDiLai = thongTinDiLai;
    }

    public String getSoHieuPhuongTien() {
        return soHieuPhuongTien;
    }

    public void setSoHieuPhuongTien(String soHieuPhuongTien) {
        this.soHieuPhuongTien = soHieuPhuongTien;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public Date getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(Date ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLichSu() {
        return lichSu;
    }

    public void setLichSu(String lichSu) {
        this.lichSu = lichSu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

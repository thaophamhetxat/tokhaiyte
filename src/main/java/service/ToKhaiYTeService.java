package service;

import modules.ToKhaiYTe;

import java.util.ArrayList;

public class ToKhaiYTeService {
    public ArrayList<ToKhaiYTe> list = new ArrayList<>();
    public  ToKhaiYTeService(){

    }
    public void save(ToKhaiYTe toKhaiYTe){
        list.add(toKhaiYTe);
    }
}

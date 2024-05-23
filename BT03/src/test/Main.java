package test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

public class Main {

    public static void main(String[] args) {
        GiaoVien LinhNHP = new GiaoVien("MC12345", "Nguyen Hoai Phuong Linh", "0347 345 223", "Ho Chi Minh");
        Student LamVT = new Student("SE23456", "Vu Thanh Lam", "0989 009 765", "Binh Duong", "Nam");
        MonHoc OOP = new MonHoc("PRO192", "Object-Oriented Programming");

        System.out.println(LinhNHP.toString());
        System.out.println(LamVT.toString());
        System.out.println(OOP.toString());

        System.out.println("Ten cua giao vien truoc khi thay doi: " + LinhNHP.getNameGV());
        LinhNHP.setNameGV("Nguyen Hoai Phuc Linh");
        System.out.println("Ten cua giao vien sau khi thay doi: " + LinhNHP.getNameGV());

    }
}

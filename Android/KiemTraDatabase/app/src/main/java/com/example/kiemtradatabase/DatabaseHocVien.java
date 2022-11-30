package com.example.kiemtradatabase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHocVien extends SQLiteOpenHelper {

    public DatabaseHocVien(Context context) {
        super(context, "db_HocVien", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "Create table tbHocVien(hoten text, monhoc text, sotinchi text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void ThemDuLieu(QuanLyHocVien qlhv) {
        String sql = "insert into tbHocVien values (?,?,?)";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{qlhv.getTenHocVien(), qlhv.getMonHoc(),qlhv.getSoTinChi()+""});
        db.close();
    }
    public void XoaDuLieu (QuanLyHocVien qlhv){
        String sql = "delete from tbHocVien where hoten = ?";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{qlhv.getTenHocVien()});
        db.close();
    }
    public void SuaDuLieu(QuanLyHocVien qlhv) {
        String sql = "update tbHocVien set monhoc=?,sotinchi=? where hoten=?";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{qlhv.getMonHoc(), String.valueOf(qlhv.getSoTinChi()),qlhv.getTenHocVien() });
        db.close();
    }
    public ArrayList<QuanLyHocVien> DocDL() {
        ArrayList<QuanLyHocVien> data = new ArrayList<>();
        String sql = "Select * from tbHocVien";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                QuanLyHocVien quanLyHocVien = new QuanLyHocVien();
                quanLyHocVien.setTenHocVien(cursor.getString(0));
                quanLyHocVien.setMonHoc(cursor.getString(1));
                quanLyHocVien.setSoTinChi(Integer.parseInt(cursor.getString(2)));
                data.add(quanLyHocVien);
            } while (cursor.moveToNext());
        }

        return data;
    }
}

package tdc.edu.vn.buiduythanh_qlsv;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import tdc.edu.vn.buiduythanh_qlsv.QuanLyHocVien;

public class DatabaseHocVien extends SQLiteOpenHelper {


    public DatabaseHocVien(Context context) {
        super(context, "db_HocVien", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "Create table tbHocVien(hoten text, monhoc text,sotinchi text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void ThemDuLieu(QuanLyHocVien hv) {
        String sql = "insert into tbHocVien values (?,?,?)";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{hv.getTenHocVien(), hv.getMonHoc(), String.valueOf(hv.getSoTinChi())});
        db.close();
    }

    public void XoaDuLieu(QuanLyHocVien hv) {
        String sql = "delete from tbHocVien where hoten = ?";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{hv.getTenHocVien()});
        db.close();
    }

    public void SuaDuLieu(QuanLyHocVien hv) {
        String sql = "update tbHocVien set monhoc=?,sotinchi=? where hoten=?";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql, new String[]{hv.getMonHoc(), String.valueOf(hv.getSoTinChi()),hv.getTenHocVien() });
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

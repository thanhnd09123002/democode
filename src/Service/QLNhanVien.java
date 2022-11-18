/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.NhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLNhanVien implements IService<NhanVien> {

    private List<NhanVien> _lstNhanViens;

    public QLNhanVien() {
        _lstNhanViens = new ArrayList<>();
    }

    @Override
    public String Insert(NhanVien var) {
        if (var == null || var.getManv().isEmpty() || var.getTennv().isEmpty() || var.getTuoi().isEmpty() || var.getEmail().isEmpty() || var.getLuong().isEmpty()) {
            return "Insert fail !!!";
        }
        _lstNhanViens.add(var);
        return "Insert Success !!!";
    }

    @Override
    public String Edit(NhanVien var, int index) {
        if (index < 0) {
            return "No found !!!";
        }
        _lstNhanViens.get(index).setTennv(var.getTennv());
        _lstNhanViens.get(index).setTuoi(var.getTuoi());
        _lstNhanViens.get(index).setEmail(var.getEmail());
        _lstNhanViens.get(index).setLuong(var.getLuong());
        return "Update Success !!!";
    }

    @Override
    public String Delete(int index) {
        if (index < 0) {
            return "No found !!!";
        }
        _lstNhanViens.remove(index);
        return "Delete Successs !!!";
    }

    @Override
    public List<NhanVien> Find(String txt) {
        var lstTemp = new ArrayList<NhanVien>();
        for (NhanVien x : _lstNhanViens) {
            if (txt.equals(x.getManv())) {
                lstTemp.add(x);
            }
        }
        return lstTemp;
    }

    @Override
    public List<NhanVien> getListData() {
        return _lstNhanViens;
    }

    @Override
    public String ghiFile(String path) {
        try {
            //Check sự tồn tại của file
            File file = new File(path);
            if (!file.exists()) {// Nếu file không tồn tại
                file.createNewFile();//Tạo mới file
            }
            //Tiến hành ghi file 
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (NhanVien x : _lstNhanViens) {
                oos.writeObject(x);
            }
            oos.close();
            fos.close();
            return "File saved Success !!!";
        } catch (Exception e) {
            e.printStackTrace();// In ra lỗi chỗ nào
            return "Save Fail !!!";
        }
    }

    @Override
    public String docFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "File can't found !!!";
            }
            _lstNhanViens.clear();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {    // Cứ khi nào dữ liệu trong file còn , thì còn đọc FIle            
                var temp = ois.readObject();
                _lstNhanViens.add((NhanVien) temp);
            }
            ois.close();
            fis.close();
            return "Write file Success !!!";

        } catch (Exception e) {
            e.printStackTrace();// In ra lỗi chỗ nào
            return "Write Fail !!!";
        }
    }

    @Override
    public boolean checkMa(String txt) {
        for (NhanVien x : getListData()) {
            if (x.getManv().equals(txt)) {
                return true;
            }
        }
        return false;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IService<T> {

    public String Insert(T var); //Thêm 

    public String Edit(T var, int index); // Sửa theo Index

    public String Delete(int index);

    public List<T> Find(String txt);
    
    public List<T> getListData();// Lấy danh sách của iist Obj

    public String ghiFile(String path);

    public String docFile(String path);
    public boolean checkMa(String txt);
}

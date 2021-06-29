/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class di_data_joki {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    
    public String ID;
    public String Nama_Pelanggan;
    public String Tipe_Tugas;
    public String Nama_Pekerja;
    public String Prioritas;
    
    public void simpan()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO input_data_joki(ID,Nama_Pelanggan,Tipe_Tugas,Nama_Pekerja,Prioritas)VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,ID);
        pst.setString(2,Nama_Pelanggan);
        pst.setString(3,Tipe_Tugas);
        pst.setString(4,Nama_Pekerja);
        pst.setString(5,Prioritas);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = Koneksi.getKoneksi();
        String sql = "UPDATE input_data_joki SET Nama_Pelanggan=?,Tipe_Tugas=?,Nama_Pekerja=?,Prioritas=? WHERE ID=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,Nama_Pelanggan);
        pst.setString(2,Tipe_Tugas);
        pst.setString(3,Nama_Pekerja);
        pst.setString(4,Prioritas);
        pst.setString(5,ID);
        pst.executeUpdate();
        pst.close();
    }
    
    public void hapus()throws SQLException{
        conn = Koneksi.getKoneksi();
        String sql = "DELETE from input_data_joki where ID=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, ID);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet UpdateJTable()throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "select ID,Nama_Pelanggan,Tipe_Tugas,Nama_Pekerja,Prioritas from input_data_joki";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Aditya Pratama
 */
public class Date {
    public static java.util.Date tanggal(JTable table, int kolom){
    JTable tabel = table;
    String tgl = String.valueOf(table.getValueAt(tabel.getSelectedRow(), kolom));
    java.util.Date tanggal1 = null;
    try{
        tanggal1 = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
        

}catch(ParseException ex){
    Logger.getLogger(Date.class.getName()).log(Level.SEVERE, null, ex);
}
return tanggal1;
}
    
}

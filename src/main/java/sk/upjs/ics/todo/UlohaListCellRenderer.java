package sk.upjs.ics.todo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class UlohaListCellRenderer extends DefaultListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
       Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
       Uloha uloha =(Uloha) value;
       if(jesplnena(uloha) && !isSelected){
           component.setBackground(Color.GREEN);
       }
       return component;
    } 

    private boolean jesplnena(Uloha uloha) {
        return true;
    }
}
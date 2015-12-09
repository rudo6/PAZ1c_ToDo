package sk.upjs.ics.todo;

import javax.swing.table.AbstractTableModel;

public class KategoriaTableModel extends AbstractTableModel{
    private KategoriaDao kategoriaDao = new MySqlKategoriaDao();
    
    
    private static final int STLPEC_POCET_ULOH = 1;
    private static final int STLPEC_NAZOV = 0;
    private static final int RIADOK_PRE_VSETKY_ULOHY = 1;
    
    private static final String[] NAZVY_STLPCOV = {"Nazov", "Pocet uloh"};
    
    private UlohaDao ulohaDao = ulohaDaoFactory.INSTANCE.getUlohaDao();

    @Override
    public int getRowCount() {
        return kategoriaDao.dajVsetky().size() + RIADOK_PRE_VSETKY_ULOHY;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kategoria kategoria = null;
        if (rowIndex == 0) {
            kategoria = new Kategoria();
            kategoria.setNazov("Vsetky ulohy");
            kategoria.setUlohy(ulohaDao.dajVsetky());
        } else {
            kategoria = kategoriaDao.dajVsetky().get(rowIndex - RIADOK_PRE_VSETKY_ULOHY);
        }
        switch (columnIndex) {
            case STLPEC_NAZOV:
                return kategoria.getNazov();
            case STLPEC_POCET_ULOH:
                return kategoria.getUlohy().size();
            default:
                return "???";
        }

    }

    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }
    
    public Kategoria getKategoria(int index){
        if(index == 0){
            Kategoria kategoria = new Kategoria();
            kategoria.setNazov("Vsetky ulohy");
            kategoria.setUlohy(ulohaDao.dajVsetky());
            return kategoria;
        }else
            return kategoriaDao.dajVsetky().get(index - RIADOK_PRE_VSETKY_ULOHY);
    }
    
}

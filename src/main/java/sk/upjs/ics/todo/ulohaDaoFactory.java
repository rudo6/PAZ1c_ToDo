package sk.upjs.ics.todo;

public enum ulohaDaoFactory {
    //enum napr. mesiac lebo je ich 12 teda pevny pocet a nebudu sa menit
    //tuto vzdy len new mysqlulohadao cize 1 polozka
    INSTANCE;
    
    public UlohaDao getUlohaDao() {
        /*String profil = System.getProperty("profil");
        if("db".equals(profil)){
            return new MySqlUlohaDao();
        } else{
            return new PamatovyUlohaDao();
       }*/
             return new MySqlUlohaDao();
    }
}

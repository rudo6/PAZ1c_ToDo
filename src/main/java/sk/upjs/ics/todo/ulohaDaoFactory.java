package sk.upjs.ics.todo;

public enum ulohaDaoFactory {
    //enum napr. mesiac lebo je ich 12 teda pevny pocet a nebudu sa menit
    //tuto vzdy len new mysqlulohadao cize 1 polozka
    INSTANCE;
    
    public UlohaDao getUlohaDao() {
        return new MySqlUlohaDao();
    }
}

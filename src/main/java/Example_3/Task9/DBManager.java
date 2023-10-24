package Example_3.Task9;

public class DBManager implements DBWorkers{

    private final String[] dataBase;
    private int index;

    public DBManager(String[] dataBase) {
        this.dataBase = dataBase;
        index = 0;
    }

    @Override
    public boolean saveData(String data) {
        if (index < dataBase.length) {
            dataBase[index] = data;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public String getData(int id) {
        if (id < dataBase.length) {
            return dataBase[id];
        }
        return null;
    }

    @Override
    public boolean deleteData(int id) {
        if (id < dataBase.length && dataBase[id] != null) {
            dataBase[id] = null;
            return true;
        }
        return false;
    }
}

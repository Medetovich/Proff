package lesson4.stat;
// шаблон синглтон  singleton
// иногда бывает нужно сделать так, чтобы можно создать только
// один экемпляр класса
public class DataBaseConnector {
    private String conn; // static означает, что это поле создается для класса

    public DataBaseConnector(String connection) {
        this.conn = connection;
    }

    public String getConnection() {
        return conn;
    }
}
class Logger{
    private static Logger instance;// для хранения единственного экземпляра класса
    private Logger(){}// чтобы нельзя было класс создать
    public static Logger getInstance(){ //статический инициализатор
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}

class Tester{
    public static void main(String[] args) {

        DataBaseConnector con1 = new DataBaseConnector("mysql://mydb:34/mybase");
        DataBaseConnector con2 = new DataBaseConnector("oracle://oracledb:64/enterprise");

        System.out.println(con1.getConnection());
        System.out.println(con2.getConnection());
    }
}

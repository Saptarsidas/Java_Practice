 /*Design an interface Database with methods connect() and disconnect().
 Implement classes MySQLDatabase and OracleDatabase that implement the Database interface.
 Override the methods for database-specific operations*/
 interface Database {
    void connect();
    void disconnect();
 }
 class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    
    }
}
class OracleDatabase implements Database{
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    
}
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }
}
class Database_details{
    public static void main(String[] args) {
        MySQLDatabase m=new MySQLDatabase();
        OracleDatabase o=new OracleDatabase();
        m.connect();
        m.disconnect();
        o.connect();
        o.disconnect();
    }
}


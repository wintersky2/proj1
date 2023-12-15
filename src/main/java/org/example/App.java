package org.example;

import org.example.db.DBConnection;

public class App {
    public App() {
        DBConnection.DB_NAME = "runningRecordProj";
        DBConnection.DB_PORT = 3306;
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";

        Global.getDBConnection().connect();
    }

    public void run() {
        System.out.println("==== 런닝 기록 앱 실행 ====");
        while (true){

        }
    }
}

package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.db.DBConnection;

import java.time.LocalDateTime;
import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
public class Global {
    private static DBConnection dbConnection;
    private static Scanner scanner;

    public static DBConnection getDBConnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public static void initScanner() {
        scanner = new Scanner(System.in);
    }

    public static void closeScanner() {
        scanner.close();
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static String getNowDateTime() {
        String nowDateTime = LocalDateTime.now().toString();
        return nowDateTime;
    }

}

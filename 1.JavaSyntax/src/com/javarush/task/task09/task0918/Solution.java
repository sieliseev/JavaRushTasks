package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends NullPointerException{
    }

    static class MyException2 extends ArithmeticException{
    }

    static class MyException3 extends IOException{
    }

    static class MyException4 extends SQLException{
    }
}


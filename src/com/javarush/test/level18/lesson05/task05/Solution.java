package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            FileInputStream inputStream = new FileInputStream(reader.readLine());
            while (inputStream.available() > 0) {
                byte[] buffer = new byte[1000];
                int count = inputStream.read(buffer);
                if (count < 1000)
                {
                    inputStream.close();
                    throw new DownloadException();
                }
                inputStream = new FileInputStream(reader.readLine());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static class DownloadException extends Exception{

    }
}

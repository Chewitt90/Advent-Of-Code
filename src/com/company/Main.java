package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "/Users/curtishewitt/Advent of Code Day 1/src/input";
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader streamreader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamreader);


        List<Integer> inputNumberList = new ArrayList();
        List<Integer> repeatNumberCheck = new ArrayList<>();
        int repeatNumber = 0;

        String line;
        while((line = bufferedReader.readLine()) != null) {
            inputNumberList.add(Integer.parseInt(line));
        }
        int startNumber = 0;

        do {
            for (int number: inputNumberList) {
                repeatNumber = startNumber += number;

                repeatNumberCheck.add(repeatNumber);

                if (repeatNumberCheck.contains(repeatNumber)) {
                    System.out.println(repeatNumber);
                    break;
                }


            }
        } while (repeatNumberCheck.contains(repeatNumber));




        //System.out.println(repeatNumber);


        bufferedReader.close();
    }
}

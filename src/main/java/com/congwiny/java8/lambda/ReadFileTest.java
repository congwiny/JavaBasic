package com.congwiny.java8.lambda;

import java.io.*;

public class ReadFileTest {
    public static void main(String[] args) {
        try {
            String str = processFile();
            System.out.println(str);

            //lambda 行为参数化
            String str2 = processFile(BufferedReader::readLine);
            System.out.println(str2);
            String str3 = processFile((BufferedReader br) -> br.readLine() + br.readLine());
            System.out.println(str3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //try-with-resources语法。最后br会自动释放资源
    public static String processFile() throws IOException {
        String filePath = "/home/congwiny/IdeaProjects/JavaBasic/src/main/resources/hello.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException {
        String filePath = "/home/congwiny/IdeaProjects/JavaBasic/src/main/resources/hello.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return processor.process(br);
        }
    }

}

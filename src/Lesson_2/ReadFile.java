package Lesson_2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {
    public static void main(String[] args) {

//        read();
        finallyAndExit();
    }

    private static void read(){
        InputStream inputStream;
        BufferedReader reader = null;
        try {
            inputStream = ReadFile.class.getClassLoader().getResourceAsStream("notepad.txt");
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException e){

            }
        }
    }

    public static void finallyAndExit(){
        try {
            System.out.println("In try");
            System.exit(0);
        }finally {
            System.out.println("In Finally");
        }

    }
}



package com.xworkz.boot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NEW { public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
      try {
        URLConnection connection = url.openConnection();
      //  connection.setRequestMethod("GET");
        String line = "";
        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder();
        while((line = bufferedReader.readLine()) != null) {
          response.append(line);
        }
        bufferedReader.close();
        System.out.println("Response: " + response.toString());
        System.out.println(inputStream);
      } catch (IOException ioEx) {
        System.out.println(ioEx);
      }
    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
  }   

}

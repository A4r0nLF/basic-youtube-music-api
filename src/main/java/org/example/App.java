package org.example;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        App app = new App();
    }

    public App() {
        tryout();
    }

    public void tryout() {
        RequestJSON dataloader = new RequestJSON();
        Parser parser = new Parser();

        //Get search Suggestions. Returns Arraylist of OnlineSong
        //System.out.println(parser.parseSearchResults(dataloader.getSearchSuggestions("samra")));

        //Get Search Results (Songs and Top Result if is a song). Returns Arraylist of OnlineSong
        //System.out.println(parser.parseSearchResults(dataloader.getSearchResult("samra")));

        //Get more Searchresults for the (of songs only). Returns Arraylist of OnlineSong
        //System.out.println(parser.parseSearchResults(dataloader.getMoreSearchResult(parser.getTempQuery(), parser.getTempParam())));

        //Get content of playlist. Returns Arraylist of OnlineSong
        //parser.getPlaylist(dataloader.getPlaylist("oL99C1YkiMM","RDAMVMoL99C1YkiMM"));
    }

    //Needed for Unit Tests:
    //For testing offline JSON parsing
    public static String readFile(String filename) {
        String data = "";
        try {
            File fileObj = new File(ClassLoader.getSystemClassLoader().getResource(filename).getFile());
            //File myObj = new File("C:\\Users\\aarfri\\Documents\\YTMusicAPI\\src\\test\\java\\org\\example\\" + filename + ".json");
            Scanner myReader = new Scanner(fileObj);
            while (myReader.hasNextLine()) {
                data = data + (myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        }
        return data;
    }

}

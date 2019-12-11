package com.bigtao.boggle;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Dictionnary dictionnary = new Dictionnary();
        dictionnary.loadFromURL(new URL("file:///D:/Dev/corpus.txt"));
        System.out.println("Dictionnary Size: " + dictionnary.getWords().size());

        Grid grid = new Grid();
        grid.loadFromURL(new URL("file:///D:/dev/grille.txt"));

        Solver solver = Solver.builder().dictionnary(dictionnary).grid(grid).build();
        Collection<String> results = solver.solve();

        for (String result: results) {
            System.out.println(result);
        }
    }
}

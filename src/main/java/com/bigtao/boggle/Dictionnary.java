package com.bigtao.boggle;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;

public class Dictionnary {
    private List<String> words;

    public Collection<String> getWords() {
        return words;
    }

    public void loadFromURL(URL resource) throws URISyntaxException, IOException {
        words = readAllLines(get(resource.toURI()));
    }
}

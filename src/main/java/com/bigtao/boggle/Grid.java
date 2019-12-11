package com.bigtao.boggle;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Grid {

    private List<String> rows;
    private List<String> columns;

    public Collection<String> getRows() {
        return rows;
    }

    public Collection<String> getColumns() {
        return columns;
    }

    public void loadFromURL(URL url) throws IOException, URISyntaxException {
        rows = Files.readAllLines(Paths.get(url.toURI()));

        int numberOfColumns = rows.get(0).length();
        StringBuilder sb[] = new StringBuilder[numberOfColumns];
        for (int i=0; i<numberOfColumns; ++i) {
            sb[i] = new StringBuilder();
        }

        for (int i=0; i<numberOfColumns; ++i) {
            for (String row: rows) {
                sb[i].append(row.charAt(i));
            }
        }

        columns = new ArrayList<String>();
        for (int i=0; i<numberOfColumns; ++i) {
            columns.add(sb[i].toString());
        }
    }
}

package com.bigtao.boggle;

import lombok.Builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Builder
public class Solver {
    private Grid grid;
    private Dictionnary dictionnary;

    public Collection<String> solve() {
        List<String> result = new ArrayList<String>();
        for (String word : dictionnary.getWords()) {
            for (String column : grid.getColumns()) {
                if (column.toLowerCase().contains(word.toLowerCase())) {
                    result.add(word.toLowerCase());
                }
            }

            for (String column : grid.getRows()) {
                if (column.toLowerCase().contains(word.toLowerCase())) {
                    result.add(word.toLowerCase());
                }
            }
        }
        return result;
    }
}

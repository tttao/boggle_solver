package com.bigtao.boggle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class SolverShould {

    @Test
    public void return_the_words_given_an_input_grid_ignoring_case() {
        Grid grid = mock(Grid.class);
        when(grid.getRows()).thenReturn(asList("CACA", "aout", "corr", "sdfe"));
        when(grid.getColumns()).thenReturn(asList("cacs", "aood", "curf", "atre"));

        Dictionnary dictionnary = mock(Dictionnary.class);
        when(dictionnary.getWords()).thenReturn(asList("caCa", "toto", "aout", "cor", "atre"));

        Solver solver = Solver.builder()
                .grid(grid)
                .dictionnary(dictionnary)
                .build();

        Collection<String> result = solver.solve();

        assertThat(result, hasItems("caca", "aout", "cor", "atre"));
    }
}

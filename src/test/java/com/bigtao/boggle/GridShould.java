package com.bigtao.boggle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GridShould {

    @Test
    public void load_grid_from_file() throws Exception {
        Grid grid = new Grid();
        grid.loadFromURL(getClass().getResource("/grid.txt"));

        assertThat(grid.getRows(), hasItems("caca", "aout", "corr", "sdfe"));
        assertThat(grid.getColumns(), hasItems("cacs", "aood", "curf", "atre"));
    }
}
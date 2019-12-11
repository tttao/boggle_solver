package com.bigtao.boggle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DictionnaryShould {

    @Test
    public void load_words_from_text_file() throws IOException, URISyntaxException {
        Dictionnary dictionnary = new Dictionnary();
        dictionnary.loadFromURL(getClass().getResource("/dictionnary.txt"));

        assertThat(dictionnary.getWords(), hasItems("caca", "toto", "aout", "cor", "atre"));
    }
}

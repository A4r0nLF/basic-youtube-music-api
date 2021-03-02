package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private App app;
    private Parser parser;
    private RequestJSON dataloader;

    @Before
    public void setUp() {
        app = new App();
        parser = new Parser();
        dataloader = new RequestJSON();
    }

    /**
     * Offline Test
     */
    @Test
    public void searchSuggestionsOffline() {
        ArrayList<String> srchSugLst = parser.parseSearchSuggestions(App.readFile("testSearchSuggestions.json"));
        assertEquals(srchSugLst.size(), 7);
        assertEquals("samra", srchSugLst.get(0));
        assertEquals("samra lost", srchSugLst.get(1));
        assertEquals("samra rohdiamant", srchSugLst.get(2));
        assertEquals("samra baebae", srchSugLst.get(3));
        assertEquals("samra goldjunge", srchSugLst.get(4));
        assertEquals("samra cataleya", srchSugLst.get(5));
        assertEquals("samra kennst du das", srchSugLst.get(6));

    }

    @Test
    public void searchResultsOffline() {
        ArrayList<OnlineSong> srchResLst = parser.parseSearchResults(App.readFile("testSearchResults.json"));
        assertEquals(srchResLst.size(), 3);
        assertEquals("OnlineSong{albumName='Kennst du das ?!', artistName='Samra', duration=0, " +
                        "title='Kennst du das ?!', imgUrl='https://lh3.googleusercontent.com/b4dgifzySJQ49-Z5UdsBX" +
                        "1VHn3_R7lmJjHO1pdX_xDFyxdRVJ9xmpvpCDM0GHCUU-D0I_raHCZRSiIM=w120-h120-l90-rj', " +
                        "songUrl='https://music.youtube.com/watch?v=oL99C1YkiMM', ytMusicID='oL99C1YkiMM', " +
                        "ytMusicPlyListID='RDAMVMoL99C1YkiMM'}"
                , srchResLst.get(0).toString());
        assertEquals("OnlineSong{albumName='Lost', artistName='Samra & TOPIC42', duration=0, " +
                        "title='Lost', imgUrl='https://lh3.googleusercontent.com/zigzA-0bN4-Cf5HH-CTRoJ0JRzBq0pKZ" +
                        "Og_G--vipkVx3Ho3i6vHvPm5yjpim_0RGo61_MX2StrfA2u0=w120-h120-l90-rj', " +
                        "songUrl='https://music.youtube.com/watch?v=7geJ4dLPASo', ytMusicID='7geJ4dLPASo', " +
                        "ytMusicPlyListID='RDAMVM7geJ4dLPASo'}"
                , srchResLst.get(1).toString());
        assertEquals("OnlineSong{albumName='Rohdiamant', artistName='Samra', duration=0, " +
                        "title='Rohdiamant', imgUrl='https://lh3.googleusercontent.com/NZqAKWZVRjt8i0gc2gdFuc1LepV" +
                        "2E1yjIaO8WQlGK5b2akHPkkdeDfwrQFmgYhDBm4UPwOm-ji3cDcfz=w120-h120-l90-rj', " +
                        "songUrl='https://music.youtube.com/watch?v=moYp25VtTgw', ytMusicID='moYp25VtTgw', " +
                        "ytMusicPlyListID='RDAMVMmoYp25VtTgw'}"
                , srchResLst.get(2).toString());

    }

    @Test
    public void moreSearchResultsOffline() {
        ArrayList<OnlineSong> mreSrchResLst = parser.parseSearchResults(App.readFile("testMoreSearchResults.json"));
        assertEquals(mreSrchResLst.size(), 20);
        assertEquals("Kennst du das ?!", mreSrchResLst.get(0).albumName);
        assertEquals("TOPIC42", mreSrchResLst.get(1).artistName);
        assertEquals("https://music.youtube.com/watch?v=KapW2Q-T1jQ", mreSrchResLst.get(5).songUrl);
        assertEquals("RDAMVMPJ6ZZGLjCoU", mreSrchResLst.get(7).ytMusicPlyListID);
        assertEquals("COLT", mreSrchResLst.get(13).title);
        assertEquals("https://lh3.googleusercontent.com/etN7GlR6r8pJLk8NwQ6SJYX4zbqocScBeqbTBcUNG7I9q6RUEwQ" +
                "hXF9rriFi2WAc932r1iSRKUAlOkJ1aA=w120-h120-l90-rj", mreSrchResLst.get(17).imgUrl);
        assertEquals("VE6-jc8kpRQ", mreSrchResLst.get(19).ytMusicID);
    }

    @Test
    public void getPlaylistOffline() {
        ArrayList<OnlineSong> playlistContent = parser.parsePlaylist(App.readFile("testGetPlaylistFromID.json"));
        assertEquals(playlistContent.size(), 25);
        assertEquals("Goldjunge", playlistContent.get(0).albumName);
        assertEquals("Samra", playlistContent.get(1).artistName);
        assertEquals("https://music.youtube.com/watch?v=oL99C1YkiMM", playlistContent.get(5).songUrl);
        assertEquals("RDAMVMKapW2Q-T1jQ", playlistContent.get(7).ytMusicPlyListID);
        assertEquals("Bitte geh", playlistContent.get(13).title);
        assertEquals("https://lh3.googleusercontent.com/6pB52KSQi9kizA0f-5z1tzF0W31K63LH35JZS2LYyA8aVyXiAJgy" +
                "lta7HiYEOYs0nfdcgdh2LTHIxUH8UA=w544-h544-l90-rj", playlistContent.get(15).imgUrl);
        assertEquals("4VetNiMrzyw", playlistContent.get(17).ytMusicID);
        assertEquals("Renn", playlistContent.get(23).title);
        assertEquals("Ghetto", playlistContent.get(24).albumName);

    }

    /**
     * Online Test
     */
    @Test
    public void searchSuggestionsOnline() {
        assertTrue(true);
        //TODO
    }

    @Test
    public void searchResultsOnline() {
        assertTrue(true);
        //TODO
    }

    @Test
    public void moreSearchResultsOnline() {
        assertTrue(true);
        //TODO
    }

    @Test
    public void getPlaylistOnline() {
        assertTrue(true);
        //TODO
    }

}

package com.example.mt1556ys.travel.citydata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class CityContent {

    /**
     * A list of city names.
     */
    public static List<CityItem> ITEMS = new ArrayList<>();

    /**
     * A map of cities, by (String) ID.
     */
    public static Map<String, CityItem> ITEM_MAP = new HashMap<>();

    static {
        // Add 3 sample items.
        addItem(new CityItem("1", "New York", "https://en.wikipedia.org/wiki/New_York"));
        addItem(new CityItem("2", "Cairo", "https://en.wikipedia.org/wiki/Cairo"));
        addItem(new CityItem("3", "Paris", "https://en.wikipedia.org/wiki/Paris"));
        addItem(new CityItem("4", "Yaounde", "https://en.wikipedia.org/wiki/Yaoundé"));
        addItem(new CityItem("5", "Nairobi", "https://en.wikipedia.org/wiki/Nairobi"));
    }

    private static void addItem(CityItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class CityItem {
        public String id;
        public String content;
        public String url;

        public CityItem(String id, String content, String url) {
            this.id = id;
            this.content = content;
            this.url = url;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

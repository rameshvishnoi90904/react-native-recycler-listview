package com.customlistview;

/**
 * Created by root on 25/10/16.
 */

public class ListViewCell {
    private String title, subtitle;

    public ListViewCell(String title,String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public ListViewCell(String title, String genre, String year) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getSubtitle() {
        return subtitle;
    }

}

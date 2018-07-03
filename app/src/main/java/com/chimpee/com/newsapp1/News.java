package com.chimpee.com.newsapp1;

import java.util.Date;
/**
 * An {@link News} object contains information related to a single news.
 */
public class News {
    /**
     * Title of the news.
     */
    private String title;
    /**
     * Name of the section of the news.
     */
    private String section;
    /**
     * Name of the author of the news.
     */
    private String author;
    /**
     * Published date of the news.
     */
    private Date date;
    /**
     * Url of the news.
     */
    private String webUrl;

    /**
     * Constructs a new {@link News} object.
     * @param title   is the title of the news
     * @param date    is the news publication date
     * @param webUrl  is the website URL to find more details about the news
     * @param author  is the news author full name
     * @param section is the section where the news happened
     */
    public News(String title, Date date, String webUrl, String author, String section) {
        this.title = title;
        this.section = section;
        this.author = author;
        this.date = date;
        this.webUrl = webUrl;
    }

    /**
     * Returns the title of the news.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the section name of the news.
     */
    public String getSection() {
        return section;
    }

    /**
     * Returns the author name of the news.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the publication date of the news.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the url of the news for details.
     */
    public String getWebUrl() {
        return webUrl;
    }

    @Override
    public String toString() {
        return title + " " + author + "" + date + " " + section + " " + webUrl;
    }
}

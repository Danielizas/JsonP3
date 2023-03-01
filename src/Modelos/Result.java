package Modelos;

import java.util.List;

public class Result {
    private String Title;
    private String Summary;
    private String Url;
    private String ClickUrl;
    private String RefererUrl;
    private int FileSize;
    private String FileFormat;
    private String Height;
    private String Width;
    private List<Thumbnail> Thumbnail;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getClickUrl() {
        return ClickUrl;
    }

    public void setClickUrl(String clickUrl) {
        ClickUrl = clickUrl;
    }

    public String getRefererUrl() {
        return RefererUrl;
    }

    public void setRefererUrl(String refererUrl) {
        RefererUrl = refererUrl;
    }

    public int getFileSize() {
        return FileSize;
    }

    public void setFileSize(int fileSize) {
        FileSize = fileSize;
    }

    public String getFileFormat() {
        return FileFormat;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String width) {
        Width = width;
    }

    public List<Thumbnail> getThumbnails() {
        return Thumbnail;
    }

    public void setThumbnails(List<Thumbnail> thumbnails) {
        this.Thumbnail = thumbnails;
    }
}

package com.example.beautifulworld;

public class RowModelList1 {
    int imageView;
    String Tickets, textContent;

    public RowModelList1(int imageView, String tickets, String textContent) {
        this.imageView = imageView;
        Tickets = tickets;
        this.textContent = textContent;

    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTickets() {
        return Tickets;
    }

    public void setTickets(String tickets) {
        Tickets = tickets;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}

package com.yair.model;

public class BestSeller extends Book{

    public BestSeller(int id, String name, double price, String summary, int worldCopies) {
        super(id, name, price);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    protected String summary;
    protected int worldCopies;


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "BestSeller{" +
                "summary='" + summary + '\'' +
                ", worldCopies=" + worldCopies +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

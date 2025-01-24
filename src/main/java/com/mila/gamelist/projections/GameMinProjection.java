package com.mila.gamelist.projections;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getReleaseYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}

package uk.co.noxtech.boardgamegeek.api.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

    private String name;
    private Integer yearPublished;
    private String image;
    private String thumbnail;
    private Status status;
    private Integer numPlays;

}

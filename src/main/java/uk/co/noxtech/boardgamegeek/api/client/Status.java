package uk.co.noxtech.boardgamegeek.api.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Status {

    private Boolean own;
    private Boolean prevowned;
    private Boolean fortrade;
    private Boolean want;
    private Boolean wanttoplay;
    private Boolean wanttobuy;
    private Boolean wishlist;
    private Boolean preordered;
    private LocalDate lastmodified;

}

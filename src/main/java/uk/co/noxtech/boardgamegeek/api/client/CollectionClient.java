package uk.co.noxtech.boardgamegeek.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "collection-client", path = "${boardgamegeek.apiUrl}")
public interface CollectionClient {

    @RequestMapping("")
    public String getName();
}

package guru.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import guru.sfg.brewery.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDesirialize() throws IOException {
        String json = "{\"id\":\"35304e7b-2434-4046-a675-b6c8d9a65f35\",\"version\":null,\"createdDate\":\"2023-04-12T18:09:24-0500\",\"lastModifiedDate\":\"2023-04-12T18:09:24-0500\",\"beerName\":\"BeerName\",\"beerStyle\":\"ALE\",\"upc\":1231244334,\"price\":\"12.9900000000000002131628207280300557613372802734375\",\"quantityOnHand\":null}\n";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
    }
}
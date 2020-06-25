package spaceship;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class SpaceShipCsvWriterTest {

    @Test
    void doWriter() throws IOException {
        new SpaceShipCsvWriter().doWriter();
    }
}
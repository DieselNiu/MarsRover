import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarRoverTest {
    @Test
    void should_init_rover_state_given_position_and_direction() {
        MarsRover marsRover = new MarsRover(new Position(0, 0), Direction.N);
        int positionX = marsRover.getPositionX();
        int positionY = marsRover.getPositionY();
        Direction direction = marsRover.getDirection();
        assertThat(positionX).isEqualTo(0);
        assertThat(positionY).isEqualTo(0);
        assertThat(direction).isEqualTo(Direction.N);
    }
    @Test
    void should_turn_north_to_west_when_turn_left(){
        MarsRover marsRover = new MarsRover(new Position(0, 0), Direction.N);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }
    @Test
    void should_turn_west_to_south_when_turn_left(){
        MarsRover marsRover = new MarsRover(new Position(0, 0), Direction.W);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }
    @Test
    void should_turn_east_to_north_when_turn_left(){

        MarsRover marsRover = new MarsRover(new Position(0, 0), Direction.E);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }
}

package youtube.java.puzzle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Entity {
    private int id;
    private String message;

}

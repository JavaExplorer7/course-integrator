package course.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Staff {
  
  @Id
  private final String id;
  private final String name;
  private final String email;
  private final Position position;
  
  public static enum Position {
    CA, INSTRUCTOR
  }
  
  public boolean isInstructor() {
    return this.position == Position.INSTRUCTOR;
  }
  
}

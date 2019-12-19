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
public class Course {

  @Id
  private final String id;
  private final String title;
  private final Type type;
  private final double credit;
  private final int theory;
  private final int experiment;
  private final int semester;

  public static enum Type {
    PO, PFC, PFO, MF, MC, MO, C, U, P
  }

}

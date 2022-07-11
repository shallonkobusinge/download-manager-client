package rca.ne.client.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Website {

    LocalDateTime startDate;
    LocalDateTime endDate;
    LocalDateTime totalElapsedTime;
    String numberOfKilobytesDownloaded;
    private Long id;
    private String name;
}

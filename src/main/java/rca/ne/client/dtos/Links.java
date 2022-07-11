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
public class Links {

    private Long id;
    private String linkName;
    private LocalDateTime totalElapsedTime;
    private String numberOfKilobytesDownloaded;
    private Website website;
}

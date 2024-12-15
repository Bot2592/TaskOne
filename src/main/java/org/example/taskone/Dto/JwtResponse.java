package org.example.taskone.Dto;

import com.mongodb.annotations.Sealed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Sealed
public class JwtResponse {
    private String token;

}

package org.example.client.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Task {

    private Long id;
    private String description;
    private LocalDateTime createdAt;
    private boolean completed;
}
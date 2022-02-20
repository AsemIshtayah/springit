package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    //link
    @ManyToOne
    @NonNull
    private Link link;

    public Comment(@NonNull String body, @NonNull Link link) {
        this.body = body;
        this.link = link;
    }
}

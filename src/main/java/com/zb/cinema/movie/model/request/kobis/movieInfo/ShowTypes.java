package com.zb.cinema.movie.model.request.kobis.movieInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowTypes {

    private String showTypeGroupNm;
    private String showTypeNm;
}

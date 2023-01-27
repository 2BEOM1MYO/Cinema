package com.zb.cinema.ticketing.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long memberId;		// 누가
	private Long movieCode;		// 어떤 영화를
	private Long theaterId;		// 어디 극장
	private Long auditoriumId;	// 상영관
	private boolean status;		// 예매 완료
	private LocalDateTime bookDt;	// 이건 결제 일시 받아오기 = 예매 완료한 시간
	private LocalDateTime startDt;	// 상영 일시
	private LocalDateTime endDt;	// 끝나는 시간

	private String seat;
}

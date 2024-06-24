package com.spacestar.back.kafka.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MatchingMessage implements Message{

	private String senderUuid;
	private String receiverUuid;
	private String content;
}

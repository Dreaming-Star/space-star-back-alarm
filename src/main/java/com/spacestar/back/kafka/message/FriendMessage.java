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
public class FriendMessage {

	private String senderUuid;
	private String receiverUuid;
	private String content;
}

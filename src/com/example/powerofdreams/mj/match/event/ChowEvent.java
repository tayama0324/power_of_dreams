package com.example.powerofdreams.mj.match.event;

import com.example.powerofdreams.mj.player.PlayerWind;
import com.example.powerofdreams.mj.player.playerhand.Meld;
import com.google.common.base.Preconditions;

public class ChowEvent implements Event {

	private final PlayerWind actor;
	private final Meld meld;
	
	private ChowEvent(PlayerWind actor, Meld meld) {
		this.actor = Preconditions.checkNotNull(actor);
		this.meld = Preconditions.checkNotNull(meld);
	}
	
	@Override
	public EventType getEventType() {
		return EventType.CHOW;
	}

	public PlayerWind getActor() {
		return actor;
	}
	
	public Meld getMeld() {
		return meld;
	}
	
	public static ChowEvent of(PlayerWind actor, Meld meld) {
		return new ChowEvent(actor, meld);
	}
}

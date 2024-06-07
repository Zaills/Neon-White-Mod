package net.zaills.neonwhite.client.components.player;

import net.zaills.neonwhite.item.Card.ACard;

public interface INeonComponent {
	void toggleNeon();

	boolean Is_Neon();

	void new_card(ACard card);

	void destroy_card();

	void swap_card();
	//mask color color()
}

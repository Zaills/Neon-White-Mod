package net.zaills.neonwhite.client.components.player;

import net.zaills.neonwhite.item.Card.ACard;
import net.zaills.neonwhite.item.Card.Fist;
import net.zaills.neonwhite.item.Card.Katana;
import org.jetbrains.annotations.Nullable;

public class NeonComponent implements INeonComponent {
	boolean neon;
	Fist fist;
	Katana katana;
	@Nullable
	ACard main_card;
	@Nullable
	ACard second_card;

	@Override
	public void toggleNeon() {
		neon = !neon;
	}

	@Override
	public boolean Is_Neon() {
		return neon;
	}

	@Override
	public void new_card(ACard card) {
		if (main_card != null) {
			if (card.getType() == main_card.getType()) {
				main_card.SameCard();
				return;
			}
			if (card.getType() == second_card.getType()) {
				second_card.SameCard();
				swap_card();
				return;
			}
			second_card = main_card;
		}
		main_card = card;
	}

	@Override
	public void destroy_card() {
		main_card = null;
		if (second_card != null)
			main_card = second_card;
		second_card = null;
	}

	@Override
	public void swap_card() {
		ACard tmp;
		if (main_card != null && second_card != null) {
			tmp = main_card;
			main_card = second_card;
			second_card = tmp;
		}
	}
}

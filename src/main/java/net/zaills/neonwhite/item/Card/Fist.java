package net.zaills.neonwhite.item.Card;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class Fist extends ACard {
	public Fist(Settings settings) {
		super(settings, 10, Card_type.FIST);
	}

	@Override
	protected void OnRightClick(World world, PlayerEntity user) {
		System.out.println("N/A");
	}

	@Override
	protected void OnLeftClick(World world, PlayerEntity user) {
		System.out.println("Simple punches. Depleting this card causes instant death.");
	}

	@Override
	protected void OnPickUp(World world, PlayerEntity user) {
		System.out.println("N/A");
	}
}

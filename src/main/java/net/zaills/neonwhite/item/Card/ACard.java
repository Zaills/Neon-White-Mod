package net.zaills.neonwhite.item.Card;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public abstract class ACard extends Item {
	protected int Ammo;
	protected int BaseAmmo;
	Card_type type;

	public ACard(Settings settings, int ammo, Card_type type) {
		super(settings);
		this.Ammo = ammo;
		this.type = type;
		this.BaseAmmo = Ammo;
	}

	public Card_type getType() {
		return type;
	}

	public void SameCard() {
		Ammo += BaseAmmo;
	}

	abstract protected void OnRightClick(World world, PlayerEntity user);

	abstract protected void OnLeftClick(World world, PlayerEntity user);

	abstract protected void OnPickUp(World world, PlayerEntity user);
}

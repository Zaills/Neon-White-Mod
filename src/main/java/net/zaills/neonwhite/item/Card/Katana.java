package net.zaills.neonwhite.item.Card;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Katana extends ACard {
	public Katana(Settings settings) {
		super(settings, 30, Card_type.KATANA);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		OnLeftClick(world, user);
		return TypedActionResult.pass(user.getStackInHand(hand));
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		OnPickUp(world, (PlayerEntity) entity);
		super.inventoryTick(stack, world, entity, slot, selected);
	}

	@Override
	protected void OnRightClick(World world, PlayerEntity user) {
		System.out.println("N/A");
	}

	@Override
	protected void OnLeftClick(World world, PlayerEntity user) {
		System.out.println("Horizontal katana slices. Can deflect bullets, which gives the player a small speed boost.");
	}

	@Override
	protected void OnPickUp(World world, PlayerEntity user) {
		System.out.println("N/A");
	}


}

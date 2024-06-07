package net.zaills.neonwhite.client.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

import static net.minecraft.server.command.CommandManager.literal;

public class Register_cmd {

	public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {

		dispatcher.register(literal("neonwhite")
			.executes(Register_cmd::mod_triger));
	}

	private static int mod_triger(CommandContext<ServerCommandSource> context) {
		ServerPlayerEntity player = context.getSource().getPlayer();
		return Command.SINGLE_SUCCESS;
	}
}

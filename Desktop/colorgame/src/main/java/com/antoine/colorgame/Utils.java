package com.antoine.colorgame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raphaellefebure on 23/05/2016.
 */
public class Utils {

    private static final int GRID_SIZE = 13;
    private List<Player> playerList = new ArrayList<Player>();
    private Player currentPlayer;

    public boolean checkPlayerControlled(Player player, int blockNumber) {
        return player.controlledBlocks.contains(blockNumber);
    }
    
    public void renderBlocks() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                String currentBlock = " ";
                for (Player player : playerList) {
                    if (checkPlayerControlled(player, i*j)) {
                        if (currentPlayer.id.equals(player.id))
                        currentBlock = player.color.getControlled();
                    }
                }
            }
        }
    }

}

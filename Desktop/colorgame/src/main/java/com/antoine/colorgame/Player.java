package com.antoine.colorgame;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by raphaellefebure on 23/05/2016.
 */
public class Player {

    public String id = UUID.randomUUID().toString();
    public Colors color;
    public List<Integer> controlledBlocks = new ArrayList<Integer>();

}

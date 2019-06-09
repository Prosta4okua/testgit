package io.anuke.mindustry.world.blocks;

import io.anuke.mindustry.world.meta.Attribute;

public class Attributes{
    private float[] array = new float[Attribute.values().length];

    public float get(Attribute attr){
        return array[attr.ordinal()];
    }

    public void set(Attribute attr, float value){
        array[attr.ordinal()] = value;
    }
}

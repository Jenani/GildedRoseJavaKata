package com.pbz4esilv.gildedrose;

/**
 * Created by Nadarajan on 09/10/2015.
 */
public class Sulfuras extends Item implements IQuality {
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void updateQuality() {
        setQuality(getQuality());
    }
}

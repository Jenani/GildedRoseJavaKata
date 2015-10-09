package com.pbz4esilv.gildedrose;

/**
 * Created by Nadarajan on 09/10/2015.
 */

public class BackStage extends Item implements IQuality {

    public BackStage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getQuality() < 50) setQuality(getQuality() + 1);
        if (getSellIn() < 11 && getQuality() < 50) setQuality(getQuality() + 1);
        if (getSellIn() < 6 && getQuality() < 50) setQuality(getQuality() + 1);
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0) setQuality(getQuality() - getQuality()); /**/
    }
}
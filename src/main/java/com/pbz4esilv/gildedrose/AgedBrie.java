package com.pbz4esilv.gildedrose;

/**
 * Created by Nadarajan on 09/10/2015.
 */
   public class AgedBrie extends Item implements IQuality {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateQuality(){
        if(getQuality()<50) setQuality(getQuality() + 1);
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0 && getQuality()<50) setQuality(getQuality() + 1);
    }

                }




package com.pbz4esilv.gildedrose;

/**
 * Created by Nadarajan on 09/10/2015.
 */
public class Conjured extends Item implements IQuality {
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        setQuality(getQuality() - 2);
        setSellIn(getSellIn() - 1);
        if(getSellIn() < 0) setQuality(getQuality() - 2);
        if(getQuality()<0) setQuality(getQuality() - getQuality());
    }


}

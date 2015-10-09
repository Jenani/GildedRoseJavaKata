package com.pbz4esilv.gildedrose;

/**
 * Created by Nadarajan on 09/10/2015.
 */
public class Others extends Item implements IQuality {
    public Others(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateQuality(){
        setQuality(getQuality() - 1);
        setSellIn(getSellIn() - 1);
        if(getSellIn() < 0) setQuality(getQuality() - 1);
        if(getQuality()<0) setQuality(getQuality() - getQuality());
    }
}
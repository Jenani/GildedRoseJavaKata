package com.pbz4esilv.gildedrose;

import static org.junit.Assert.*;

/**
 * Created by Nadarajan on 09/10/2015.
 */
public class InventoryTest {

        public void test(){


            Inventory i = new Items();
            if (i.GetItems != getSellIn) {
                return true ;
            } else {
                return false;
            }
        }

    }


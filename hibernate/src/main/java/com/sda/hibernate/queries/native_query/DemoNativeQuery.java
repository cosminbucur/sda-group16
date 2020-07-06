package com.sda.hibernate.queries.native_query;

import com.sda.hibernate.queries.hql.Stock;

import java.util.List;
import java.util.logging.Logger;

public class DemoNativeQuery {

    private static final Logger logger = Logger.getLogger(DemoNativeQuery.class.getName());

    public static void main(String[] args) {
        Trader trader1 = new Trader();
        trader1.setName("trader");

        Trader trader2 = new Trader();
        trader2.setName("trader2");

        TraderDao traderDao = new TraderDao();
        traderDao.create(trader1);
        traderDao.create(trader2);

        List<Stock> traders = traderDao.findAllWithNativeQuery();
        logger.info("--- all traders: " + traders);

        List filteredTraders = traderDao.findAllByNameWithNativeQuery(trader2.getName());
        logger.info("--- filtered traders: " + filteredTraders);

        // then
        // expect 2 traders
    }
}

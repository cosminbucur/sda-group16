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

        TraderDao dao = new TraderDao();
        dao.create(trader1);
        dao.create(trader2);

        List<Stock> traders = dao.findAllWithNativeQuery();
        logger.info("--- all traders: " + traders);

        List filteredTraders = dao.findAllByNameWithNativeQuery(trader2.getName());
        logger.info("--- filtered traders: " + filteredTraders);

        // then
        // expect 2 traders
    }
}

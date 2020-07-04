package com.sda.hibernate.queries.hql;

import java.util.List;
import java.util.logging.Logger;

public class DemoHqlQuery {

    private static final Logger logger = Logger.getLogger(DemoHqlQuery.class.getName());

    public static void main(String[] args) {
        // test findAllWithHqlQuery

        // given
        // save 2 stocks
        Stock stock1 = new Stock();
        stock1.setName("stock1");
        stock1.setStockCode("S0223");

        Stock stock2 = new Stock();
        stock2.setName("stock2");
        stock2.setStockCode("S0445");

        StockDao dao = new StockDao();
        dao.create(stock1);
        dao.create(stock2);

        // when
        // find all
        List<Stock> stocks = dao.findAllWithHqlQuery();
        logger.info("--- all stocks: " + stocks);

        List filteredStocks = dao.findAllByStockCodeWithNamedQuery(stock2.getStockCode());
        logger.info("--- filtered stocks: " + filteredStocks);

        // then
        // expect 2 stocks
    }
}

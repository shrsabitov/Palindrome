package mockito.stock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PortfolioTester2 {

    public static void main(String[] args) {
        Portfolio portfolio;
        StockService stockService;
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google", 10);
        Stock microsoftStock = new Stock("2","Microsoft",100);
        stocks.add(googleStock);
        stocks.add(microsoftStock);
        portfolio.setStocks(stocks);
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
        double marketValue = portfolio.getMarketValue();
        System.out.println(marketValue);
        System.out.println(stockService.getPrice(microsoftStock));

        X x = mock(X.class);





    }

}

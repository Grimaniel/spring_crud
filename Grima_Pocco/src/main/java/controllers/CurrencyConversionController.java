package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    @GetMapping("/convert")
    public ConversionResult convertCurrency(
            @RequestParam("amount") double amount,
            @RequestParam("sourceCurrency") String sourceCurrency,
            @RequestParam("targetCurrency") String targetCurrency) {

       
        double exchangeRate = 1.0;


        double convertedAmount = amount * exchangeRate;

        
        ConversionResult result = new ConversionResult();
        result.setAmount(convertedAmount);
        result.setSourceCurrency(sourceCurrency);
        result.setTargetCurrency(targetCurrency);
        result.setExchangeRate(exchangeRate);

        return result;
    }
}

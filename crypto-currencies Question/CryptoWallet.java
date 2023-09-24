public class CryptoWallet {
    // Reads the price of Bitcoin, Ethereum, and Litecoin
    // atributes
    double ethereumPrice;
    double bitcoinPrice;
    double litecoinPrice;

    // Methods
    double getEtheriumPrice(double userMoney){  
      return userMoney/ethereumPrice;
    }
    double getBitcoinPrice (double userMoney){
        return userMoney/bitcoinPrice;
    }
    double getLitecoinPrice (double userMoney){
        return userMoney/litecoinPrice;
    }
}

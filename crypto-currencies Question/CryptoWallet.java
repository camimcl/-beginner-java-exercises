public class CryptoWallet {
    // Reads the price of Bitcoin, Ethereum, and Litecoin
    // atributos

    double ethereumPrice;
    double bitcoinPrice;
    double litecoinPrice;

    // Metodos
    double getEtheriumPrice(double userMoney){  //metodo q recebe um parametro
      return userMoney/ethereumPrice;
    }
    double getBitcoinPrice (double userMoney){
        return userMoney/bitcoinPrice;
    }
    double getLitecoinPrice (double userMoney){
        return userMoney/litecoinPrice;
    }

    // attributos das moedas com o preco delas
    // tres metodos, um pra cada moeda, recebe o valor que o usuario tem (OK)
    // wallet.getHowMuchEtherium(userMoney) (OK)
}

/*
You are interested in buying crypto-currencies. You want to check the current
amount of money you have and see how many coins you can buy in Bitcoin, Ethereum,and Litecoin.
Create a program that:

Reads the total amount of money you have
Reads the price of Bitcoin, Ethereum, and Litecoin
Prints the amount of Bitcoin, Ethereum, and Litecoin you can buy
Example: money = 100, bitcoin_price = 50, ethereum_price = 25, litecoin_price = 10
Output: "With 100$ you can buy: 2 Bitcoins, 4 Ethereum, and 10 Litecoins"
 */

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CryptoWallet cryptoWallet = new CryptoWallet();

        System.out.println("Type the prices of Bitcoin: ");
        cryptoWallet.bitcoinPrice =sc.nextDouble();

        System.out.println("Type the prices of Ethereum: ");
        cryptoWallet.ethereumPrice =sc.nextDouble();

        System.out.println("Type the prices of Litecoin: ");
        cryptoWallet.litecoinPrice =sc.nextDouble();

        System.out.println("How much money do you have?");
        double userMoney = sc.nextDouble();

        System.out.println("With "+userMoney+" you can buy :\nBitcoins: "+cryptoWallet.getBitcoinPrice(userMoney)+"\nEthereum: "+cryptoWallet.getEtheriumPrice(userMoney)+"\nLitecoins: "+cryptoWallet.getLitecoinPrice(userMoney));

        System.out.println("With " + userMoney + " your can buy:");
        System.out.println(cryptoWallet.getBitcoinPrice(userMoney) + " Bitcoin(s)");
        System.out.println(cryptoWallet.getEtheriumPrice(userMoney) + " Etherium(s)");
        System.out.println(cryptoWallet.getLitecoinPrice(userMoney) + " Litecoin(s)");

    }
}
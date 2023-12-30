package com.example;

import com.example.vendingmachine.controller.VendingMachine;
import com.example.vendingmachine.controller.VendingMachineFactory;
import com.example.vendingmachine.models.Bucket;
import com.example.vendingmachine.models.enums.Coin;
import com.example.vendingmachine.models.enums.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class VendingMachineApplication {

	public static void main(String[] args) {

		SpringApplication.run(VendingMachineApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Wending machine");

		VendingMachine vendingMachine = VendingMachineFactory.createVendingMachine();

		System.out.println("Please Press 1 for Coke, 2 for Pepsi, 3 for Soka");
		int n = scanner.nextInt();
		switch (n){
			case 1 : System.out.println("Price for Coke : "+vendingMachine.selectItemAndGetPrice(Item.COKE));
				break;
			case 2 : System.out.println("Price for Pepsi : "+vendingMachine.selectItemAndGetPrice(Item.PEPSI));
				break;
			case 3 : System.out.println("Price for Soda : "+vendingMachine.selectItemAndGetPrice(Item.SODA));
				break;
			default:
				System.out.println("Please select the correct option");break;


		}
		vendingMachine.insertCoin(Coin.DIME);
		vendingMachine.insertCoin(Coin.DIME);
		vendingMachine.insertCoin(Coin.DIME);
		vendingMachine.insertCoin(Coin.QUARTER);
		Bucket bucket = vendingMachine.collectItemAndChange();

		System.out.println("Please collect " + bucket.getFirst().toString()+" and change " + bucket.getSecond());
		System.out.println("Thanks for visiting");

	}

}

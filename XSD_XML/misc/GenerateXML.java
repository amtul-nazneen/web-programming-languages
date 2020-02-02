package submit;

import java.io.File;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GenerateXML {
	public static Random myRandom;

	public static void main(String[] args) {
		myRandom = new Random();
		generateXML();
	}

	public static void generateXML() {
		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			Document doc = docBuilder.newDocument();
			Element rootStocks = doc.createElement("stocks");
			doc.appendChild(rootStocks);

			for (int i = 1; i <= 100; i++) {
				Element stock = doc.createElement("stock");
				rootStocks.appendChild(stock);

				Element tickerSymbol = doc.createElement("tickerSymbol");
				tickerSymbol.appendChild(doc.createTextNode(getTickerSymbol()));
				stock.appendChild(tickerSymbol);

				Element releaseDate = doc.createElement("releaseDate");
				releaseDate.appendChild(doc.createTextNode(getReleaseDate()));
				stock.appendChild(releaseDate);

				Element price = doc.createElement("price");
				price.appendChild(doc.createTextNode(getPrice()));
				stock.appendChild(price);

				Attr attr = doc.createAttribute("currency");
				attr.setValue("USD");
				price.setAttributeNode(attr);

				Element company = doc.createElement("company");
				stock.appendChild(company);

				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(getOrgName()));
				company.appendChild(name);

				Element totalEmployees = doc.createElement("totalEmployees");
				totalEmployees.appendChild(doc.createTextNode(getTotalEmployees()));
				company.appendChild(totalEmployees);

				Element country = doc.createElement("country");
				country.appendChild(doc.createTextNode(getCountryName()));
				company.appendChild(country);

			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(
					new File("/Users/amtulnazneen/eclipse-workspace/test/src/test/file.xml"));
			transformer.transform(source, result);
			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

	public static String getTickerSymbol() {

		String ts = "" + (char) (myRandom.nextInt(26) + 'A') + (char) (myRandom.nextInt(26) + 'a')
				+ (char) (myRandom.nextInt(26) + 'a');
		return ts.toUpperCase();

	}

	public static String getReleaseDate() {
		int month = myRandom.nextInt(12) + 1;
		int day = myRandom.nextInt(28) + 1;
		int year = 2005 + (int) Math.round(Math.random() * (2018 - 2000));
		String monthString = month < 10 ? "0" + month : String.valueOf(month);
		String dayString = day < 10 ? "0" + day : String.valueOf(day);
		return year + "-" + monthString + "-" + dayString;
	}

	public static String getPrice() {
		double randomValue = 1 + Math.random() * 100;
		double tempRes = Math.floor(randomValue * 100);
		double finalRes = tempRes / 10;
		return String.valueOf(finalRes);
	}

	public static String getTotalEmployees() {
		return String.valueOf(myRandom.nextInt(100) + 40);
	}

	public static String getCountry() {
		String country = "";
		int n = myRandom.nextInt(10) + 4;
		for (int i = 0; i < n; i++) {
			country += (char) (myRandom.nextInt(26) + 'A');
		}
		return country.toUpperCase();
	}

	public static String getName() {
		String country = "";
		int m = myRandom.nextInt(3) + 2;
		for (int j = 0; j < m; j++) {
			int n = myRandom.nextInt(7) + 4;
			for (int i = 0; i < n; i++) {
				country += (char) (myRandom.nextInt(26) + 'a');
				if (i == 0)
					country = country.toUpperCase();
			}
			country += " ";
		}
		return country.trim();
	}

	public static String getOrgName() {
		String array[] = { "Apple", "Microsoft", "Amazon", "Alphabet", "Berkshire Hathaway", "Facebook", "Alibaba",
				"Tencent Holdings", "JPMorgan Chase", "Johnson Johnson", "Visa", "ExxonMobil", "ICBC", "Walmart",
				"Bank Of America", "Nestle", "Samsung Electronics", "Procter Gamble", "Royal Dutch Shell", "Intel",
				"Cisco Systems", "Mastercard", "Verizon Communications", "Walt Disney", "AT T", "Chevron", "Home Depot",
				"China Constructionank", "Nike", "Taiwan Semiconductor", "Roche Holding", "Ping An Insurance Group",
				"Pfizer", "Wells Fargo", "Boeing" };
		int index = myRandom.nextInt(34);
		return array[index];
	}

	public static String getCountryName() {
		String countries[] = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda",
				"Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
				"Barbados", "Belarus", "Belgium" };
		int index = myRandom.nextInt(16);
		return countries[index].toUpperCase();
	}
}

import java.util.ArrayList;
import java.util.List;

class Country {
    private String name;
    private String capital;
    private int population; // Population in millions
    private String currency;

    public Country(String name, String capital, int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format("Country: %-25s Capital: %-15s Population: %-3dM Currency: %-20s",
                name, capital, population, currency);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        // Middle Eastern countries
        countries.add(new Country("Bahrain", "Manama", 2, "Bahraini Dinar"));
        countries.add(new Country("Cyprus", "Nicosia", 1, "Euro"));
        countries.add(new Country("Egypt", "Cairo", 102, "Egyptian Pound"));
        countries.add(new Country("Iran", "Tehran", 83, "Iranian Rial"));
        countries.add(new Country("Iraq", "Baghdad", 40, "Iraqi Dinar"));
        countries.add(new Country("Israel", "Jerusalem", 9, "Israeli New Shekel"));
        countries.add(new Country("Jordan", "Amman", 10, "Jordanian Dinar"));
        countries.add(new Country("Kuwait", "Kuwait City", 4, "Kuwaiti Dinar"));
        countries.add(new Country("Lebanon", "Beirut", 7, "Lebanese Pound"));
        countries.add(new Country("Oman", "Muscat", 5, "Omani Rial"));
        countries.add(new Country("Palestine", "Ramallah", 5, "Israeli New Shekel / Jordanian Dinar"));
        countries.add(new Country("Qatar", "Doha", 3, "Qatari Riyal"));
        countries.add(new Country("Saudi Arabia", "Riyadh", 35, "Saudi Riyal"));
        countries.add(new Country("Syria", "Damascus", 17, "Syrian Pound"));
        countries.add(new Country("Turkey", "Ankara", 82, "Turkish Lira"));
        countries.add(new Country("United Arab Emirates", "Abu Dhabi", 10, "UAE Dirham"));
        countries.add(new Country("Yemen", "Sana'a", 30, "Yemeni Rial"));

        // African countries
        countries.add(new Country("Algeria", "Algiers", 44, "Algerian Dinar"));
        countries.add(new Country("Angola", "Luanda", 33, "Angolan Kwanza"));
        countries.add(new Country("Benin", "Porto-Novo", 12, "West African CFA Franc"));
        countries.add(new Country("Botswana", "Gaborone", 2, "Botswana Pula"));
        countries.add(new Country("Burkina Faso", "Ouagadougou", 20, "West African CFA Franc"));
        countries.add(new Country("Burundi", "Gitega", 12, "Burundian Franc"));
        countries.add(new Country("Cabo Verde", "Praia", 0, "Cape Verdean Escudo"));
        countries.add(new Country("Cameroon", "Yaoundé", 26, "Central African CFA Franc"));
        countries.add(new Country("Central African Republic", "Bangui", 5, "Central African CFA Franc"));
        countries.add(new Country("Chad", "N'Djamena", 16, "Central African CFA Franc"));
        countries.add(new Country("Comoros", "Moroni", 1, "Comorian Franc"));
        countries.add(new Country("Democratic Republic of the Congo", "Kinshasa", 89, "Congolese Franc"));
        countries.add(new Country("Republic of the Congo", "Brazzaville", 5, "Central African CFA Franc"));
        countries.add(new Country("Djibouti", "Djibouti", 1, "Djiboutian Franc"));
        countries.add(new Country("Equatorial Guinea", "Malabo", 1, "Central African CFA Franc"));
        countries.add(new Country("Eritrea", "Asmara", 3, "Eritrean Nakfa"));
        countries.add(new Country("Eswatini", "Mbabane", 1, "Swazi Lilangeni"));
        countries.add(new Country("Ethiopia", "Addis Ababa", 114, "Ethiopian Birr"));
        countries.add(new Country("Gabon", "Libreville", 2, "Central African CFA Franc"));
        countries.add(new Country("Gambia", "Banjul", 2, "Gambian Dalasi"));
        countries.add(new Country("Ghana", "Accra", 31, "Ghanaian Cedi"));
        countries.add(new Country("Guinea", "Conakry", 13, "Guinean Franc"));
        countries.add(new Country("Guinea-Bissau", "Bissau", 2, "West African CFA Franc"));
        countries.add(new Country("Ivory Coast", "Yamoussoukro", 26, "West African CFA Franc"));
        countries.add(new Country("Kenya", "Nairobi", 54, "Kenyan Shilling"));
        countries.add(new Country("Lesotho", "Maseru", 2, "Lesotho Loti"));
        countries.add(new Country("Liberia", "Monrovia", 5, "Liberian Dollar"));
        countries.add(new Country("Libya", "Tripoli", 7, "Libyan Dinar"));
        countries.add(new Country("Madagascar", "Antananarivo", 27, "Malagasy Ariary"));
        countries.add(new Country("Malawi", "Lilongwe", 19, "Malawian Kwacha"));
        countries.add(new Country("Mali", "Bamako", 20, "West African CFA Franc"));
        countries.add(new Country("Mauritania", "Nouakchott", 4, "Mauritanian Ouguiya"));
        countries.add(new Country("Mauritius", "Port Louis", 1, "Mauritian Rupee"));
        countries.add(new Country("Morocco", "Rabat", 37, "Moroccan Dirham"));
        countries.add(new Country("Mozambique", "Maputo", 31, "Mozambican Metical"));
        countries.add(new Country("Namibia", "Windhoek", 3, "Namibian Dollar"));
        countries.add(new Country("Niger", "Niamey", 24, "West African CFA Franc"));
        countries.add(new Country("Nigeria", "Abuja", 206, "Nigerian Naira"));
        countries.add(new Country("Rwanda", "Kigali", 13, "Rwandan Franc"));
        countries.add(new Country("São Tomé and Príncipe", "São Tomé", 0, "São Tomé and Príncipe Dobra"));
        countries.add(new Country("Senegal", "Dakar", 16, "West African CFA Franc"));
        countries.add(new Country("Seychelles", "Victoria", 0, "Seychellois Rupee"));
        countries.add(new Country("Sierra Leone", "Freetown", 8, "Sierra Leonean Leone"));
        countries.add(new Country("Somalia", "Mogadishu", 16, "Somali Shilling"));
        countries.add(new Country("South Africa", "Pretoria", 59, "South African Rand"));
        countries.add(new Country("South Sudan", "Juba", 11, "South Sudanese Pound"));
        countries.add(new Country("Sudan", "Khartoum", 44, "Sudanese Pound"));
        countries.add(new Country("Tanzania", "Dodoma", 59, "Tanzanian Shilling"));
        countries.add(new Country("Togo", "Lomé", 8, "West African CFA Franc"));
        countries.add(new Country("Tunisia", "Tunis", 12, "Tunisian Dinar"));
        countries.add(new Country("Uganda", "Kampala", 45, "Ugandan Shilling"));
        countries.add(new Country("Zambia", "Lusaka", 18, "Zambian Kwacha"));
        countries.add(new Country("Zimbabwe", "Harare", 15, "Zimbabwean Dollar"));

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}

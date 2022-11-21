import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class PracticeJSON {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException{

        JSONParser jsonParser = new JSONParser();

        FileReader fileReader = new FileReader("C:\\Users\\stefa\\IdeaProjects\\JSON\\out\\JSON NEW\\angajati.json");

        Object obj = jsonParser.parse(fileReader);

        JSONObject empJSON = (JSONObject) obj;

        String firstName = (String) empJSON.get("firstName");
        System.out.println("firstName: " + firstName);

        JSONArray array = (JSONArray) empJSON.get("address");
        for (int i = 0; i < array.size(); i++){
            JSONObject address = (JSONObject) array.get(i);
            String street = (String) address.get("street");
            System.out.println("Street " + i + " " + street);
        }
    }
}

/*// write a JSON file
// creating JSON object
        JSONObject jo = new JSONObject();

        // putting data into JSONobject
        jo.put("firstName","John");
        jo.put("lastName","Smith");
        jo.put("age",25);

        // for adress data, first create a linkedHashMan
        Map m = new LinkedHashMap(4);
        m.put("street adress", "Postalionului");
        m.put("city", "Bucharest");
        m.put("country", "Romania");
        m.put("posta code", 40452);

        // putting adress into JSON object
        jo.put("adress",m);

        // for phone number first create a JSON array
        JSONArray ja = new JSONArray();

        m = new LinkedHashMap(2);
        m.put("type","home");
        m.put("number","0770512115");

        ja.add(m);

        m = new LinkedHashMap(2);
        m.put("type","fax");
        m.put("number","11522");

        ja.add(m);

        // putting phoneNumbers into JSON file
        jo.put("phoneNumbers",ja);

        // writing JSON to file: "JSONexample.json" in cwd
        PrintWriter pw = new PrintWriter("JSONexample.json");
        pw.write(jo.toJSONString());

        pw.flush();
        pw.close();*/




/*
    // parsing file JSONexample.json
    Object obj = new JSONParser().parse(new FileReader("JSONexample.json"));

    // typecasting obj to JSONobject
    JSONObject jo = (JSONObject) obj;

    // getting first name and lastname
    String firstName = (String) jo.get("firstName");
    String lastName = (String) jo.get("lastName");

        System.out.println(firstName);
                System.out.println(lastName);

     // getting age
     long age = (long) jo.get("age");
     System.out.println(age);

     // getting adress
     Map address = (Map) jo.get("adress");
     Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
        Map.Entry pair = itr1.next();
        System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");

        /// iterating phoneNumbers
        Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
        itr1 = ((Map) itr2.next()).entrySet().iterator();
        while (itr1.hasNext()) {
        Map.Entry pair = itr1.next();
        System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        }*/



/*// read a JSON file

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        // parsing file JSONexample.json
        Object obj = new JSONParser().parse(new FileReader("JSONexample.json"));

        // typecasting obj to JSONobject
        JSONObject jo = (JSONObject) obj;

        // getting first name and lastname
        String firstName = (String) jo.get("firstName");
        String lastName = (String) jo.get("lastName");

        System.out.println(firstName);
        System.out.println(lastName);

        // getting age
        long age = (long) jo.get("age");
        System.out.println(age);

        // getting adress
        JSONObject jsonAdress = (JSONObject) jo.get("adress");
        System.out.println("Adress: ");

        String streetAdress = (String) jsonAdress.get("street adress");
        System.out.println("Street adress: " + streetAdress);

        long postalCode = (long) jsonAdress.get("posta code");
        System.out.println("Postal code: " + postalCode);

        String city = (String) jsonAdress.get("city");
        System.out.println("City: " + city);

        String country = (String) jsonAdress.get("country");
        System.out.println("Country: " + country);

        // getting phoneNumbers
        JSONArray jsonArray = (JSONArray) jo.get("phoneNumbers");
        System.out.println("Phone numbers: ");
        for (int i = 0; i < jsonArray.size(); i++){
            JSONObject jsonPhone = (JSONObject) jsonArray.get(i);
            String type = (String) jsonPhone.get("type");
            System.out.println("Type: " + type);
            String number = (String) jsonPhone.get("number");
            System.out.println("Number: " + number);
        }*/

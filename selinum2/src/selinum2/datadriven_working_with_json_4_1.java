package selinum2;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class datadriven_working_with_json_4_1 {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		FileReader rea=new FileReader("./foldernamedataupload/workingwithjson.json");
		JSONParser par=new JSONParser();
		Object obj=par.parse(rea);
		JSONObject jobj=(JSONObject)obj;
		
		
		Object value=jobj.get("Stream");
		System.out.println(value);
		
		JSONArray arr=(JSONArray)value;
		System.out.println(arr.get(0));
		
		JSONObject obj1=(JSONObject)arr.get(1);
		System.out.println(obj1.get("CS"));  
		/*******op***********
		 
		  [{"IT":true},{"CS":false}]
			{"IT":true}
			false
			
			
			*/
		
	/*	
	Object obj2=jobj.get("Depart");
	System.out.println(obj2);
	
	JSONObject jobj2=(JSONObject)obj2;
	System.out.println(jobj2.get("Dept"));*/
	
	/*******op***********
	 
	  {"Dept":"IT"}
		IT
		
		
		*/
	 

	}

}
